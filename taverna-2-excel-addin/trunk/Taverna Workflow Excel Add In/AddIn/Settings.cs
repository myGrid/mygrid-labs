using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.XPath;
using System.IO;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    class Settings
    {
        private static XPathNavigator getNavigator()
        {
            string path = Path.Combine(@"C:\Users\Paul\Documents\Visual Studio 2008\Projects\Taverna Workflow Excel Add In\Taverna Workflow Excel Add In\AddIn",
                "settings.xml");
            XPathDocument doc = new XPathDocument(path);
            return doc.CreateNavigator();
        }

        public static string[] ServerUrls
        {
            get
            {
                try
                {
                    XPathNavigator nav = getNavigator();
                    XPathNodeIterator it = nav.Select("/settings/property[@name='server']/value");
                    string[] servers = new string[it.Count];
                    for (int i = 0; i < servers.Length; i++)
                    {
                        it.MoveNext();
                        servers[i] = it.Current.Value;
                    }
                    return servers;
                }
                catch (Exception)
                {
                    return new string[] { };
                }
            }
        }

        public static string WorkflowFolder
        {
            get
            {
                try
                {
                    XPathNavigator nav = getNavigator().SelectSingleNode(
                        "/settings/property[@name='workflow_folder']/value");
                    return nav.Value;
                }
                catch (Exception) { return ""; }
            }
        }

        public static string TWMPath
        {
            get
            {
                try
                {
                    XPathNavigator nav = getNavigator().SelectSingleNode(
                        "/settings/property[@name='twm_path']/value");
                    return nav.Value;
                }
                catch (Exception) { return ""; }
            }
        }

        public static string CellReferences
        {
            get
            {
                try
                {
                    XPathNavigator nav = getNavigator().SelectSingleNode(
                        "/settings/property[@name='cell_references']/value");
                    return nav.Value;
                }
                catch (Exception) { return ""; }
            }
        }
    }
}
