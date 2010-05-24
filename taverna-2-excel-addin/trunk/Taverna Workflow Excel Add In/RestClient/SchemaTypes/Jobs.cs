using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class Jobs
    {
        public List<JobResource> jobs = new List<JobResource>();

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            foreach (JobResource job in jobs)
                xmlWriter.WriteElementString("job", job.GetXML());
            
            return s.ToString();
        }
    }
}
