using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public class WorkflowInput
    {
        public string Name, Description;
        public List<string> Example;
        public int Depth;

        public static WorkflowInput GetWorkflowInput(XmlNode port, WorkflowXML wx)
        {
            WorkflowInput w = new WorkflowInput();
            w.Name = GetName(port, wx);
            w.Depth = GetDepth(port, wx);
            w.Description = GetDescription(port, wx);
            w.Example = GetExample(port, wx);
            return w;
        }

        private static string GetName(XmlNode port, WorkflowXML wx)
        {
            try
            {
                XmlNode nameNode = wx.SelectSingleNode("name", port);
                string name = nameNode.InnerText;
                return name;
            }
            catch (Exception e)
            {
                throw new WorkflowException("Could not read inputs.", e);
            }
        }

        private static int GetDepth(XmlNode port, WorkflowXML wx)
        {
            try
            {
                XmlNode depthNode = wx.SelectSingleNode("depth", port);
                int depth = int.Parse(depthNode.InnerText);
                return depth;
            }
            catch (Exception e)
            {
                throw new WorkflowException("Could not read inputs.", e);
            }
        }

        // ONLY WORKS IF I REMOVE NAMESPACE!!
        private static string GetDescription(XmlNode port, WorkflowXML wx)
        {
            try
            {
                string xpath = "annotations/annotation_chain/net.sf.taverna.t2.annotation.AnnotationChainImpl/annotationAssertions/net.sf.taverna.t2.annotation.AnnotationAssertionImpl/annotationBean[@class='net.sf.taverna.t2.annotation.annotationbeans.FreeTextDescription']/text";
                XmlNode node = wx.SelectSingleNode(xpath, port);
                if (node == null)
                    return null;
                string value = node.InnerText;
                return value;
            }
            catch (Exception e)
            {
                throw new WorkflowException("Could not read inputs.", e);
            }
        }

        private static List<string> GetExample(XmlNode port, WorkflowXML wx)
        {
            try
            {
                List<string> list = new List<string>();
                string xpath = "annotations/annotation_chain/net.sf.taverna.t2.annotation.AnnotationChainImpl/annotationAssertions/net.sf.taverna.t2.annotation.AnnotationAssertionImpl/annotationBean[@class='net.sf.taverna.t2.annotation.annotationbeans.ExampleValue']/text";
                XmlNodeList nodeList = wx.Select(xpath, port);
                if (nodeList.Count == 0)
                    return null;
                foreach (XmlNode node in nodeList)
                    list.Add(node.InnerText);
                return list;
            }
            catch (Exception e)
            {
                throw new WorkflowException("Could not read inputs.", e);
            }
        }
    }
}
