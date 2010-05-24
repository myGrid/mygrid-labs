using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Taverna_Workflow_Excel_Add_In.RestClient;
using Taverna_Workflow_Excel_Add_In.RestClient.SchemaTypes;
using System.IO;
using Excel = Microsoft.Office.Interop.Excel;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    class ExcelHelper
    {
        static object missing = System.Type.Missing;
        public static Excel.Workbook GetNewWorkbook()
        {
            Excel.Application app = Globals.ThisAddIn.Application;
            Excel.Workbook wb = app.Workbooks.Add(Excel.XlWBATemplate.xlWBATWorksheet);
            return wb;
        }

        public static void SaveWorkbook(Excel.Workbook wb, string filename)
        {
            wb.Close(true, filename, System.Type.Missing);
        }

        public static Excel.Worksheet CreateSheet(Excel.Workbook wb, string Name, DataValue data)
        {
            object lastSheet = wb.Worksheets.get_Item(wb.Worksheets.Count);
            Excel.Worksheet ws = (Excel.Worksheet)wb.Worksheets.Add(missing, lastSheet, missing, missing);
            Excel.Worksheet ws_error = null;
            try { ws.Name = Name; }
            catch { }
            // Write data

            // If single value (1,1 = cell "A1")
            if (data.list.Count == 0)
                ws_error = WriteCell(wb, ws, ws_error, 1, 1, data);

            // If list (only >=2D!)
            for (int row = 1; row <= data.list.Count; row++)
                if (data.list[row - 1].Value != null)
                    ws_error = WriteCell(wb, ws, ws_error, row, 1, data.list[row - 1]);
                else
                    for (int col = 1; col <= data.list[row - 1].list.Count; col++)
                        ws_error = WriteCell(wb, ws, ws_error, row, col, data.list[row - 1].list[col - 1]);

            return ws;
        }

        public static Excel.Worksheet WriteCell(Excel.Workbook wb, Excel.Worksheet ws, Excel.Worksheet ws_error, int row, int col, DataValue value)
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
                        ws_error.Name = ws.Name + "_error";
                    }
                    ws_error.Cells[row, col] = value.errorValue.Message;
                }
            }
            catch { }

            return ws_error;
        }

        public static void DeleteFirstSheet(Excel.Workbook wb)
        {
            ((Excel.Worksheet)wb.Worksheets.get_Item(1)).Delete();
        }
    }
}
