using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes;
using System.IO;
using System.Xml.XPath;
using System.Net;
using System.Xml;

namespace Taverna_Workflow_Excel_Add_In.RestClient
{
    public class Client
    {
        // Constants

        const string  DATA_PATH_EXTENSION = "/data/";
        const string JOBS_PATH_EXTENSION = "/jobs/";
        const string WORKFLOWS_PATH_EXTENSION = "/workflows/";

        public string DATA_PATH { get { return BASE_URL + DATA_PATH_EXTENSION; } }
        public string JOBS_PATH { get { return BASE_URL + JOBS_PATH_EXTENSION; } }
        public string WORKFLOWS_PATH { get { return BASE_URL + WORKFLOWS_PATH_EXTENSION; } }

        const string XML_MIME = "application/xml";
        const string TAVERNA2_MIME = "application/vnd.taverna.t2flow+xml";

        // Constructor

        public string BASE_URL;

        public Client(string base_url)
        {
            BASE_URL = base_url.TrimEnd(new char[] {'/'});
        }

        // REST Methods

        public long AddData(DataResource data)
        {
            // Create Document
            XmlFile x = new XmlFile();
            x.data = data;

            // Execute Method
            long response = DoAdd(x, DATA_PATH, XML_MIME);
            return response;
        }

        public long AddJob(JobResource job)
        {
            // Create Document
            XmlFile x = new XmlFile();
            x.jobResource = job;
            
            // Execute Method
            long response = DoAdd(x, JOBS_PATH, XML_MIME);
            return response;
        }

        public long AddJob(long input, long workflow)
        {
            JobResource j = new JobResource();
            j.Inputs = input;
            j.Workflow = workflow;
            return AddJob(j);
        }

        public long AddWorkflow(string path)
        {
            // Create Document
            XmlFile x = new XmlFile();
            x.Taverna2Workflow = true;
            x.PathToWorkflow = path;

            // Execute Method
            long response = DoAdd(x, WORKFLOWS_PATH, TAVERNA2_MIME);
            return response;
        }

        public void DeleteData(long id)
        {
            DoDelete(DATA_PATH + id.ToString());
        }

        public void DeleteJob(long id)
        {
            DoDelete(JOBS_PATH + id.ToString());
        }

        public void DeleteWorkflow(long id)
        {
            DoDelete(WORKFLOWS_PATH + id.ToString());
        }

        public DataResource GetData(long id)
        {
            try
            {
                string uri = DATA_PATH + id.ToString();
                XPathDocument doc = new XPathDocument(uri);
                XPathNavigator nav = doc.CreateNavigator().SelectSingleNode("/Data");
                DataResource data = DataResource.Create(nav);
                return data;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public JobResource GetJob(long id)
        {
            try
            {
                string uri = JOBS_PATH + id.ToString();
                XPathDocument doc = new XPathDocument(uri);
                XPathNavigator nav = doc.CreateNavigator().SelectSingleNode("/Job");
                JobResource job = JobResource.Create(nav);
                return job;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public string GetJobStatus(long id)
        {
            JobResource job = GetJob(id);
            return job.Status;
        }

        public DataValue GetOutput(long jobid, string port)
        {
            JobResource job = GetJob(jobid);
            DataResource data = GetData(job.Outputs);
            return data.GetData(port);
        }

        public WorkflowResource GetWorkflow(long id)
        {
            try
            {
                string uri = WORKFLOWS_PATH + id.ToString();
                XPathDocument doc = new XPathDocument(uri);
                XPathNavigator nav = doc.CreateNavigator().SelectSingleNode("/Workflow");
                WorkflowResource w = WorkflowResource.Create(nav);
                return w;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public Workflows GetWorkflows()
        {
            try
            {
                string uri = WORKFLOWS_PATH;
                XPathDocument doc = new XPathDocument(uri);
                XPathNavigator nav = doc.CreateNavigator().SelectSingleNode("/Workflows");
                Workflows w = Workflows.Create(nav);
                return w;
            }
            catch (Exception)
            {
                return null;
            }
        }

        // Other Methods

        private long DoAdd(XmlFile x, string uri, string mime)
        {
            // Create URI
            Uri address = new Uri(uri);

            // Create the web request
            HttpWebRequest request = WebRequest.Create(address) as HttpWebRequest;

            // Set type to POST
            request.Method = "POST";
            request.ContentType = mime;

            // Create a byte array of the data we want to send
            string xml = x.GetXML();
            XmlDocument doc = new XmlDocument();
            doc.LoadXml(xml);
            Encoding encoder = new UTF8Encoding();
            byte[] byteData = encoder.GetBytes(doc.OuterXml);


            // Set the content length in the request headers
            request.ContentLength = byteData.Length;

            // Write data
            using (Stream postStream = request.GetRequestStream())
            {
                postStream.Write(byteData, 0, byteData.Length);
            }
            WebResponse webResponse = request.GetResponse();
            if (webResponse == null)
            { return 0; }
            StreamReader sr = new StreamReader(webResponse.GetResponseStream());
            long result = long.Parse(sr.ReadToEnd());
            sr.Close();
            return result;
        }

        private void DoDelete(string uri)
        {
            // Create URI
            Uri address = new Uri(uri);

            // Create the web request
            HttpWebRequest request = WebRequest.Create(address) as HttpWebRequest;

            // Set type to DELETE
            request.Method = "DELETE";

            // Do delete
            HttpWebResponse response = request.GetResponse() as HttpWebResponse;
        }
    }
}
