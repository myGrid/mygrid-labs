using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.XPath;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class ErrorTrace
    {
        public string ClassName;
        public string FileName;
        public int LineNumber = -1;
        public string MethodName;

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            if (ClassName != null)
                xmlWriter.WriteElementString("className", ClassName);
            if (FileName != null)
                xmlWriter.WriteElementString("fileName", FileName);
            xmlWriter.WriteElementString("lineNumber", LineNumber.ToString());
            if (MethodName != null)
                xmlWriter.WriteElementString("methodName", MethodName);
            
            return s.ToString();
        }

        internal static ErrorTrace Create(XPathNavigator nav)
        {
            ErrorTrace error = new ErrorTrace();
            XPathNavigator element;
            element = nav.SelectSingleNode("className");
            if (element != null)
                error.ClassName = element.Value;
            element = nav.SelectSingleNode("fileName");
            if (element != null)
                error.FileName = element.Value;
            element = nav.SelectSingleNode("lineNumber");
            if (element != null)
                error.LineNumber = int.Parse(element.Value);
            element = nav.SelectSingleNode("methodName");
            if (element != null)
                error.MethodName = element.Value;
            return error;
        }
    }
}
