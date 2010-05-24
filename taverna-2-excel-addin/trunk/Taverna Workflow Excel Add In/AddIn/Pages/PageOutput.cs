using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Taverna_Workflow_Excel_Add_In.AddIn.Pages.Controls;

namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages
{
    public partial class PageOutput : UserControl
    {
        public PageOutput()
        {
            InitializeComponent();
        }

        public List<string> SpreadsheetNames = new List<string>();

        public List<WorkflowOutput> Outputs
        {
            get
            {
                List<WorkflowOutput> outputs = new List<WorkflowOutput>();
                foreach (TabPage page in tabControl1.TabPages)
                {
                    WorkflowOutputControl control = (WorkflowOutputControl)page.Controls[0];
                    WorkflowOutput output = new WorkflowOutput(page.Text);
                    output.Type = control.Type;
                    output.Value = control.Value;
                    outputs.Add(output);
                }
                return outputs;
            }
        }

        public List<WorkflowOutput> GetOutputsWithSpreadsheetPath(string Path)
        {
            List<WorkflowOutput> outputs = new List<WorkflowOutput>();
            foreach (WorkflowOutput output in Outputs)
                if (output.Type == WorkflowOutput.WhatToDo.NewSpreadsheet &&
                    output.Value.Equals(Path, StringComparison.CurrentCultureIgnoreCase))
                    outputs.Add(output);
            return outputs;
        }

        public List<WorkflowOutput> GetOutputsExceptType(WorkflowOutput.WhatToDo typeToExclude)
        {
            List<WorkflowOutput> outputs = new List<WorkflowOutput>();
            foreach (WorkflowOutput output in Outputs)
                if (output.Type != typeToExclude)
                    outputs.Add(output);
            return outputs;
        }

        private void tabControl1_ControlAdded(object sender, ControlEventArgs e)
        {
            TabPage page = (TabPage)e.Control;
            WorkflowOutputControl outputControl = (WorkflowOutputControl)page.Controls[0];
            outputControl.cmbSpreadsheet.LostFocus += new EventHandler(SpreadsheetNameChanged); 
        }

        private void SpreadsheetNameChanged(object sender, EventArgs e)
        {
            WorkflowOutputControl c = (WorkflowOutputControl)((Control)sender).Parent;
            if (c.Type == WorkflowOutput.WhatToDo.NewSpreadsheet
                && c.ValidateOutput() == null
                && !SpreadsheetNames.Contains(c.Value))
                SpreadsheetNames.Add(c.Value);
        }
    }
}
