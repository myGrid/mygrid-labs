namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    partial class TabWizard
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(TabWizard));
            this.tabControl = new System.Windows.Forms.TabControl();
            this.tabWelcome = new System.Windows.Forms.TabPage();
            this.pageWelcome1 = new Taverna_Workflow_Excel_Add_In.AddIn.Pages.PageWelcome();
            this.tabServer = new System.Windows.Forms.TabPage();
            this.pageServerSettings1 = new Taverna_Workflow_Excel_Add_In.AddIn.Pages.PageServerSettings();
            this.tabWorkflow = new System.Windows.Forms.TabPage();
            this.pageChooseWorkflow1 = new Taverna_Workflow_Excel_Add_In.AddIn.Pages.PageChooseWorkflow();
            this.tabInput = new System.Windows.Forms.TabPage();
            this.pageInput1 = new Taverna_Workflow_Excel_Add_In.AddIn.Pages.PageInput();
            this.tabOutput = new System.Windows.Forms.TabPage();
            this.pageOutput1 = new Taverna_Workflow_Excel_Add_In.AddIn.Pages.PageOutput();
            this.tabLaunch = new System.Windows.Forms.TabPage();
            this.pageLaunch1 = new Taverna_Workflow_Excel_Add_In.AddIn.Pages.PageLaunch();
            this.btnCancel = new System.Windows.Forms.Button();
            this.btnNext = new System.Windows.Forms.Button();
            this.btnBack = new System.Windows.Forms.Button();
            this.tabControl.SuspendLayout();
            this.tabWelcome.SuspendLayout();
            this.tabServer.SuspendLayout();
            this.tabWorkflow.SuspendLayout();
            this.tabInput.SuspendLayout();
            this.tabOutput.SuspendLayout();
            this.tabLaunch.SuspendLayout();
            this.SuspendLayout();
            // 
            // tabControl
            // 
            this.tabControl.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
                        | System.Windows.Forms.AnchorStyles.Left)
                        | System.Windows.Forms.AnchorStyles.Right)));
            this.tabControl.Appearance = System.Windows.Forms.TabAppearance.Buttons;
            this.tabControl.Controls.Add(this.tabWelcome);
            this.tabControl.Controls.Add(this.tabServer);
            this.tabControl.Controls.Add(this.tabWorkflow);
            this.tabControl.Controls.Add(this.tabInput);
            this.tabControl.Controls.Add(this.tabOutput);
            this.tabControl.Controls.Add(this.tabLaunch);
            this.tabControl.ItemSize = new System.Drawing.Size(0, 1);
            this.tabControl.Location = new System.Drawing.Point(0, 0);
            this.tabControl.Multiline = true;
            this.tabControl.Name = "tabControl";
            this.tabControl.SelectedIndex = 0;
            this.tabControl.Size = new System.Drawing.Size(466, 269);
            this.tabControl.SizeMode = System.Windows.Forms.TabSizeMode.Fixed;
            this.tabControl.TabIndex = 0;
            // 
            // tabWelcome
            // 
            this.tabWelcome.Controls.Add(this.pageWelcome1);
            this.tabWelcome.Location = new System.Drawing.Point(4, 5);
            this.tabWelcome.Name = "tabWelcome";
            this.tabWelcome.Padding = new System.Windows.Forms.Padding(3);
            this.tabWelcome.Size = new System.Drawing.Size(458, 260);
            this.tabWelcome.TabIndex = 0;
            this.tabWelcome.Text = "tabPage1";
            this.tabWelcome.UseVisualStyleBackColor = true;
            // 
            // pageWelcome1
            // 
            this.pageWelcome1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pageWelcome1.Location = new System.Drawing.Point(3, 3);
            this.pageWelcome1.Name = "pageWelcome1";
            this.pageWelcome1.Size = new System.Drawing.Size(452, 254);
            this.pageWelcome1.TabIndex = 0;
            // 
            // tabServer
            // 
            this.tabServer.Controls.Add(this.pageServerSettings1);
            this.tabServer.Location = new System.Drawing.Point(4, 7);
            this.tabServer.Name = "tabServer";
            this.tabServer.Padding = new System.Windows.Forms.Padding(3);
            this.tabServer.Size = new System.Drawing.Size(458, 258);
            this.tabServer.TabIndex = 1;
            this.tabServer.Text = "tabPage2";
            this.tabServer.UseVisualStyleBackColor = true;
            // 
            // pageServerSettings1
            // 
            this.pageServerSettings1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pageServerSettings1.Location = new System.Drawing.Point(3, 3);
            this.pageServerSettings1.Name = "pageServerSettings1";
            this.pageServerSettings1.Size = new System.Drawing.Size(452, 252);
            this.pageServerSettings1.TabIndex = 0;
            // 
            // tabWorkflow
            // 
            this.tabWorkflow.Controls.Add(this.pageChooseWorkflow1);
            this.tabWorkflow.Location = new System.Drawing.Point(4, 7);
            this.tabWorkflow.Name = "tabWorkflow";
            this.tabWorkflow.Padding = new System.Windows.Forms.Padding(3);
            this.tabWorkflow.Size = new System.Drawing.Size(458, 258);
            this.tabWorkflow.TabIndex = 2;
            this.tabWorkflow.Text = "tabPage3";
            this.tabWorkflow.UseVisualStyleBackColor = true;
            // 
            // pageChooseWorkflow1
            // 
            this.pageChooseWorkflow1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pageChooseWorkflow1.Location = new System.Drawing.Point(3, 3);
            this.pageChooseWorkflow1.Name = "pageChooseWorkflow1";
            this.pageChooseWorkflow1.Size = new System.Drawing.Size(452, 252);
            this.pageChooseWorkflow1.TabIndex = 0;
            // 
            // tabInput
            // 
            this.tabInput.Controls.Add(this.pageInput1);
            this.tabInput.Location = new System.Drawing.Point(4, 7);
            this.tabInput.Name = "tabInput";
            this.tabInput.Padding = new System.Windows.Forms.Padding(3);
            this.tabInput.Size = new System.Drawing.Size(458, 258);
            this.tabInput.TabIndex = 3;
            this.tabInput.Text = "tabPage4";
            this.tabInput.UseVisualStyleBackColor = true;
            // 
            // pageInput1
            // 
            this.pageInput1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pageInput1.Location = new System.Drawing.Point(3, 3);
            this.pageInput1.Name = "pageInput1";
            this.pageInput1.Size = new System.Drawing.Size(452, 252);
            this.pageInput1.TabIndex = 0;
            // 
            // tabOutput
            // 
            this.tabOutput.Controls.Add(this.pageOutput1);
            this.tabOutput.Location = new System.Drawing.Point(4, 7);
            this.tabOutput.Name = "tabOutput";
            this.tabOutput.Padding = new System.Windows.Forms.Padding(3);
            this.tabOutput.Size = new System.Drawing.Size(458, 258);
            this.tabOutput.TabIndex = 5;
            this.tabOutput.Text = "tabPage1";
            this.tabOutput.UseVisualStyleBackColor = true;
            // 
            // pageOutput1
            // 
            this.pageOutput1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pageOutput1.Location = new System.Drawing.Point(3, 3);
            this.pageOutput1.Name = "pageOutput1";
            this.pageOutput1.Size = new System.Drawing.Size(452, 252);
            this.pageOutput1.TabIndex = 0;
            // 
            // tabLaunch
            // 
            this.tabLaunch.Controls.Add(this.pageLaunch1);
            this.tabLaunch.Location = new System.Drawing.Point(4, 7);
            this.tabLaunch.Name = "tabLaunch";
            this.tabLaunch.Padding = new System.Windows.Forms.Padding(3);
            this.tabLaunch.Size = new System.Drawing.Size(458, 258);
            this.tabLaunch.TabIndex = 4;
            this.tabLaunch.Text = "tabPage5";
            this.tabLaunch.UseVisualStyleBackColor = true;
            // 
            // pageLaunch1
            // 
            this.pageLaunch1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pageLaunch1.Location = new System.Drawing.Point(3, 3);
            this.pageLaunch1.Name = "pageLaunch1";
            this.pageLaunch1.Size = new System.Drawing.Size(452, 252);
            this.pageLaunch1.TabIndex = 0;
            this.pageLaunch1.Tag = "";
            // 
            // btnCancel
            // 
            this.btnCancel.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.btnCancel.DialogResult = System.Windows.Forms.DialogResult.Cancel;
            this.btnCancel.Location = new System.Drawing.Point(379, 275);
            this.btnCancel.Name = "btnCancel";
            this.btnCancel.Size = new System.Drawing.Size(75, 23);
            this.btnCancel.TabIndex = 1;
            this.btnCancel.Text = "&Cancel";
            this.btnCancel.UseVisualStyleBackColor = true;
            this.btnCancel.Click += new System.EventHandler(this.btnCancel_Click);
            // 
            // btnNext
            // 
            this.btnNext.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.btnNext.Location = new System.Drawing.Point(298, 275);
            this.btnNext.Name = "btnNext";
            this.btnNext.Size = new System.Drawing.Size(75, 23);
            this.btnNext.TabIndex = 2;
            this.btnNext.Text = "&Next >";
            this.btnNext.UseVisualStyleBackColor = true;
            this.btnNext.Click += new System.EventHandler(this.btnNext_Click);
            // 
            // btnBack
            // 
            this.btnBack.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.btnBack.Enabled = false;
            this.btnBack.Location = new System.Drawing.Point(217, 275);
            this.btnBack.Name = "btnBack";
            this.btnBack.Size = new System.Drawing.Size(75, 23);
            this.btnBack.TabIndex = 3;
            this.btnBack.Text = "< &Back";
            this.btnBack.UseVisualStyleBackColor = true;
            this.btnBack.Click += new System.EventHandler(this.btnBack_Click);
            // 
            // TabWizard
            // 
            this.AcceptButton = this.btnNext;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.CancelButton = this.btnCancel;
            this.ClientSize = new System.Drawing.Size(466, 310);
            this.Controls.Add(this.btnBack);
            this.Controls.Add(this.btnNext);
            this.Controls.Add(this.btnCancel);
            this.Controls.Add(this.tabControl);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.MinimumSize = new System.Drawing.Size(482, 348);
            this.Name = "TabWizard";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Taverna Excel Add In";
            this.Load += new System.EventHandler(this.TabWizard_Load);
            this.tabControl.ResumeLayout(false);
            this.tabWelcome.ResumeLayout(false);
            this.tabServer.ResumeLayout(false);
            this.tabWorkflow.ResumeLayout(false);
            this.tabInput.ResumeLayout(false);
            this.tabOutput.ResumeLayout(false);
            this.tabLaunch.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        public System.Windows.Forms.TabControl tabControl;
        public System.Windows.Forms.TabPage tabWelcome;
        public System.Windows.Forms.TabPage tabServer;
        public System.Windows.Forms.TabPage tabWorkflow;
        public System.Windows.Forms.TabPage tabInput;
        public System.Windows.Forms.TabPage tabLaunch;
        public System.Windows.Forms.Button btnCancel;
        public System.Windows.Forms.Button btnNext;
        public System.Windows.Forms.Button btnBack;
        public Pages.PageWelcome pageWelcome1;
        public Pages.PageServerSettings pageServerSettings1;
        public Pages.PageChooseWorkflow pageChooseWorkflow1;
        public Pages.PageLaunch pageLaunch1;
        public System.Windows.Forms.TabPage tabOutput;
        public Pages.PageInput pageInput1;
        public Pages.PageOutput pageOutput1;
    }
}