using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.IO;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class XmlFile
    {
        public bool Taverna2Workflow = false;
        public string PathToWorkflow = null;

        public DataResource data;
        public DataValue dataValue;
        public ErrorTrace errorTrace;
        public ErrorValue errorValue;
        public JobResource jobResource;
        public Jobs jobs;
        public Resource resource;
        public WorkflowResource workflowResource;
        public Workflows workflows;

        public string GetXML()
        {
            if (Taverna2Workflow)
            {
                XmlDocument doc = new XmlDocument();
                doc.Load(PathToWorkflow);
                return doc.OuterXml;
            }
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            if (data != null)
                xmlWriter.WriteElementString("Data", data.GetXML());
            if (dataValue != null)
                xmlWriter.WriteElementString("DataValue", dataValue.GetXML());
            if (errorTrace != null)
                xmlWriter.WriteElementString("ErrorTrace", errorTrace.GetXML());
            if (errorValue != null)
                xmlWriter.WriteElementString("ErrorValue", errorValue.GetXML());
            if (jobResource != null)
                xmlWriter.WriteElementString("Job", jobResource.GetXML());
            if (jobs != null)
                xmlWriter.WriteElementString("Jobs", jobs.GetXML());
            if (resource != null)
                xmlWriter.WriteElementString("Resource", resource.GetXML());
            if (workflowResource != null)
                xmlWriter.WriteElementString("Workflow", workflowResource.GetXML());
            if (workflows != null)
                xmlWriter.WriteElementString("Workflows", workflows.GetXML());
            
            return s.ToString();
        }

        public static BasicXmlWriter GetWriter(ref StringBuilder s)
        {
            BasicXmlWriter xmlWriter = BasicXmlWriter.Create(s);
            return xmlWriter;
        }
    }
}
