using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.XPath;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class JobResource : Resource
    {
        public long Inputs;
        public long Outputs;
        public string Status;
        public long Workflow;

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            xmlWriter.WriteRaw(base.GetXML());
            if (Inputs > 0)
                xmlWriter.WriteElementString("inputs", Inputs.ToString());
            if (Outputs > 0)
                xmlWriter.WriteElementString("outputs", Outputs.ToString());
            if (Status != null)
                xmlWriter.WriteElementString("status", Status);
            if (Workflow > 0)
                xmlWriter.WriteElementString("workflow", Workflow.ToString());
            
            return s.ToString();
        }

        internal static JobResource Create(XPathNavigator nav)
        {
            JobResource job = new JobResource();
            // Base elements
            XPathNavigator element;
            element = nav.SelectSingleNode("id");
            if (element != null)
                job.Id = element.Value;
            element = nav.SelectSingleNode("created");
            if (element != null)
                job.Created = element.Value;
            element = nav.SelectSingleNode("lastModified");
            if (element != null)
                job.LastModified = element.Value;
            element = nav.SelectSingleNode("uri");
            if (element != null)
                job.Uri = element.Value;
            // Data elements
            element = nav.SelectSingleNode("inputs");
            if (element != null)
                job.Inputs = long.Parse(element.Value);
            element = nav.SelectSingleNode("outputs");
            if (element != null)
                job.Outputs = long.Parse(element.Value);
            element = nav.SelectSingleNode("status");
            if (element != null)
                job.Status = element.Value;
            element = nav.SelectSingleNode("workflow");
            if (element != null)
                job.Workflow = long.Parse(element.Value);

            return job;
        }
    }
}
