package automationTestCases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class NotepadUDF {
	
/* Identify the Data File
 * Identify the Buffer Reader
 * Data Read (Read Lines)	
 */
	
public static String MyData;

public static String FnReadfromNP(String Filename) throws IOException
{
	// Identify the input file
	FileInputStream MyFile = new FileInputStream(Filename);
	
	//Identify the Data File
	
	DataInputStream MyDataFile = new DataInputStream(MyFile);
	
	//Identify the Buffer Reader
	
	BufferedReader Mybreader= new BufferedReader(new InputStreamReader(MyDataFile));
	
	//Data Reading
	
  MyData = Mybreader.readLine();
	
  //CloseFile
  
  Mybreader.close();
	return MyData;
	
		
	
}
///Write Data in notepad with append

/*
 * Identify the file
 * Identify the writable file
 * Identify the buffer Writer
 * Identify the Line Reader
 * Identify the new line
 * Write data in the new line
 * Close file
 * 
 */
public static void FnWriteinNP(String Filename, String LineData) throws IOException
{
	//Identify the File
	
	File myFile = new File(Filename);
	//Identify the Writeable file
	
	FileWriter mywfile = new FileWriter(myFile, true);
	
	//Identify the buffer Writer
	
	BufferedWriter mybuffwriter = new BufferedWriter(mywfile);
	
	//Identify the Line Reader for appending the data
	
	LineNumberReader mylinereader = new LineNumberReader(new FileReader(myFile));
	
	//Indetify the new line
	
	for (int i = 1; i<=mylinereader.getLineNumber();i++)
	{
		mybuffwriter.newLine();
	}
	//Buffer reader new line
	mybuffwriter.newLine();
	
	//Write Data
	
	mybuffwriter.write(LineData);
	
	//close File
	mybuffwriter.close();
}

/*public static void FnWriteDatainColNP(String Filename, String LineData ) throws IOException
{
	//Identify the File
	
		File myFile = new File(Filename);
		//Identify the Writeable file
		
		FileWriter mywfile = new FileWriter(myFile, true);
		
		//Identify the buffer Writer
		
		BufferedWriter mybuffwriter = new BufferedWriter(mywfile);
		
		//Identify the Line Reader for appending the data
		
		LineNumberReader mylinereader = new LineNumberReader(new FileReader(myFile));
		
		//Indetify the new line
		
		for (int i = 1; i<=mylinereader.getLineNumber();i++)
		{
			mybuffwriter.newLine();
		}
		//Buffer reader new line
		mybuffwriter.newLine();
		
		//Write Data
		
		mybuffwriter.write(LineData);
		
}*/


 
	

}
