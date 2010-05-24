using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages
{
    public partial class PageServerSettings : UserControl
    {
        public string URL { get { return cmbUrl.Text; } }
        public bool Valid { get { return URL != ""; } }

        public PageServerSettings()
        {
            InitializeComponent();
        }

        private void txtURL_TextChanged(object sender, EventArgs e)
        {
            SomethingChanged(this, new EventArgs());
        }

        public event EventHandler SomethingChanged;

        private void PageServerSettings_Load(object sender, EventArgs e)
        {
            cmbUrl.Items.AddRange(Settings.ServerUrls);
            if (cmbUrl.Items.Count > 0)
                cmbUrl.SelectedIndex = 0;
        }

        private void cmbUrl_SelectedIndexChanged(object sender, EventArgs e)
        {
            SomethingChanged(this, new EventArgs());
        }
    }
}
