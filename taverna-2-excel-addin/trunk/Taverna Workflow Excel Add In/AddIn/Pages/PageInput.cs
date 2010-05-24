using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes;
using Taverna_Workflow_Excel_Add_In.AddIn.Pages.Controls;

namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages
{
    public partial class PageInput : UserControl
    {
        public PageInput()
        {
            InitializeComponent();
        }

        public DataResource Data
        {
            get
            {
                DataResource data = new DataResource();
                foreach (TabPage page in tabControl1.TabPages)
                {
                    WorkflowInputControl control = (WorkflowInputControl)page.Controls[0];
                    DataValue value = control.Data;
                    DataResource.Entry entry = new DataResource.Entry();
                    entry.Key = page.Text;
                    entry.Value = value;
                    data.Entries.Add(entry);
                }
                string xml = data.GetXML();
                return data;
            }
        }
    }
}
