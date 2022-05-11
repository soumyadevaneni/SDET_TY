package Com.Vtiger.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelutility {
 public String readDatafromExcel(String sheetname,int rownum,int cellnum) throws Throwable  {
	  FileInputStream fis = new FileInputStream("C:\\Users\\Soumya\\Desktop\\excell.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	  
 }
// public int readNumericDatafromexcell(String sheetname,int rownum,int cellnum) throws Throwable 
 {
	    //    FileInputStream fis = new FileInputStream("D:\\KCSM12\\DEMO_MAVEN_Project\\excell.xlsx");
	    // int value  =(int)  WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
	     //  return value;
	    // return value;)
 }
public  int getLastRow(String sheet) throws Throwable {
	// TODO Auto-generated method stub
    FileInputStream fis = new FileInputStream("C:\\Users\\Soumya\\Desktop\\excell.xlsx");
   int lastrow= WorkbookFactory.create(fis).getSheet(sheet).getLastRowNum();
return lastrow;
   
	
}
public  int readNumbericDatafromExcel(String   sheetname,int rownum,int cellnum) throws Throwable {
	
	// TODO Auto-generated method stub
        FileInputStream fis = new FileInputStream("C:\\Users\\Soumya\\Desktop\\excell.xlsx");
	     int value  =(int)  WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();

	     return value;
}
public String getExcelData(String string, int i, int j) {
	// TODO Auto-generated method stub
	return null;
}
 
}
