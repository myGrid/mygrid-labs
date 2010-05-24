using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Taverna_Workflow_Excel_Add_In.RestClient;
using Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes;
using System.IO;
using Excel = Microsoft.Office.Interop.Excel;
using System.Net;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public class WorkflowOutput
    {
        public string Name;
        public WhatToDo Type = WhatToDo.Ignore;
        public string Value = null;

        public enum WhatToDo { ThisSpreadsheet, NewSpreadsheet, File, Ignore }

        public WorkflowOutput(string name)
        {
            this.Name = name;
        }

        Excel.Workbook wb = null;
        Excel.Worksheet ws, ws_error = null;
        static object missing = System.Type.Missing;
        public void Process(TavernaJob job, bool save)
        {
            if (Type == WhatToDo.Ignore || Type == WhatToDo.NewSpreadsheet)
                return;

            if (Type == WhatToDo.File)
            {
                job.SaveOutput(Value);
                return;
            }

            // Get output
            DataValue data = job.GetOutput(Name);

            // Get application
            Excel.Application app = Globals.ThisAddIn.Application;

            // Set Workbook
            wb = app.ActiveWorkbook;

            // Create sheet
            object lastSheet = wb.Worksheets.get_Item(wb.Worksheets.Count);
            ws = (Excel.Worksheet)wb.Worksheets.Add(System.Type.Missing, lastSheet, System.Type.Missing, System.Type.Missing);
            try { ws.Name = Name; }
            catch { }

            // Write data
            // If single value (1,1 = cell "A1")
            if (data.list.Count == 0)
                WriteCell(1, 1, data);

            // If list (only >=2D!)
            for (int row = 1; row <= data.list.Count; row++)
                if (data.list[row - 1].Value != null)
                    WriteCell(row, 1, data.list[row - 1]);
                else
                    for (int col = 1; col <= data.list[row - 1].list.Count; col++)
                        WriteCell(row, col, data.list[row - 1].list[col - 1]);
        }

        private void WriteCell(int row, int col, DataValue value)
        {
            try
            {
                if (!value.ContainsError)
                    ws.Cells[row, col] = value.Value;
                else
                {
                    if (ws_error == null)
                    {
                        object lastSheet = wb.Worksheets.get_Item(wb.Worksheets.Count);
                        ws_error = (Excel.Worksheet)wb.Worksheets.Add(missing, lastSheet, missing, missing);
                        ws_error.Name = Name + "_error";
                    }
                    ws_error.Cells[row, col] = value.errorValue.Message;
                }
            }
            catch { }
        }

        internal void DumpToFile(TavernaJob job, string path)
        {
            job.SaveOutput(path + "\\" + Name + "_DUMP.xml");
        }
    }
}
