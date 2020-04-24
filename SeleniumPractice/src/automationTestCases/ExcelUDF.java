package automationTestCases;

import java.io.File;
import java.io.IOException;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelUDF {

	// Data Read from Excel
	// Identify the File
	// Identify the Excel
	// Identify the sheet
	// Identify the cell (row,column)
	// Read Data

	public static String cellValue;

	public static String FnReadExcel(String filename, String SheetName, int row, int column)
			throws BiffException, IOException {
		// TODO Auto-generated method stub
		// Identify the File

		File MyFile = new File(filename);

		// Identify the Excel

		Workbook MyBook = Workbook.getWorkbook(MyFile);

		// identify the Sheet

		Sheet mySheet = MyBook.getSheet(SheetName);

		// identify the cell (row,column)

		Cell myCell = mySheet.getCell(column, row);

		// Read Data

		cellValue = myCell.getContents();

		return cellValue;

	}

	// Sheet Count

	// Identify the File and Identify the workbook

	public static int SheetCount;

	public static int FnExcelSheetCount(String filename) throws BiffException, IOException

	{

		// identify the File

		File MyFile = new File(filename);

		// identify the Workbook

		Workbook MyBook = Workbook.getWorkbook(MyFile);

		// Sheetcount

		SheetCount = MyBook.getNumberOfSheets();

		return SheetCount;
	}

	// rowcount in excelsheet

	// identify the File

	public static int RCount;

	public static int FnExcelRowCount(String filename, String SheetName) throws BiffException, IOException {
		// identify the File

		File myFile = new File(filename);

		// identify the Workbook

		Workbook MyBook = Workbook.getWorkbook(myFile);

		// identify the Sheet

		Sheet MySheet = MyBook.getSheet(SheetName);

		// Rowcount

		RCount = MySheet.getRows();
		return RCount;

	}

	public static int Ccount;

	public static int FnExcelColumnCount(String filename, String Sheetname) throws BiffException, IOException {
		// identify the file
		File myFile = new File(filename);

		// identify the Workbook

		Workbook MyBook = Workbook.getWorkbook(myFile);

		// identify the Sheet

		Sheet MySheet = MyBook.getSheet(Sheetname);

		// Column count
		Ccount = MySheet.getColumns();

		return Ccount;
	}

	/*
	 * Data Writing in Excel Identify the file Identify the Excel workbook Identify
	 * the writable workbook Identify the writable sheet identify the cell Write
	 * Data Close file
	 */

	public static void FnWritetoExcel(String filename, String SheetName, int row, int col, String celldata)
			throws BiffException, IOException, RowsExceededException, WriteException {
		// Identify the File

		File myfile = new File(filename);

		// Identify the workbook

		Workbook myworkbook = Workbook.getWorkbook(myfile);

		// identify the writable workbook

		WritableWorkbook mywbook = Workbook.createWorkbook(myfile, myworkbook);

		// identify the writable sheet

		WritableSheet mysheet = mywbook.getSheet(SheetName);

		// identify the writable label (Cell,Data)

		Label mylabel = new Label(col, row, celldata);

		// Data write in Sheet

		mysheet.addCell(mylabel);

		// Write Data

		mywbook.write();

		// Close file
		mywbook.close();

	}

	// Multiple Cells writing at a time

	/*
	 * * Identify the file Identify the Excel workbook Identify the writable
	 * workbook Identify the writable sheet Get row count Identify the multiple
	 * cells Write Data Close file
	 */

	public static void FnMultipleCellsExcel(String filename, String SheetName, String TcName, String Objective,
			String Expected, String Actual, String Status)
			throws BiffException, IOException, RowsExceededException, WriteException {
		// Identify the file

		File myFile = new File(filename);
		// identify the Excel workbook

		Workbook myWorkbook = Workbook.getWorkbook(myFile);

		// identify the writable workbook

		WritableWorkbook mywbook = Workbook.createWorkbook(myFile, myWorkbook);

		// Identify the writable sheet

		WritableSheet mysheet = mywbook.getSheet(SheetName);

		// Get row count

		int rows = mysheet.getRows();

		// Identify the label

		Label mylabel = new Label(0, rows, TcName);

		// Write Data

		mysheet.addCell(mylabel);

		mylabel = new Label(1, rows, Objective);

		// Write Data

		mysheet.addCell(mylabel);

		mylabel = new Label(2, rows, Expected);

		// Write Data

		mysheet.addCell(mylabel);

		mylabel = new Label(3, rows, Actual);

		// Write Data

		mysheet.addCell(mylabel);

		mylabel = new Label(4, rows, Status);

		// Write Data

		mysheet.addCell(mylabel);

		// Write Data
		mywbook.write();

		// Close File

		mywbook.close();

	}
	
	
/*	public static int Rowcount;
	public static int Colcount;
	public static void  FnClearSheetData(String filename, String SheetName, int row, int col, String celldata) throws BiffException, IOException
	{
		//Identify the File
				
		File myFile = new File(filename);
		
		//Identify the  Excel Workbook
		
		Workbook myWorkbook = Workbook.getWorkbook(myFile);
		
		//Identify the Sheet
		
		Sheet mySheet = myWorkbook.getSheet(SheetName);
						
		//Get Row and Column Count
		
		Rowcount = mySheet.getRows();		
		
		Colcount = mySheet.getColumns();
		
		

		
}*/
	
	
		
	}


