using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages
{
    public partial class PageChooseWorkflow : UserControl
    {
        public string Path { get { return txtPath.Text; } }
        public bool Valid
        {
            get
            {
                return
                    Path != "" &&
                    Path.IndexOfAny(System.IO.Path.GetInvalidPathChars()) < 0 &&
                    File.Exists(Path);
            }
        }

        public PageChooseWorkflow()
        {
            InitializeComponent();
        }

        private void btnBrowse_Click(object sender, EventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog();
            ofd.InitialDirectory = Settings.WorkflowFolder;
            ofd.Filter = "Taverna 2 Workflow files (*.t2flow) | *.t2flow";
            if (ofd.ShowDialog() == DialogResult.OK)
                txtPath.Text = ofd.FileName;
        }

        private void txtPath_TextChanged(object sender, EventArgs e)
        {
            SomethingChanged(this, new EventArgs());
        }

        public event EventHandler SomethingChanged;
    }
}
