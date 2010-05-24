using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Xml;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public class Workflow
    {
        private string _filepath;
        public string FilePath
        {
            set
            {
                if (value.IndexOfAny(System.IO.Path.GetInvalidPathChars()) >= 0 ||
                    !File.Exists(_filepath))
                    throw new ArgumentException("Invalid path.");
                _filepath = value;
            }
            get { return _filepath; }
        }

        public List<WorkflowInput> Inputs;
        public List<WorkflowOutput> Outputs;

        public Workflow(string path)
        {
            this._filepath = path;
            this.Inputs = GetInputs();
            this.Outputs = GetOutputs();
        }

        private List<WorkflowOutput> GetOutputs()
        {
            try
            {
                WorkflowXML wx = new WorkflowXML(this);
                XmlNodeList outputPorts = wx.Select("/workflow/dataflow[@role='top']/outputPorts/port");

                List<WorkflowOutput> outputs = new List<WorkflowOutput>();
                foreach (XmlNode port in outputPorts)
                {
                    XmlNode nameNode = wx.SelectSingleNode("name", port);
                    string name = nameNode.InnerText;
                    WorkflowOutput output = new WorkflowOutput(name);
                    outputs.Add(output);
                }

                return outputs;
            }
            catch (Exception e)
            {
                throw new WorkflowException("Could not read outputs.", e);
            }
        }

        private List<WorkflowInput> GetInputs()
        {
            WorkflowXML wx = new WorkflowXML(this);
            XmlNodeList inputPorts = wx.Select("/workflow/dataflow[@role='top']/inputPorts/port");

            List<WorkflowInput> inputs = new List<WorkflowInput>();
            foreach (XmlNode port in inputPorts)
            {
                WorkflowInput input = WorkflowInput.GetWorkflowInput(port, wx);
                inputs.Add(input);
            }

            return inputs;
        }
    }

    public class WorkflowException : Exception
    {
        public WorkflowException(string message, Exception e) : base(message, e) { }
    }
}
