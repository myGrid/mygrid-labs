using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Taverna_Workflow_Excel_Add_In.RestClient;
using Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes;
using System.Threading;
using System.Net;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public class TavernaJob
    {
        Client client;
        JobResource job;
        public bool Complete = false;

        public TavernaJob(Client client, long jobID)
        {
            this.client = client;
            this.job = client.GetJob(jobID);
        }

        public bool UpdateJob()
        {
            job = client.GetJob(long.Parse(job.Id));
            if (job.Status.Equals("COMPLETE", StringComparison.CurrentCultureIgnoreCase))
            {
                Complete = true;
            }
            return true;
        }

        public DataValue GetOutput(string name)
        {
            if (!Complete)
                return null;

            DataValue output = client.GetOutput(long.Parse(job.Id), name);
            return output;
        }

        public void SaveOutput(string path)
        {
            string url = client.DATA_PATH + job.Outputs.ToString();
            WebClient web = new WebClient();
            web.DownloadFile(url, path);
        }
    }
}
