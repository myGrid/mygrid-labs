using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.XPath;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class DataValue
    {
        public bool ContainsError = false;
        public ErrorValue errorValue = null;
        public List<DataValue> list = new List<DataValue>();
        public string Value = null;

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            xmlWriter.WriteElementString("containsError", ContainsError.ToString());
            if (errorValue != null)
                xmlWriter.WriteElementString("errorValue", errorValue.GetXML());
            foreach (DataValue v in list)
                xmlWriter.WriteElementString("list", v.GetXML());
            if (Value != null)
                xmlWriter.WriteElementStringWithType("value", Value);

            return s.ToString();
        }

        public static DataValue Create(string value)
        {
            DataValue v = new DataValue();
            v.Value = value;
            return v;
        }

        internal static DataValue Create(XPathNavigator nav)
        {
            DataValue data = new DataValue();
            XPathNavigator element;
            element = nav.SelectSingleNode("containsError");
            if (element != null)
                data.ContainsError = bool.Parse(element.Value);
            element = nav.SelectSingleNode("errorValue");
            if (element != null)
                data.errorValue = ErrorValue.Create(element);
            XPathNodeIterator it = nav.Select("list");
            while (it.MoveNext())
                data.list.Add(DataValue.Create(it.Current));
            element = nav.SelectSingleNode("value");
            if (element != null)
                data.Value = element.Value;
            return data;
        }
    }
}
