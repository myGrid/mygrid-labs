using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Microsoft.Office.Tools.Ribbon;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public partial class Ribbon1 : OfficeRibbon
    {
        public Ribbon1()
        {
            InitializeComponent();
        }

        void Ribbon1_Load(object sender, EventArgs e) { }

        private void btnLaunch_Click(object sender, RibbonControlEventArgs e)
        {
            WorkflowLaunchSettings settings = new WorkflowLaunchSettings();
            TabWizard wizard = new TabWizard(settings);
            wizard.ShowDialog();
        }
    }
}
