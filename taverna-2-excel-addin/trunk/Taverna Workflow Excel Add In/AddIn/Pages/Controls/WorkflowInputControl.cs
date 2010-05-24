using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Excel = Microsoft.Office.Interop.Excel;
using System.IO;
using System.Text.RegularExpressions;
using Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes;
using System.Resources;

namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages.Controls
{
    public partial class WorkflowInputControl : UserControl
    {
        WorkflowInput input;
        Dictionary<TreeNode, Value> dictNodes;
        bool CanEditValue = false;
        string[] Sheets;

        public WorkflowInputControl(WorkflowInput input)
        {
            InitializeComponent();
            this.input = input;
            dictNodes = new Dictionary<TreeNode, Value>();
            // Get Sheet names
            Excel.Workbook wb = Globals.ThisAddIn.Application.ActiveWorkbook;
            Sheets = new string[wb.Worksheets.Count];
            for (int i = 0; i < Sheets.Length; i++)
                Sheets[i] = ((Excel.Worksheet)wb.Worksheets.get_Item(i + 1)).Name;
            cmbSheets.Items.AddRange(Sheets);
            cmbSheets.SelectedIndex = 0;
        }

        private void WorkflowInputControl_Load(object sender, EventArgs e)
        {
            // Set Description and Example
            if (input.Description == null && input.Example == null)
            {
                // Remove desc and example bit
                flowTopPanel.Controls.Remove(groupBoxDescription);
                flowTopPanel.Controls.Remove(groupBoxExample);
            }
            else
            {
                if (input.Description == null)
                    lblDescription.Text = "No description available.";
                else
                    lblDescription.Text = input.Description;
                if (input.Example.Count == 0)
                    lblExample.Text = "No example available";
                else
                    foreach (string example in input.Example)
                        lblExample.Text += example + Environment.NewLine;
            }

            InitTreeView();

            splitMain.SplitterDistance = flowTopPanel.Height;
        }

        private void WorkflowInputControl_Resize(object sender, EventArgs e)
        {
            splitMain.SplitterDistance = flowTopPanel.Height;
        }

        #region Tree View Methods

        private void InitTreeView()
        {
            // Root node
            TreeNode root = new TreeNode(input.Name);
            root.Tag = "root";
            root.ImageIndex = 0;
            root.SelectedImageIndex = 2;
            treeViewValues.Nodes.Clear();
            treeViewValues.Nodes.Add(root);

            // If single value
            if (input.Depth == 0)
            {
                btnDeleteNode.Visible = btnNewValue.Visible = btnAddList.Visible = false;
                TreeNode node = AddValueNode(root);
                treeViewValues.SelectedNode = node;
            }

            // if list
            if (input.Depth > 0)
            {
                TreeNode parent = root;
                for (int i = 0; i < input.Depth; i++)
                {
                    TreeNode child = AddListNode(parent);
                    parent = child;
                }
                treeViewValues.SelectedNode = parent;
            }

            treeViewValues.ExpandAll();
        }

        private TreeNode AddListNode(TreeNode parent)
        {
            TreeNode node = new TreeNode("List");
            node.Tag = "list";
            node.ImageIndex = 0;
            node.SelectedImageIndex = 2;
            parent.Nodes.Add(node);
            parent.ExpandAll();
            treeViewValues.SelectedNode = node;
            return node;
        }

        private TreeNode AddValueNode(TreeNode parent)
        {
            TreeNode node = new TreeNode("Value");
            node.Tag = "value";
            node.ImageIndex = 1;
            node.SelectedImageIndex = 2;
            parent.Nodes.Add(node);
            parent.ExpandAll();

            dictNodes.Add(node, new Value());
            treeViewValues.SelectedNode = node;

            return node;
        }

        private void DeleteNode(TreeNode node)
        {
            // If value
            if (node.Tag.Equals("value"))
                dictNodes.Remove(node);
            // If list
            else
                foreach (TreeNode child in node.Nodes)
                    DeleteNode(child);
            node.Remove();
        }

        private void treeViewValues_AfterSelect(object sender, TreeViewEventArgs e)
        {
            // If null
            if (e.Node == null)
            {
                btnDeleteNode.Enabled = btnAddList.Enabled = btnNewValue.Enabled = false;
                DisableValueBox();
            }

            // If root
            if (e.Node.Tag.Equals("root"))
            {
                btnDeleteNode.Enabled = false;
                btnAddList.Enabled = !NodeContainsValues(e.Node);
                btnNewValue.Enabled = !NodeContainsList(e.Node);
                DisableValueBox();
            }

            // If value
            if (e.Node.Tag.Equals("value"))
            {
                btnDeleteNode.Enabled = true;
                btnAddList.Enabled = btnNewValue.Enabled = false;
                EnableValueBox(dictNodes[e.Node]);
            }

            // If list
            if (e.Node.Tag.Equals("list"))
            {
                btnDeleteNode.Enabled = true;
                btnAddList.Enabled = !NodeContainsValues(e.Node) && GetDepth(e.Node) < input.Depth;
                btnNewValue.Enabled = !NodeContainsList(e.Node);
                DisableValueBox();
            }
        }

        private bool NodeContainsList(TreeNode node)
        {
            foreach (TreeNode child in node.Nodes)
                if (child.Tag.Equals("list"))
                    return true;
            return false;
        }

        private bool NodeContainsValues(TreeNode node)
        {
            foreach (TreeNode child in node.Nodes)
                if (child.Tag.Equals("value"))
                    return true;
            return false;
        }

        private bool NodeContainsRange(TreeNode node)
        {
            try
            {
                return dictNodes[node].IsRange;
               /* if (NodeContainsValues(node))
                    foreach (TreeNode child in node.Nodes)
                        if (dictNodes[child].IsRange)
                            return true;*/
            }
            catch { }
            return false;
        }

        private int GetDepth(TreeNode node)
        {
            int depth = 1;
            TreeNode parent = node.Parent;
            while (parent != null)
            {
                depth++;
                parent = parent.Parent;
            }

            if ((string)node.Tag == "value")
                depth--;

            return depth;
        }

        #endregion

        #region Button Handlers

        private void btnDeleteNode_Click(object sender, EventArgs e)
        {
            DeleteNode(treeViewValues.SelectedNode);
        }

        private void btnNewValue_Click(object sender, EventArgs e)
        {
            AddValueNode(treeViewValues.SelectedNode);
        }

        private void btnAddList_Click(object sender, EventArgs e)
        {
            AddListNode(treeViewValues.SelectedNode);
        }

        #endregion

        #region Value Box Methods

        private void DisableValueBox()
        {
            CanEditValue = false;
            splitValues.Panel2.Enabled = false;
        }

        private void EnableValueBox(Value value)
        {
            splitValues.Panel2.Enabled = true;
            // Check the right box
            switch (value.type)
            {
                case Value.Type.Cells: radCells.Checked = true;
                    break;
                case Value.Type.File: radFile.Checked = true;
                    break;
                case Value.Type.Value: radValue.Checked = true;
                    break;
            }
            EnableCorrectInputBox(value);
            FillInCorrectInputBox(value);

            CanEditValue = true;
        }

        private void EnableCorrectInputBox(Value value)
        {
            bool OldCanEditValue = CanEditValue;
            CanEditValue = false;
            txtValue.Enabled = txtFile.Enabled = btnBrowse.Enabled =
                cmbSheets.Enabled = txtStartCell.Enabled =
                lblColon.Visible = txtEndCell.Visible = false;
            txtValue.Text = txtStartCell.Text = txtEndCell.Text = txtFile.Text = "";
            switch (value.type)
            {
                case Value.Type.Value: txtValue.Enabled = true;
                    break;
                case Value.Type.File: txtFile.Enabled = btnBrowse.Enabled = true;
                    break;
                case Value.Type.Cells: cmbSheets.Enabled = txtStartCell.Enabled = true;
                    lblColon.Visible = txtEndCell.Visible =
                        input.Depth > 0 &&
                        treeViewValues.SelectedNode.Parent.Nodes.Count == 1;
                    break;
            }
            CanEditValue = OldCanEditValue;
        }

        private void FillInCorrectInputBox(Value value)
        {
            bool OldCanEditValue = CanEditValue;
            CanEditValue = false;
            switch (value.type)
            {
                case Value.Type.Value:
                    txtValue.Text = value.value;
                    break;
                case Value.Type.File:
                    txtFile.Text = value.value;
                    break;
                case Value.Type.Cells:
                    cmbSheets.SelectedItem = value.sheet;
                    txtStartCell.Text = value.startCell;
                    txtEndCell.Text = value.endCell;
                    break;
            }
            CanEditValue = OldCanEditValue;
        }

        private void txtValue_TextChanged(object sender, EventArgs e)
        {
            if (CanEditValue)
                dictNodes[treeViewValues.SelectedNode].value = txtValue.Text;
        }

        private void radioButton_CheckedChanged(object sender, EventArgs e)
        {
            if (CanEditValue)
            {
                RadioButton rad = (RadioButton)sender;
                Value value = dictNodes[treeViewValues.SelectedNode];
                if (rad == radCells)
                    value.type = Value.Type.Cells;
                else if (rad == radFile)
                    value.type = Value.Type.File;
                else if (rad == radValue)
                    value.type = Value.Type.Value;
                EnableCorrectInputBox(value);
                FillInCorrectInputBox(value);
            }
        }

        private void cellsValue_changed(object sender, EventArgs e)
        {
            if (CanEditValue)
            {
                Value value = dictNodes[treeViewValues.SelectedNode];
                value.sheet = (string)cmbSheets.SelectedItem;
                value.startCell = txtStartCell.Text;
                value.endCell = txtEndCell.Text;
            }
        }

        private void btnBrowse_Click(object sender, EventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog();
            if (ofd.ShowDialog() == DialogResult.OK)
                txtFile.Text = ofd.FileName;
        }

        private void txtFile_TextChanged(object sender, EventArgs e)
        {
            if (CanEditValue)
                dictNodes[treeViewValues.SelectedNode].value = txtFile.Text;
        }

        #endregion

        public string ValidateInput()
        {
            foreach (Value value in dictNodes.Values)
            {
                string return_value = Validate(value);
                if (return_value != null)
                    return return_value;
            }
            return Validate(treeViewValues.Nodes[0]);
        }

        private string Validate(Value value)
        {
            string return_value = null;

            // Plain value
            if (value.type == Value.Type.Value)
            {
                // Null or empty string
                if (value.value == null || value.value == "")
                    return_value = "Value missing";
            }

            // File
            if (value.type == Value.Type.File)
            {
                // Null or empty string
                if (value.value == null || value.value == "")
                    return_value = "Filename missing";
                // No access
                else try { File.OpenRead(value.value); }
                    catch (IOException)
                    {
                        return_value = "Can't open file: " + value.value;
                    }
            }

            // Cells
            if (value.type == Value.Type.Cells)
            {
                // Null or empty string
                if (value.sheet == null || value.sheet == "")
                    return_value = "Sheet name missing";
                if (value.startCell == null || value.startCell == "")
                    return_value = "Starting cell missing";
                // Invalid Cell reference
                if (!CellReference.Validate(value.startCell))
                    return_value = "Invalid starting cell";
                if (!CellReference.Validate(value.endCell))
                    return_value = "Invalid ending cell";
            }

            return return_value;
        }

        private string Validate(TreeNode node)
        {
            if (node.Tag.Equals("list") && node.Nodes.Count == 0)
                return "Empty list found.";
            string retVal = null;
            foreach (TreeNode child in node.Nodes)
            {
                retVal = Validate(child);
                if (retVal != null)
                    return retVal;
            }
            return retVal;
        }

        public DataValue Data
        {
            get
            {
                DataValue value = GetDataValueFromNodes(treeViewValues.Nodes[0]);
                return value;
            }
        }

        private DataValue GetDataValueFromNodes(TreeNode node)
        {
            DataValue value = new DataValue();
            if (node.Tag.Equals("value"))
                value.Value = dictNodes[node].ActualValue;
            else if (node.Tag.Equals("root") && NodeContainsValues(node))
                value = GetDataValueFromNodes(node.Nodes[0]);
            else if (node.Tag.Equals("root") && NodeContainsList(node) && node.Nodes.Count == 1)
                value = GetDataValueFromNodes(node.Nodes[0]);
            else
                foreach (TreeNode child in node.Nodes)
                {
                    if (NodeContainsRange(child))
                    {
                        string[,] range = CellReference.GetRange(
                            dictNodes[child].startCell,
                            dictNodes[child].endCell);
                        foreach (string cellRef in range)
                        {
                            DataValue subValue = new DataValue();
                            subValue.Value = CellReference.GetValue(dictNodes[child].sheet, cellRef);
                            value.list.Add(subValue);
                        }
                    }
                    else
                        value.list.Add(GetDataValueFromNodes(child));
                }
            return value;
        }

        private class Value
        {
            public enum Type { Value, Cells, File}
            public Type type = Type.Value;
            public string value = "";
            public string sheet = "";
            public string startCell = "";
            public string endCell = "";
            public bool IsRange
            {
                get
                {
                    return !endCell.Trim().Equals("");
                }
            }

            public string ActualValue
            {
                get
                {
                    string retVal = "";
                    switch (type)
                    {
                        case Type.Value: retVal = value;
                            break;
                        case Type.File:
                            TextReader reader = File.OpenText(value);
                            string buffer = null;
                            while ((buffer = reader.ReadLine()) != null)
                                retVal += buffer;
                            reader.Close();
                            break;
                        case Type.Cells:
                            retVal = CellReference.GetValue(sheet, startCell);
                            break;
                    }
                    return retVal;
                }
            }
        }
    }
}
