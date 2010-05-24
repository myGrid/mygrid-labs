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
    public partial class PageLaunch : UserControl
    {
        public PageLaunch()
        {
            InitializeComponent();
        }

        public void Report(string message)
        {
            string time = DateTime.Now.ToLongTimeString();
            txtLog.Text += time + ": " + message + Environment.NewLine;
            txtLog.SelectionStart = txtLog.Text.Length;
            txtLog.ScrollToCaret();
            Application.DoEvents();
        }

        public void ClearLog()
        {
            txtLog.Text = "";
            Application.DoEvents();
        }
    }
}
