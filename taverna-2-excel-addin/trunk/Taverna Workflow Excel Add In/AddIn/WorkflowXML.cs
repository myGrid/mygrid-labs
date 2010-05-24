using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public class WorkflowXML
    {
        const string prefix = "w";
        const string nspace = @"http://taverna.sf.net/2008/xml/t2flow";
        public XmlDocument doc;
        public XmlNamespaceManager xmlns;

        public WorkflowXML(Workflow w)
        {
            doc = new XmlDocument();
            doc.Load(w.FilePath);
            xmlns = new XmlNamespaceManager(doc.NameTable);
            xmlns.AddNamespace(prefix, nspace);
        }

        public XmlNode SelectSingleNode(string xpath)
        {
            return SelectSingleNode(xpath, doc.DocumentElement);
        }

        public XmlNode SelectSingleNode(string xpath, XmlNode parent)
        {
            string x = AddPrefix(xpath);
            return parent.SelectSingleNode(x, xmlns);
        }

        public XmlNodeList Select(string xpath)
        {
            return Select(xpath, doc.DocumentElement);
        }

        public XmlNodeList Select(string xpath, XmlNode parent)
        {
            string x = AddPrefix(xpath);
            return parent.SelectNodes(x, xmlns);
        }

        private string AddPrefix(string xpath)
        {
            // remove the first slash, if any
            string originalXpath = xpath.StartsWith("/") ? xpath.Substring(1) : xpath;

            // add prefix
            string prefixedXpath = "";
            foreach (string s in originalXpath.Split(new char[] { '/' }))
            {
                prefixedXpath += "/";
                if (s.Length > 0) prefixedXpath += prefix + ":";
                prefixedXpath += s;
            }

            // remove the first slash if it's not meant to be there
            if (!xpath.StartsWith("/") && prefixedXpath.StartsWith("/"))
                prefixedXpath = prefixedXpath.Substring(1);

            return prefixedXpath;
        }
    }
}
