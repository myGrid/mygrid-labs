using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.XPath;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class DataResource : Resource
    {
        public List<Entry> Entries = new List<Entry>();

        public struct Entry
        {
            public string Key;
            public DataValue Value;
        }

        public DataValue GetData(string key)
        {
            foreach (Entry e in Entries)
                if (key.Equals(e.Key))
                    return e.Value;
            return null;
        }

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            xmlWriter.WriteRaw(base.GetXML());
            xmlWriter.WriteStartElement("dataMap");
            foreach (Entry entry in Entries)
            {
                xmlWriter.WriteStartElement("entry");
                if (entry.Key != null)
                    xmlWriter.WriteElementString("key", entry.Key);
                if (entry.Value != null)
                    xmlWriter.WriteElementString("value", entry.Value.GetXML());
                xmlWriter.WriteEndElement(); // entry
            }
            xmlWriter.WriteEndElement(); // dataMap
            
            return s.ToString();
        }

        internal static DataResource Create(XPathNavigator nav)
        {
            DataResource data = new DataResource();
            // Base elements
            XPathNavigator element;
            element = nav.SelectSingleNode("id");
            if (element != null)
                data.Id = element.Value;
            element = nav.SelectSingleNode("created");
            if (element != null)
                data.Created = element.Value;
            element = nav.SelectSingleNode("lastModified");
            if (element != null)
                data.LastModified = element.Value;
            element = nav.SelectSingleNode("uri");
            if (element != null)
                data.Uri = element.Value;
            // Data elements
            XPathNodeIterator it = nav.Select("dataMap/entry");
            while (it.MoveNext())
            {
                Entry entry = new Entry();
                XPathNavigator key = it.Current.SelectSingleNode("key");
                if (key != null)
                    entry.Key = key.Value;
                XPathNavigator value = it.Current.SelectSingleNode("value");
                if (value != null)
                    entry.Value = DataValue.Create(value);
                data.Entries.Add(entry);
            }
            return data;
        }
    }
}
