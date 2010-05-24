namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages.Controls
{
    partial class WorkflowInputControl : System.Windows.Forms.UserControl
    {
        /// <summary> 
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(WorkflowInputControl));
            this.flowTopPanel = new System.Windows.Forms.FlowLayoutPanel();
            this.groupBoxDescription = new System.Windows.Forms.GroupBox();
            this.lblDescription = new System.Windows.Forms.Label();
            this.groupBoxExample = new System.Windows.Forms.GroupBox();
            this.lblExample = new System.Windows.Forms.Label();
            this.flowButtons = new System.Windows.Forms.FlowLayoutPanel();
            this.btnDeleteNode = new System.Windows.Forms.Button();
            this.btnNewValue = new System.Windows.Forms.Button();
            this.btnAddList = new System.Windows.Forms.Button();
            this.splitValues = new System.Windows.Forms.SplitContainer();
            this.treeViewValues = new System.Windows.Forms.TreeView();
            this.imgBullets = new System.Windows.Forms.ImageList(this.components);
            this.btnBrowse = new System.Windows.Forms.Button();
            this.lblColon = new System.Windows.Forms.Label();
            this.cmbSheets = new System.Windows.Forms.ComboBox();
            this.txtFile = new System.Windows.Forms.TextBox();
            this.txtEndCell = new System.Windows.Forms.TextBox();
            this.txtStartCell = new System.Windows.Forms.TextBox();
            this.txtValue = new System.Windows.Forms.TextBox();
            this.radFile = new System.Windows.Forms.RadioButton();
            this.radCells = new System.Windows.Forms.RadioButton();
            this.radValue = new System.Windows.Forms.RadioButton();
            this.splitMain = new System.Windows.Forms.SplitContainer();
            this.flowTopPanel.SuspendLayout();
            this.groupBoxDescription.SuspendLayout();
            this.groupBoxExample.SuspendLayout();
            this.flowButtons.SuspendLayout();
            this.splitValues.Panel1.SuspendLayout();
            this.splitValues.Panel2.SuspendLayout();
            this.splitValues.SuspendLayout();
            this.splitMain.Panel1.SuspendLayout();
            this.splitMain.Panel2.SuspendLayout();
            this.splitMain.SuspendLayout();
            this.SuspendLayout();
            // 
            // flowTopPanel
            // 
            this.flowTopPanel.AutoSize = true;
            this.flowTopPanel.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.flowTopPanel.Controls.Add(this.groupBoxDescription);
            this.flowTopPanel.Controls.Add(this.groupBoxExample);
            this.flowTopPanel.Controls.Add(this.flowButtons);
            this.flowTopPanel.FlowDirection = System.Windows.Forms.FlowDirection.TopDown;
            this.flowTopPanel.Location = new System.Drawing.Point(3, 3);
            this.flowTopPanel.Name = "flowTopPanel";
            this.flowTopPanel.Size = new System.Drawing.Size(249, 111);
            this.flowTopPanel.TabIndex = 0;
            // 
            // groupBoxDescription
            // 
            this.groupBoxDescription.AutoSize = true;
            this.groupBoxDescription.Controls.Add(this.lblDescription);
            this.groupBoxDescription.Location = new System.Drawing.Point(3, 3);
            this.groupBoxDescription.MinimumSize = new System.Drawing.Size(100, 0);
            this.groupBoxDescription.Name = "groupBoxDescription";
            this.groupBoxDescription.Size = new System.Drawing.Size(100, 32);
            this.groupBoxDescription.TabIndex = 0;
            this.groupBoxDescription.TabStop = false;
            this.groupBoxDescription.Text = "Port Description";
            // 
            // lblDescription
            // 
            this.lblDescription.AutoSize = true;
            this.lblDescription.Dock = System.Windows.Forms.DockStyle.Fill;
            this.lblDescription.Location = new System.Drawing.Point(3, 16);
            this.lblDescription.Name = "lblDescription";
            this.lblDescription.Size = new System.Drawing.Size(0, 13);
            this.lblDescription.TabIndex = 0;
            // 
            // groupBoxExample
            // 
            this.groupBoxExample.AutoSize = true;
            this.groupBoxExample.Controls.Add(this.lblExample);
            this.groupBoxExample.Location = new System.Drawing.Point(3, 41);
            this.groupBoxExample.MinimumSize = new System.Drawing.Size(100, 0);
            this.groupBoxExample.Name = "groupBoxExample";
            this.groupBoxExample.Size = new System.Drawing.Size(100, 32);
            this.groupBoxExample.TabIndex = 1;
            this.groupBoxExample.TabStop = false;
            this.groupBoxExample.Text = "Port Example";
            // 
            // lblExample
            // 
            this.lblExample.AutoSize = true;
            this.lblExample.Dock = System.Windows.Forms.DockStyle.Fill;
            this.lblExample.Location = new System.Drawing.Point(3, 16);
            this.lblExample.Name = "lblExample";
            this.lblExample.Size = new System.Drawing.Size(0, 13);
            this.lblExample.TabIndex = 0;
            // 
            // flowButtons
            // 
            this.flowButtons.AutoSize = true;
            this.flowButtons.Controls.Add(this.btnDeleteNode);
            this.flowButtons.Controls.Add(this.btnNewValue);
            this.flowButtons.Controls.Add(this.btnAddList);
            this.flowButtons.Location = new System.Drawing.Point(3, 79);
            this.flowButtons.Name = "flowButtons";
            this.flowButtons.Size = new System.Drawing.Size(243, 29);
            this.flowButtons.TabIndex = 2;
            // 
            // btnDeleteNode
            // 
            this.btnDeleteNode.Enabled = false;
            this.btnDeleteNode.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnDeleteNode.Location = new System.Drawing.Point(3, 3);
            this.btnDeleteNode.Name = "btnDeleteNode";
            this.btnDeleteNode.Size = new System.Drawing.Size(75, 23);
            this.btnDeleteNode.TabIndex = 0;
            this.btnDeleteNode.Text = "Delete Node";
            this.btnDeleteNode.UseVisualStyleBackColor = true;
            this.btnDeleteNode.Click += new System.EventHandler(this.btnDeleteNode_Click);
            // 
            // btnNewValue
            // 
            this.btnNewValue.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnNewValue.Location = new System.Drawing.Point(84, 3);
            this.btnNewValue.Name = "btnNewValue";
            this.btnNewValue.Size = new System.Drawing.Size(75, 23);
            this.btnNewValue.TabIndex = 1;
            this.btnNewValue.Text = "New Value";
            this.btnNewValue.UseVisualStyleBackColor = true;
            this.btnNewValue.Click += new System.EventHandler(this.btnNewValue_Click);
            // 
            // btnAddList
            // 
            this.btnAddList.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnAddList.Location = new System.Drawing.Point(165, 3);
            this.btnAddList.Name = "btnAddList";
            this.btnAddList.Size = new System.Drawing.Size(75, 23);
            this.btnAddList.TabIndex = 4;
            this.btnAddList.Text = "Add List";
            this.btnAddList.UseVisualStyleBackColor = true;
            this.btnAddList.Click += new System.EventHandler(this.btnAddList_Click);
            // 
            // splitValues
            // 
            this.splitValues.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitValues.Location = new System.Drawing.Point(0, 0);
            this.splitValues.Name = "splitValues";
            // 
            // splitValues.Panel1
            // 
            this.splitValues.Panel1.Controls.Add(this.treeViewValues);
            // 
            // splitValues.Panel2
            // 
            this.splitValues.Panel2.Controls.Add(this.btnBrowse);
            this.splitValues.Panel2.Controls.Add(this.lblColon);
            this.splitValues.Panel2.Controls.Add(this.cmbSheets);
            this.splitValues.Panel2.Controls.Add(this.txtFile);
            this.splitValues.Panel2.Controls.Add(this.txtEndCell);
            this.splitValues.Panel2.Controls.Add(this.txtStartCell);
            this.splitValues.Panel2.Controls.Add(this.txtValue);
            this.splitValues.Panel2.Controls.Add(this.radFile);
            this.splitValues.Panel2.Controls.Add(this.radCells);
            this.splitValues.Panel2.Controls.Add(this.radValue);
            this.splitValues.Size = new System.Drawing.Size(774, 255);
            this.splitValues.SplitterDistance = 258;
            this.splitValues.TabIndex = 3;
            // 
            // treeViewValues
            // 
            this.treeViewValues.Dock = System.Windows.Forms.DockStyle.Fill;
            this.treeViewValues.ImageIndex = 0;
            this.treeViewValues.ImageList = this.imgBullets;
            this.treeViewValues.Location = new System.Drawing.Point(0, 0);
            this.treeViewValues.Name = "treeViewValues";
            this.treeViewValues.SelectedImageIndex = 2;
            this.treeViewValues.Size = new System.Drawing.Size(258, 255);
            this.treeViewValues.TabIndex = 0;
            this.treeViewValues.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this.treeViewValues_AfterSelect);
            // 
            // imgBullets
            // 
            this.imgBullets.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("imgBullets.ImageStream")));
            this.imgBullets.TransparentColor = System.Drawing.Color.Transparent;
            this.imgBullets.Images.SetKeyName(0, "green.png");
            this.imgBullets.Images.SetKeyName(1, "red.png");
            this.imgBullets.Images.SetKeyName(2, "yellow.png");
            // 
            // btnBrowse
            // 
            this.btnBrowse.Location = new System.Drawing.Point(179, 124);
            this.btnBrowse.Name = "btnBrowse";
            this.btnBrowse.Size = new System.Drawing.Size(75, 23);
            this.btnBrowse.TabIndex = 12;
            this.btnBrowse.Text = "Browse...";
            this.btnBrowse.UseVisualStyleBackColor = true;
            this.btnBrowse.Click += new System.EventHandler(this.btnBrowse_Click);
            // 
            // lblColon
            // 
            this.lblColon.AutoSize = true;
            this.lblColon.Location = new System.Drawing.Point(187, 79);
            this.lblColon.Name = "lblColon";
            this.lblColon.Size = new System.Drawing.Size(10, 13);
            this.lblColon.TabIndex = 11;
            this.lblColon.Text = ":";
            // 
            // cmbSheets
            // 
            this.cmbSheets.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbSheets.FormattingEnabled = true;
            this.cmbSheets.Location = new System.Drawing.Point(4, 76);
            this.cmbSheets.Name = "cmbSheets";
            this.cmbSheets.Size = new System.Drawing.Size(120, 21);
            this.cmbSheets.TabIndex = 10;
            this.cmbSheets.SelectedIndexChanged += new System.EventHandler(this.cellsValue_changed);
            // 
            // txtFile
            // 
            this.txtFile.Location = new System.Drawing.Point(3, 126);
            this.txtFile.Name = "txtFile";
            this.txtFile.Size = new System.Drawing.Size(170, 20);
            this.txtFile.TabIndex = 8;
            this.txtFile.TextChanged += new System.EventHandler(this.txtFile_TextChanged);
            // 
            // txtEndCell
            // 
            this.txtEndCell.Location = new System.Drawing.Point(202, 76);
            this.txtEndCell.Name = "txtEndCell";
            this.txtEndCell.Size = new System.Drawing.Size(52, 20);
            this.txtEndCell.TabIndex = 7;
            this.txtEndCell.TextChanged += new System.EventHandler(this.cellsValue_changed);
            // 
            // txtStartCell
            // 
            this.txtStartCell.Location = new System.Drawing.Point(130, 76);
            this.txtStartCell.Name = "txtStartCell";
            this.txtStartCell.Size = new System.Drawing.Size(51, 20);
            this.txtStartCell.TabIndex = 6;
            this.txtStartCell.TextChanged += new System.EventHandler(this.cellsValue_changed);
            // 
            // txtValue
            // 
            this.txtValue.Location = new System.Drawing.Point(4, 27);
            this.txtValue.Name = "txtValue";
            this.txtValue.Size = new System.Drawing.Size(250, 20);
            this.txtValue.TabIndex = 5;
            this.txtValue.TextChanged += new System.EventHandler(this.txtValue_TextChanged);
            // 
            // radFile
            // 
            this.radFile.AutoSize = true;
            this.radFile.Location = new System.Drawing.Point(3, 103);
            this.radFile.Name = "radFile";
            this.radFile.Size = new System.Drawing.Size(41, 17);
            this.radFile.TabIndex = 3;
            this.radFile.Text = "File";
            this.radFile.UseVisualStyleBackColor = true;
            this.radFile.CheckedChanged += new System.EventHandler(this.radioButton_CheckedChanged);
            // 
            // radCells
            // 
            this.radCells.AutoSize = true;
            this.radCells.Location = new System.Drawing.Point(2, 53);
            this.radCells.Name = "radCells";
            this.radCells.Size = new System.Drawing.Size(47, 17);
            this.radCells.TabIndex = 2;
            this.radCells.Text = "Cells";
            this.radCells.UseVisualStyleBackColor = true;
            this.radCells.CheckedChanged += new System.EventHandler(this.radioButton_CheckedChanged);
            // 
            // radValue
            // 
            this.radValue.AutoSize = true;
            this.radValue.Checked = true;
            this.radValue.Location = new System.Drawing.Point(3, 4);
            this.radValue.Name = "radValue";
            this.radValue.Size = new System.Drawing.Size(52, 17);
            this.radValue.TabIndex = 1;
            this.radValue.TabStop = true;
            this.radValue.Text = "Value";
            this.radValue.UseVisualStyleBackColor = true;
            this.radValue.CheckedChanged += new System.EventHandler(this.radioButton_CheckedChanged);
            // 
            // splitMain
            // 
            this.splitMain.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitMain.Location = new System.Drawing.Point(0, 0);
            this.splitMain.Name = "splitMain";
            this.splitMain.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitMain.Panel1
            // 
            this.splitMain.Panel1.Controls.Add(this.flowTopPanel);
            // 
            // splitMain.Panel2
            // 
            this.splitMain.Panel2.Controls.Add(this.splitValues);
            this.splitMain.Size = new System.Drawing.Size(774, 517);
            this.splitMain.SplitterDistance = 258;
            this.splitMain.TabIndex = 4;
            // 
            // WorkflowInputControl
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.splitMain);
            this.Name = "WorkflowInputControl";
            this.Size = new System.Drawing.Size(774, 517);
            this.Load += new System.EventHandler(this.WorkflowInputControl_Load);
            this.Resize += new System.EventHandler(this.WorkflowInputControl_Resize);
            this.flowTopPanel.ResumeLayout(false);
            this.flowTopPanel.PerformLayout();
            this.groupBoxDescription.ResumeLayout(false);
            this.groupBoxDescription.PerformLayout();
            this.groupBoxExample.ResumeLayout(false);
            this.groupBoxExample.PerformLayout();
            this.flowButtons.ResumeLayout(false);
            this.splitValues.Panel1.ResumeLayout(false);
            this.splitValues.Panel2.ResumeLayout(false);
            this.splitValues.Panel2.PerformLayout();
            this.splitValues.ResumeLayout(false);
            this.splitMain.Panel1.ResumeLayout(false);
            this.splitMain.Panel1.PerformLayout();
            this.splitMain.Panel2.ResumeLayout(false);
            this.splitMain.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.FlowLayoutPanel flowTopPanel;
        private System.Windows.Forms.GroupBox groupBoxDescription;
        private System.Windows.Forms.GroupBox groupBoxExample;
        private System.Windows.Forms.FlowLayoutPanel flowButtons;
        private System.Windows.Forms.Button btnDeleteNode;
        private System.Windows.Forms.Button btnNewValue;
        private System.Windows.Forms.Button btnAddList;
        private System.Windows.Forms.SplitContainer splitValues;
        private System.Windows.Forms.TreeView treeViewValues;
        private System.Windows.Forms.Label lblDescription;
        private System.Windows.Forms.Label lblExample;
        private System.Windows.Forms.SplitContainer splitMain;
        private System.Windows.Forms.RadioButton radFile;
        private System.Windows.Forms.RadioButton radCells;
        private System.Windows.Forms.RadioButton radValue;
        private System.Windows.Forms.TextBox txtFile;
        private System.Windows.Forms.TextBox txtEndCell;
        private System.Windows.Forms.TextBox txtStartCell;
        private System.Windows.Forms.TextBox txtValue;
        private System.Windows.Forms.Label lblColon;
        private System.Windows.Forms.ComboBox cmbSheets;
        private System.Windows.Forms.ImageList imgBullets;
        private System.Windows.Forms.Button btnBrowse;
    }
}
