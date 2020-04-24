package automationTestCases;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class RandomExcelUDF {

public static void RandomExcelData(String Filename, String Sheetname, String TcName, String Objective,String Expected, String Actual, String Status) throws BiffException, IOException, RowsExceededException, WriteException 
		{
	//Identify the File	
	File TestFile = new File(Filename);
	
	//Identify the Excel Workbook	
	Workbook TestWorkbook = Workbook.getWorkbook(TestFile);
	
	//Identify the Writable workbook	
	WritableWorkbook TestWbook = Workbook.createWorkbook(TestFile, TestWorkbook);
	
	//Identify the Writable Sheet	
	WritableSheet TestSheet = TestWbook.getSheet(Sheetname);
	
	//Get Row count	
	int rows = TestSheet.getRows();
	
	//Identify the Label
	 Label TestLabel = new Label(0, rows ,TcName );
	 TestLabel = new Label(1, rows ,Objective );
	 TestLabel = new Label(2, rows ,Expected );
	 TestLabel = new Label(3, rows ,Actual );
	 TestLabel = new Label(4, rows ,Status );
	
	//WriteData
	 TestSheet.addCell(TestLabel);
	 TestWbook.write();
	// CloseSheet
	 TestWorkbook.close();
		
	}

}
