using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages.Controls
{
    public partial class WorkflowOutputControl : UserControl
    {
        public WorkflowOutput.WhatToDo Type
        {
            get
            {
                if (radCells.Checked) return WorkflowOutput.WhatToDo.ThisSpreadsheet;
                if (radFile.Checked) return WorkflowOutput.WhatToDo.File;
                if (radIgnore.Checked) return WorkflowOutput.WhatToDo.Ignore;
                if (radSpreadsheet.Checked) return WorkflowOutput.WhatToDo.NewSpreadsheet;
                return WorkflowOutput.WhatToDo.Ignore;
            }
        }
        public string Value
        {
            get
            {
                if (radCells.Checked) return null;
                if (radFile.Checked) return txtFile.Text;
                if (radIgnore.Checked) return null;
                if (radSpreadsheet.Checked) return cmbSpreadsheet.Text;
                return null;
            }
        }

        public WorkflowOutputControl()
        {
            InitializeComponent();
        }

        public string ValidateOutput()
        {
            string return_value = null;
            if (Type == WorkflowOutput.WhatToDo.File || Type == WorkflowOutput.WhatToDo.NewSpreadsheet)
            {
                try
                {
                    // Check already exists
                    FileInfo file = new FileInfo(Value);
                    if (file.Exists)
                        return_value = "File already exists";
                    // Check it's not a directory
                    if (Directory.Exists(Value))
                        return_value = "No filename specified";
                    // Check drive exists
                    bool foundDrive = false;
                    foreach (DriveInfo d in DriveInfo.GetDrives())
                        if (d.Name.Equals(Path.GetPathRoot(Value), StringComparison.CurrentCultureIgnoreCase))
                            foundDrive = true;
                    if (!foundDrive)
                        return_value = "Drive does not exist";
                    // Try to create a file in that directory
                    FileInfo f = new FileInfo(Value);
                    try
                    {
                        FileStream s = f.Create();
                        s.WriteByte(1);
                        s.Close();
                        f.Delete();
                    }
                    catch { return_value = "Could not access directory: " + f.DirectoryName; }
                }
                catch { return_value = "Invalid path"; }
            }
            return return_value;
        }

        #region Enable right text box
        private void DisableEverything()
        {
            txtFile.Enabled = cmbSpreadsheet.Enabled = false;
            lblFile.Enabled = lblSpread.Enabled = false;
        }

        private void radCells_CheckedChanged(object sender, EventArgs e)
        {
            DisableEverything();
        }

        private void radSpreadsheet_CheckedChanged(object sender, EventArgs e)
        {
            DisableEverything();
            cmbSpreadsheet.Enabled = lblSpread.Enabled = true;
        }

        private void radFile_CheckedChanged(object sender, EventArgs e)
        {
            DisableEverything();
            txtFile.Enabled = lblFile.Enabled = true;
        }

        private void radIgnore_CheckedChanged(object sender, EventArgs e)
        {
            DisableEverything();
        }
        #endregion


        // Add Spreadsheet Names
        private void WorkflowOutputControl_VisibleChanged(object sender, EventArgs e)
        {
            PageOutput wizPage = (PageOutput)((Control)sender).Parent.Parent.Parent;
            cmbSpreadsheet.Items.Clear();
            cmbSpreadsheet.Items.AddRange(wizPage.SpreadsheetNames.ToArray());
        }
    }
}
