using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Taverna_Workflow_Excel_Add_In.AddIn
{
    class Test
    {
        public static void doTest()
        {
            bool t1 = CellReference.Validate("A1");
            bool t2 = CellReference.Validate("Aa1");
            bool t3 = CellReference.Validate("g672");
            bool t4 = CellReference.Validate("XFD1048576");
            bool f1 = CellReference.Validate("klmn98");
            bool f2 = CellReference.Validate("KJ09");
            bool f3 = CellReference.Validate("A2048576");
            bool f4 = CellReference.Validate("XGD1048576");
            string testCellRef = "XFD1048576";
            int rowIndex = CellReference.GetRowIndex(testCellRef);
            int colIndex = CellReference.GetColumnIndex(testCellRef);
        }
    }
}
