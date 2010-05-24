using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.XPath;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class WorkflowResource : Resource
    {
        public bool Enabled = true;
        public string Xml;

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            xmlWriter.WriteRaw(base.GetXML());
            xmlWriter.WriteElementString("enabled", Enabled.ToString());
            if (Xml != null)
                xmlWriter.WriteElementString("xml", Xml);
            
            return s.ToString();
        }

        internal static WorkflowResource Create(System.Xml.XPath.XPathNavigator nav)
        {
            WorkflowResource w = new WorkflowResource();
            // Base elements
            XPathNavigator element;
            element = nav.SelectSingleNode("id");
            if (element != null)
                w.Id = element.Value;
            element = nav.SelectSingleNode("created");
            if (element != null)
                w.Created = element.Value;
            element = nav.SelectSingleNode("lastModified");
            if (element != null)
                w.LastModified = element.Value;
            element = nav.SelectSingleNode("uri");
            if (element != null)
                w.Uri = element.Value;
            // Workflow elements
            element = nav.SelectSingleNode("enabled");
            if (element != null)
                w.Enabled = bool.Parse(element.Value);
            element = nav.SelectSingleNode("xml");
            if (element != null)
                w.Xml = element.Value;

            return w;
        }
    }
}
