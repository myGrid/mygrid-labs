using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.IO;
using Excel = Microsoft.Office.Interop.Excel;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    public class CellReference
    {
        public static bool Validate(string cellRef)
        {
            // (Max: XFD1048576)
            string s = cellRef.Trim();
            // Too short (with workaround)
            if (s.Length == 0) return true;
            if (s.Length < 2) return false;
            // Any other characters
            if (Regex.Match(s, "[^a-zA-Z0-9]").Success) return false;

            // Split into letters + numbers

            // Check first letter
            string letters = s.Substring(0, 1);
            if (Regex.Match(letters, "[0-9]").Success) return false;
            // Check for second letter
            string secondchar = s.Substring(1, 1);
            if (Regex.Match(secondchar, "[a-zA-Z]").Success)
            {
                letters += secondchar;
                // Check for third letter
                if (s.Length > 2)
                {
                    string thirdchar = s.Substring(2, 1);
                    if (Regex.Match(thirdchar, "[a-zA-Z]").Success)
                        letters += thirdchar;
                }
            }
            // Check not over max columns
            if (letters.Length == 3)
            {
                string l = letters.ToUpper();
                if (l.ToCharArray()[0] > 'X') return false;
                else if (l.Substring(0, 1) == "X" &&
                    l.ToCharArray()[1] > 'F') return false;
                else if (l.Substring(0, 2) == "XF" &&
                    l.ToCharArray()[2] > 'D') return false;
            }

            // Check numbers
            string numbers = s.Substring(letters.Length);
            if (numbers.Substring(0, 1) == "0") return false;
            if (Regex.Match(numbers, "[^0-9]").Success) return false;
            if (int.Parse(numbers) > 1048576) return false;

            return true;
        }

        public static int GetColumnIndex(string cellRef)
        {
            // Split into letters + numbers
            // Get first letter
            string letters = cellRef.Substring(0, 1);
            // Check for second letter
            string secondchar = cellRef.Substring(1, 1);
            if (Regex.Match(secondchar, "[a-zA-Z]").Success)
            {
                letters += secondchar;
                // Check for third letter
                if (cellRef.Length > 2)
                {
                    string thirdchar = cellRef.Substring(2, 1);
                    if (Regex.Match(thirdchar, "[a-zA-Z]").Success)
                        letters += thirdchar;
                }
            }
            // Make sure it's 3 letters long and in capitals
            while (letters.Length < 3)
                letters = "0" + letters;
            letters = letters.ToUpper();
            // Convert to number
            string alphabet = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int firstChar = alphabet.IndexOf(letters.Substring(0, 1)) * 26 * 26;
            int secondChar = alphabet.IndexOf(letters.Substring(1, 1)) * 26;
            int thirdChar = alphabet.IndexOf(letters.Substring(2, 1));
            int sum = firstChar + secondChar + thirdChar;
            return sum;
        }

        public static int GetRowIndex(string cellRef)
        {
            // Split into letters + numbers
            // Get first letter
            string letters = cellRef.Substring(0, 1);
            // Check for second letter
            string secondchar = cellRef.Substring(1, 1);
            if (Regex.Match(secondchar, "[a-zA-Z]").Success)
            {
                letters += secondchar;
                // Check for third letter
                if (cellRef.Length > 2)
                {
                    string thirdchar = cellRef.Substring(2, 1);
                    if (Regex.Match(thirdchar, "[a-zA-Z]").Success)
                        letters += thirdchar;
                }
            }

            // Check numbers
            string numbers = cellRef.Substring(letters.Length);
            return int.Parse(numbers);
        }

        public static string[,] GetRange(string start, string end)
        {
            // Get Numbers
            int startRow = GetRowIndex(start);
            int startCol = GetColumnIndex(start);
            int endRow = GetRowIndex(end);
            int endCol = GetColumnIndex(end);
            // Get Column Names
            int width = endCol - startCol + 1;
            string[] colNames = new string[width];
            for (int i = 0; i < colNames.Length; i++)
                colNames[i] = GetColumnName(i + startCol);
            // Get Row Names
            int height = endRow - startRow + 1;
            string[] rowNames = new string[height];
            for (int i = 0; i < rowNames.Length; i++)
                rowNames[i] = (i + startRow).ToString();
            // Fill range
            string[,] range = new string[width, height];
            for (int col = startCol; col <= endCol; col++)
                for (int row = startRow; row <= endRow; row++)
                    range[col - startCol, row - startRow] = colNames[col - startCol] + rowNames[row - startRow];
            return range;
        }

        private static string GetColumnName(int colIndex)
        {
            StreamReader r = new StreamReader(Settings.CellReferences);
            string name = "";
            for (int i = 1; i <= colIndex; i++)
                name = r.ReadLine();
            r.Close();
            return name;
        }

        public static string GetValue(string sheet, string startCell)
        {
            Excel.Workbook wb = Globals.ThisAddIn.Application.ActiveWorkbook;
            for (int i = 0; i < wb.Worksheets.Count; i++)
                if (((Excel.Worksheet)wb.Worksheets.get_Item(i + 1)).Name.Equals(sheet))
                {
                    try
                    {
                        Excel.Worksheet worksheet = (Excel.Worksheet)wb.Worksheets.get_Item(i + 1);
                        int row = CellReference.GetRowIndex(startCell);
                        int col = CellReference.GetColumnIndex(startCell);
                        Excel.Range range = (Excel.Range)worksheet.Cells[row, col];
                        return (string)range.Text;
                    }
                    catch (Exception) { }
                }
            return null;
        }
    }
}
