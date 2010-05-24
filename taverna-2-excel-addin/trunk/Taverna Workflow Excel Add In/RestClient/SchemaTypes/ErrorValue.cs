using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.XPath;

namespace Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes
{
    public class ErrorValue
    {
        public string ExceptionMessage;
        public string Message;
        public List<ErrorTrace> StackTraces = new List<ErrorTrace>();

        public string GetXML()
        {
            StringBuilder s = new StringBuilder();
            BasicXmlWriter xmlWriter = XmlFile.GetWriter(ref s);
            if (ExceptionMessage != null)
                xmlWriter.WriteElementString("exceptionMessage", ExceptionMessage);
            if (Message != null)
                xmlWriter.WriteElementString("message", Message);
            foreach (ErrorTrace trace in StackTraces)
                xmlWriter.WriteElementString("stackTrace", trace.GetXML());
            
            return s.ToString();
        }

        internal static ErrorValue Create(XPathNavigator nav)
        {
            ErrorValue error = new ErrorValue();
            XPathNavigator element;
            element = nav.SelectSingleNode("exceptionMessage");
            if (element != null)
                error.ExceptionMessage = element.Value;
            element = nav.SelectSingleNode("message");
            if (element != null)
                error.Message = element.Value;
            XPathNodeIterator it = nav.Select("stackTrace");
            while (it.MoveNext())
                error.StackTraces.Add(ErrorTrace.Create(it.Current));
            return error;
        }
    }
}
