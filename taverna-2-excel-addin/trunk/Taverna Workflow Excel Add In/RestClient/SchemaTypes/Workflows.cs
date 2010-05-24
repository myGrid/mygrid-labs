using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.XPath;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class Workflows
    {
        public List<WorkflowResource> workflows = new List<WorkflowResource>();

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            foreach (WorkflowResource workflow in workflows)
                xmlWriter.WriteElementString("workflow", workflow.GetXML());
            
            return s.ToString();
        }

        internal static Workflows Create(System.Xml.XPath.XPathNavigator nav)
        {
            Workflows w = new Workflows();
            XPathNodeIterator it = nav.Select("workflow");
            while (it.MoveNext())
                w.workflows.Add(WorkflowResource.Create(it.Current));
            return w;
        }
    }
}
