using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Xml;
using Taverna_Workflow_Excel_Add_In.RestClient;
using Excel = Microsoft.Office.Interop.Excel;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public partial class TabWizard : Form
    {
        WorkflowLaunchSettings wlSettings;
        string ServerURL { get { return pageServerSettings1.URL; } }
        string WorkflowPath { get {  return pageChooseWorkflow1.Path; } }
        private enum JobState { NotLaunchedYet, Launched, Cancelled, Complete }
        JobState jobState = JobState.NotLaunchedYet;

        public TabWizard(WorkflowLaunchSettings wlSettings)
        {
            InitializeComponent();
            this.wlSettings = wlSettings;
        }

        private void TabWizard_Load(object sender, EventArgs e)
        {
            // General Events
            tabControl.SelectedIndexChanged += new EventHandler(tabControl_SelectedIndexChanged);
            // Server Settings Page events
            pageServerSettings1.SomethingChanged += new EventHandler(ssp_txtURL_TextChanged);
            // Choose Workflow Page events
            pageChooseWorkflow1.SomethingChanged += new EventHandler(cwp_txtPath_TextChanged);
            // Launch Page events
            pageLaunch1.btnLaunch.Click += new EventHandler(lap_btnLaunch_Click);
        }

        #region Handlers
        void ssp_txtURL_TextChanged(object sender, EventArgs e)
        {
            ssp_EnableButtons();
        }

        void cwp_txtPath_TextChanged(object sender, EventArgs e)
        {
            cwp_EnableButtons();
        }

        void lap_btnLaunch_Click(object sender, EventArgs e)
        {
            pageLaunch1.btnLaunch.Enabled = false;
            LaunchWorkflow();
            if (jobState != JobState.Complete)
            {
                pageLaunch1.btnLaunch.Enabled = true;
                pageLaunch1.ClearLog();
            }
            lap_EnableButtons();
        }
        #endregion

        // When tab is changed
        void tabControl_SelectedIndexChanged(object sender, EventArgs e)
        {
            btnBack.Enabled = tabControl.SelectedIndex > 0;
            btnNext.Enabled = tabControl.SelectedIndex < tabControl.TabCount - 1;
            EnableButtons();
        }

        #region Process Tab
        private bool ProcessTab()
        {
            TabPage t = tabControl.SelectedTab;
            if (t == tabServer) return ssp_ProcessTab();
            if (t == tabWorkflow) return cwp_ProcessTab();
            if (t == tabInput) return inp_ProcessTab();
            if (t == tabOutput) return oup_ProcessTab();
            if (t == tabLaunch) return lap_ProcessTab();

            return true;
        }

        private bool ssp_ProcessTab()
        {
            wlSettings.ServerUrl = pageServerSettings1.URL;
            return true;
        }

        private bool cwp_ProcessTab()
        {
            if (wlSettings.Workflow == null
                || pageChooseWorkflow1.Path != wlSettings.Workflow.FilePath)
            {
                wlSettings.Workflow = new Workflow(pageChooseWorkflow1.Path);
                // Input Page
                // Remove tabs
                pageInput1.tabControl1.TabPages.Clear();
                // Add tab for each input
                foreach (WorkflowInput input in wlSettings.Workflow.Inputs)
                {
                    TabPage tab = new TabPage(input.Name);
                    Pages.Controls.WorkflowInputControl control = new Pages.Controls.WorkflowInputControl(input);
                    control.Dock = DockStyle.Fill;
                    tab.Controls.Add(control);
                    pageInput1.tabControl1.TabPages.Add(tab);
                }

                // Output page
                // Remove tabs
                pageOutput1.tabControl1.TabPages.Clear();
                // Add tab for each output
                foreach (WorkflowOutput output in wlSettings.Workflow.Outputs)
                {
                    TabPage tab = new TabPage(output.Name);
                    Pages.Controls.WorkflowOutputControl control = new Pages.Controls.WorkflowOutputControl();
                    control.Dock = DockStyle.Fill;
                    tab.Controls.Add(control);
                    pageOutput1.tabControl1.TabPages.Add(tab);
                }
            }
            return true;
        }

        private bool inp_ProcessTab()
        {
            bool founderror = false;
            foreach (TabPage page in pageInput1.tabControl1.TabPages)
            {
                Pages.Controls.WorkflowInputControl c = page.Controls[0] as Pages.Controls.WorkflowInputControl;
                string error = c.ValidateInput();
                if (error != null)
                {
                    string message = "Input: " + page.Text + Environment.NewLine;
                    message += "Error: " + error;
                    MessageBox.Show(message, "Problem with input",
                        MessageBoxButtons.OK, MessageBoxIcon.Error);
                    founderror = true;
                }
            }
            return !founderror;
        }

        private bool oup_ProcessTab()
        {
            bool founderror = false;
            foreach (TabPage page in pageOutput1.tabControl1.TabPages)
            {
                Pages.Controls.WorkflowOutputControl c = page.Controls[0] as Pages.Controls.WorkflowOutputControl;
                string error = c.ValidateOutput();
                if (error != null)
                {
                    string message = "Output: " + page.Text + Environment.NewLine;
                    message += "Error: " + error;
                    MessageBox.Show(message, "Problem with output",
                        MessageBoxButtons.OK, MessageBoxIcon.Error);
                    founderror = true;
                }
            }
            return !founderror;
        }

        private bool lap_ProcessTab()
        {
            return true;
        }


        #endregion

        #region Enable Buttons

        void EnableButtons()
        {
            TabPage t = tabControl.SelectedTab;
            if (t == tabServer) ssp_EnableButtons();
            else if (t == tabWorkflow) cwp_EnableButtons();
            else if (t == tabInput) inp_EnableButtons();
            else if (t == tabOutput) oup_EnableButtons();
            else if (t == tabLaunch) lap_EnableButtons();
        }

        void ssp_EnableButtons()
        {
            btnNext.Enabled = pageServerSettings1.Valid;
        }

        void cwp_EnableButtons()
        {
            btnNext.Enabled = pageChooseWorkflow1.Valid;
        }
        void inp_EnableButtons() { }
        void oup_EnableButtons() { }
        void lap_EnableButtons()
        {
            btnBack.Enabled = jobState == JobState.NotLaunchedYet;
            if (jobState == JobState.Complete)
            {
                btnCancel.Text = "Finish";
            }
        }
        #endregion

        #region Navigation Buttons
        private void btnCancel_Click(object sender, EventArgs e)
        {
            if (jobState == JobState.Launched)
                if (MessageBox.Show("The workflow is running. Are you sure you want to cancel?",
                    "Cancel", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
                    == DialogResult.Yes)
                    jobState = JobState.Cancelled;
                else
                    return;
            this.DialogResult = DialogResult.Cancel;
        }

        private void btnNext_Click(object sender, EventArgs e)
        {
            if (ProcessTab())
            {
                TabPage next = tabControl.TabPages[tabControl.SelectedIndex + 1];
                if (next.Controls[0] == pageInput1 && wlSettings.Workflow.Inputs.Count == 0
                    || next.Controls[0] == pageOutput1 && wlSettings.Workflow.Outputs.Count == 0)
                    tabControl.SelectedIndex += 2;
                else
                    tabControl.SelectedIndex++;
            }
        }

        private void btnBack_Click(object sender, EventArgs e)
        {
            TabPage next = tabControl.TabPages[tabControl.SelectedIndex - 1];
            if (next.Controls[0] == pageInput1 && wlSettings.Workflow.Inputs.Count == 0
                || next.Controls[0] == pageOutput1 && wlSettings.Workflow.Outputs.Count == 0)
                tabControl.SelectedIndex -= 2;
            else
                tabControl.SelectedIndex--;
        }
        #endregion

        private bool LaunchWorkflow()
        {
            btnBack.Enabled = false;
            Application.DoEvents();
            pageLaunch1.ClearLog();
            // Create REST client
            pageLaunch1.Report("Initialising REST client..." + Environment.NewLine);
            Client client = new Client(ServerURL);
            // Submit Workflow
            pageLaunch1.Report("Submitting workflow...");
            long workflowID = AddWorkflow(client, WorkflowPath);
            if (workflowID == 0) return false;
            pageLaunch1.Report("Workflow ID: " + workflowID.ToString() + Environment.NewLine);
            // Submit Input Data
            long inputID = -1;
            if (wlSettings.Workflow.Inputs.Count > 0)
            {
                pageLaunch1.Report("Submitting input data...");
                inputID = AddData(client, pageInput1.Data);
                if (inputID == 0) return false;
                pageLaunch1.Report("Input ID: " + inputID.ToString() + Environment.NewLine);
            }
            // Start the Job
            pageLaunch1.Report("Starting job...");
            long jobID = AddJob(client, inputID, workflowID);
            if (jobID == 0) return false;
            pageLaunch1.Report("Job ID: " + jobID.ToString() + Environment.NewLine);

            pageLaunch1.Report("Workflow launched!" + Environment.NewLine + Environment.NewLine);
            jobState = JobState.Launched;

            // Wait for job to complete
            pageLaunch1.Report("Waiting for job to complete...");
            TavernaJob job = new TavernaJob(client, jobID);
            while (!job.Complete)
            {
                if (jobState == JobState.Cancelled) return false;
                if (UpdateJob(job) == false) return false;
                Application.DoEvents();
            }
            pageLaunch1.Report("Job complete!" + Environment.NewLine);

            // Process outputs
            foreach (WorkflowOutput output in pageOutput1.GetOutputsExceptType(WorkflowOutput.WhatToDo.NewSpreadsheet))
            {
                try
                {
                    if (output.Type == WorkflowOutput.WhatToDo.Ignore)
                        continue;
                    pageLaunch1.Report("Processing output \'" + output.Name + "\'...");
                    output.Process(job, true);
                }
                catch
                {
                    string msg = "There was an error processing output \'" + output.Name + "\'. Would you like to dump it to a file?";
                    if (MessageBox.Show(msg, "Error Processing Output", MessageBoxButtons.YesNo) == DialogResult.Yes)
                    {
                        System.Windows.Forms.FolderBrowserDialog fbd = new FolderBrowserDialog();
                        fbd.ShowNewFolderButton = true;
                        if (fbd.ShowDialog() == DialogResult.OK)
                            try { output.DumpToFile(job, fbd.SelectedPath); }
                            catch { MessageBox.Show("Could not dump to file."); }
                    }
                }
            }

            // Process new spreadsheets
            foreach(string path in pageOutput1.SpreadsheetNames)
            {
                WorkflowOutput[] outputs = pageOutput1.GetOutputsWithSpreadsheetPath(path).ToArray();
                Excel.Workbook wb = ExcelHelper.GetNewWorkbook();
                
                for (int i = 0; i < outputs.Length; i++)
                {
                    WorkflowOutput output = outputs[i];
                    pageLaunch1.Report("Processing output \'" + output.Name + "\'...");
                    ExcelHelper.CreateSheet(wb, output.Name, job.GetOutput(output.Name));
                }
                ExcelHelper.DeleteFirstSheet(wb);
                ExcelHelper.SaveWorkbook(wb, path);
            }

            pageLaunch1.Report("Finished!");
            jobState = JobState.Complete;
            return true;
        }

        private bool UpdateJob(TavernaJob job)
        {
            try
            {
                return job.UpdateJob();
            }
            catch
            {
                if (CatchServerException())
                    return UpdateJob(job);
                else
                    return false;
            }
        }

        private long AddWorkflow(Client client, string WorkflowPath)
        {
            try
            {
                Application.DoEvents();
                return client.AddWorkflow(WorkflowPath);
            }
            catch
            {
                if (CatchServerException())
                    return AddWorkflow(client, WorkflowPath);
                else
                    return 0;
            }
        }

        private long AddJob(Client client, long inputID, long workflowID)
        {
            try
            {
                Application.DoEvents();
                return client.AddJob(inputID, workflowID);
            }
            catch
            {
                if (CatchServerException())
                    return AddJob(client, inputID, workflowID);
                else
                    return 0;
            }
        }

        private long AddData(Client client, RestClient.SchemaTypes.DataResource dataResource)
        {
            try
            {
                Application.DoEvents();
                return client.AddData(dataResource);
            }
            catch
            {
                if (CatchServerException())
                    return AddData(client, dataResource);
                else
                    return 0;
            }
        }

        private bool CatchServerException()
        {
            string msg = "There was an error contacting the server." + Environment.NewLine;
            msg += "Select 'Retry' to try again with the current settings or 'Cancel' to go back and check the server URL.";
            if (MessageBox.Show(msg, "Server Error", MessageBoxButtons.RetryCancel) == DialogResult.Cancel)
            {
                jobState = JobState.NotLaunchedYet;
                tabControl.SelectedIndex = 1;
                return false;
            }
            return true;
        }

        // Not used: Can't delete running job
        /*private void DeleteFromServer(Client client, long dataID, long workflowID, long jobID)
        {
            if (MessageBox.Show("Do you want to delete the job, workflow and data from the server?",
                                "Delete", MessageBoxButtons.YesNo) == DialogResult.No)
                return;

            try
            {
                client.DeleteJob(jobID);
                client.DeleteData(dataID);
                client.DeleteWorkflow(workflowID);
            }
            catch (System.Net.WebException) { }
        }*/
    }
}
