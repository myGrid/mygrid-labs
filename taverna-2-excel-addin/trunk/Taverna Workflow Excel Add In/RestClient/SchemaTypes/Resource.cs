using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class Resource
    {
        public string Id, Created, LastModified, Uri;

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            if (Id != null)
                xmlWriter.WriteElementString("id", Id);
            if (Created != null)
                xmlWriter.WriteElementString("created", Created);
            if (LastModified != null)
                xmlWriter.WriteElementString("lastModified", LastModified);
            if (Uri != null)
                xmlWriter.WriteElementString("uri", Uri);
            return s.ToString();
        }
    }
}
