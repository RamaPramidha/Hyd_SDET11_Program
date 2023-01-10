package genericLibrary;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelFileLibrary {
	
	/*
	 * This method will read the data from excel Sheet for the sheet name,rowno,cellno given by the user
	 * @param SheetName
	 * @param rowNo
	 * @param celNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	
	public String readDataFromExcel(String sheetName,int rowNo,int celNo) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream(IConstantsLibrary.ExcelFilePath);
	    Workbook wb=WorkbookFactory.create(fis);
	    Sheet sh=wb.getSheet(sheetName);
	    Row rw=sh.getRow(rowNo);
	    Cell ce=rw.getCell(celNo);
	    String value=ce.getStringCellValue();
	    return value; 
	    
		
	}
	/*
	 * This method will provide the last row number utilized in a given sheet
	 * @param shhetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	
	public int getRowCount(String sheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream("IConstantsLibrary.excelFilePath");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		return rowCount;
	}	
	
	/*
	 * This method will write the data into excel sheet for user specified sheetName,rowNo,celNo
	 * @param sheetName
	 * @param rowNo
	 * @param celNo
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throwsIOException
	 */
		
	public void writeDataIntoExcel(String sheetName,int rowNo, int celNo,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IConstantsLibrary.ExcelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNo);
		Cell cel=rw.createCell(celNo);
		cel.setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(IConstantsLibrary.ExcelFilePath);
		wb.write(fos);
		wb.close();
		System.out.println("Data written successfully");
	}
}		
	
	

