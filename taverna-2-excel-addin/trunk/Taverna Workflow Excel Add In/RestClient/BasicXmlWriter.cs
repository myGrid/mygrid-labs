using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Taverna_Workflow_Excel_Add_In.RestClient
{
    // necessary because XmlWriter is well formed so can't do multiple root elements
    public class BasicXmlWriter
    {
        internal StringBuilder sb;
        Stack<string> openElements = new Stack<string>();

        internal static BasicXmlWriter Create(StringBuilder s)
        {
            BasicXmlWriter w = new BasicXmlWriter();
            w.sb = s;
            return w;
        }

        internal void WriteElementString(string name, string value)
        {
            sb.AppendLine("<" + name.Trim() + ">" + value + "</" + name.Trim() + ">");
        }

        internal void WriteElementStringWithType(string name, string value)
        {
            sb.AppendLine("<" + name.Trim() + " xsi:type=\"xs:string\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + value + "</" + name.Trim() + ">");
            
        }

        internal void WriteRaw(string p)
        {
            sb.AppendLine(p);
        }

        internal void WriteStartElement(string name)
        {
            openElements.Push(name.Trim());
            sb.AppendLine("<" + openElements.Peek() + ">");
        }

        internal void WriteEndElement()
        {
            sb.AppendLine("</" + openElements.Pop() + ">");
        }

        public override string ToString()
        {
            return sb.ToString();
        }
    }
}
