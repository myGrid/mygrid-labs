using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes;

namespace Taverna_Workflow_Excel_Add_In.RestClient
{
    class Test
    {
        public static void doTest()
        {
            Client c = new Client("http://localhost:8080/taverna-server-0.2.1/rest/");
            // Create Data
            DataValue value = new DataValue();
            value.list.Add(DataValue.Create("1"));
            value.list.Add(DataValue.Create("2"));
            value.list.Add(DataValue.Create("3"));
            value.list.Add(DataValue.Create("4"));
            value.list.Add(DataValue.Create("5"));
            value.list.Add(DataValue.Create("6"));
            value.list.Add(DataValue.Create("7"));
            DataResource.Entry entry = new DataResource.Entry();
            entry.Key = "input";
            entry.Value = value;
            DataResource data = new DataResource();
            data.Entries.Add(entry);
            // Add Data
            long inputID = c.AddData(data);
            // Add Workflow
            long workflowID = c.AddWorkflow(@"C:\Users\Paul\Documents\Workflows\Demo\square_a_list_of_numbers.t2flow");
            // Add Job
            long jobID = c.AddJob(inputID, workflowID);
            // Poll for completion
            while (!c.GetJobStatus(jobID).Equals("Complete", StringComparison.CurrentCultureIgnoreCase)) ;
            // Get Data
            DataValue output = c.GetOutput(jobID, "sum_original");
            // Get Workflows
            Workflows workflows = c.GetWorkflows();
        }
    }
}
