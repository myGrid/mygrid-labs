namespace Taverna_Workflow_Excel_Add_In.AddIn.Pages.Controls
{
    partial class WorkflowOutputControl : System.Windows.Forms.UserControl
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

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.radCells = new System.Windows.Forms.RadioButton();
            this.radFile = new System.Windows.Forms.RadioButton();
            this.lblFile = new System.Windows.Forms.Label();
            this.txtFile = new System.Windows.Forms.TextBox();
            this.radIgnore = new System.Windows.Forms.RadioButton();
            this.radSpreadsheet = new System.Windows.Forms.RadioButton();
            this.lblSpread = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.cmbSpreadsheet = new System.Windows.Forms.ComboBox();
            this.SuspendLayout();
            // 
            // radCells
            // 
            this.radCells.AutoSize = true;
            this.radCells.Checked = true;
            this.radCells.Location = new System.Drawing.Point(3, 35);
            this.radCells.Name = "radCells";
            this.radCells.Size = new System.Drawing.Size(142, 17);
            this.radCells.TabIndex = 0;
            this.radCells.TabStop = true;
            this.radCells.Text = "Save to this spreadsheet";
            this.radCells.UseVisualStyleBackColor = true;
            this.radCells.CheckedChanged += new System.EventHandler(this.radCells_CheckedChanged);
            // 
            // radFile
            // 
            this.radFile.AutoSize = true;
            this.radFile.Location = new System.Drawing.Point(3, 110);
            this.radFile.Name = "radFile";
            this.radFile.Size = new System.Drawing.Size(78, 17);
            this.radFile.TabIndex = 3;
            this.radFile.Text = "Save to file";
            this.radFile.UseVisualStyleBackColor = true;
            this.radFile.CheckedChanged += new System.EventHandler(this.radFile_CheckedChanged);
            // 
            // lblFile
            // 
            this.lblFile.AutoSize = true;
            this.lblFile.Enabled = false;
            this.lblFile.Location = new System.Drawing.Point(3, 141);
            this.lblFile.Name = "lblFile";
            this.lblFile.Size = new System.Drawing.Size(49, 13);
            this.lblFile.TabIndex = 4;
            this.lblFile.Text = "Filename";
            // 
            // txtFile
            // 
            this.txtFile.Enabled = false;
            this.txtFile.Location = new System.Drawing.Point(58, 138);
            this.txtFile.Name = "txtFile";
            this.txtFile.Size = new System.Drawing.Size(222, 20);
            this.txtFile.TabIndex = 5;
            // 
            // radIgnore
            // 
            this.radIgnore.AutoSize = true;
            this.radIgnore.Location = new System.Drawing.Point(3, 164);
            this.radIgnore.Name = "radIgnore";
            this.radIgnore.Size = new System.Drawing.Size(55, 17);
            this.radIgnore.TabIndex = 6;
            this.radIgnore.Text = "Ignore";
            this.radIgnore.UseVisualStyleBackColor = true;
            this.radIgnore.CheckedChanged += new System.EventHandler(this.radIgnore_CheckedChanged);
            // 
            // radSpreadsheet
            // 
            this.radSpreadsheet.AutoSize = true;
            this.radSpreadsheet.Location = new System.Drawing.Point(3, 58);
            this.radSpreadsheet.Name = "radSpreadsheet";
            this.radSpreadsheet.Size = new System.Drawing.Size(146, 17);
            this.radSpreadsheet.TabIndex = 7;
            this.radSpreadsheet.Text = "Save to new spreadsheet";
            this.radSpreadsheet.UseVisualStyleBackColor = true;
            this.radSpreadsheet.CheckedChanged += new System.EventHandler(this.radSpreadsheet_CheckedChanged);
            // 
            // lblSpread
            // 
            this.lblSpread.AutoSize = true;
            this.lblSpread.Enabled = false;
            this.lblSpread.Location = new System.Drawing.Point(3, 84);
            this.lblSpread.Name = "lblSpread";
            this.lblSpread.Size = new System.Drawing.Size(49, 13);
            this.lblSpread.TabIndex = 9;
            this.lblSpread.Text = "Filename";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(0, 10);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(210, 13);
            this.label4.TabIndex = 10;
            this.label4.Text = "What would you like to do with this output?";
            // 
            // cmbSpreadsheet
            // 
            this.cmbSpreadsheet.Enabled = false;
            this.cmbSpreadsheet.FormattingEnabled = true;
            this.cmbSpreadsheet.Location = new System.Drawing.Point(58, 81);
            this.cmbSpreadsheet.Name = "cmbSpreadsheet";
            this.cmbSpreadsheet.Size = new System.Drawing.Size(222, 21);
            this.cmbSpreadsheet.TabIndex = 11;
            // 
            // WorkflowOutputControl
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.cmbSpreadsheet);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.lblSpread);
            this.Controls.Add(this.radSpreadsheet);
            this.Controls.Add(this.radIgnore);
            this.Controls.Add(this.txtFile);
            this.Controls.Add(this.lblFile);
            this.Controls.Add(this.radFile);
            this.Controls.Add(this.radCells);
            this.Name = "WorkflowOutputControl";
            this.Size = new System.Drawing.Size(774, 517);
            this.VisibleChanged += new System.EventHandler(this.WorkflowOutputControl_VisibleChanged);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.RadioButton radCells;
        private System.Windows.Forms.RadioButton radFile;
        private System.Windows.Forms.Label lblFile;
        private System.Windows.Forms.TextBox txtFile;
        private System.Windows.Forms.RadioButton radIgnore;
        private System.Windows.Forms.RadioButton radSpreadsheet;
        private System.Windows.Forms.Label lblSpread;
        private System.Windows.Forms.Label label4;
        internal System.Windows.Forms.ComboBox cmbSpreadsheet;
    }
}
