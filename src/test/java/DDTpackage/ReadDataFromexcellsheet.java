package DDTpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;




public class ReadDataFromexcellsheet {
       
	       @Test
       public  void ReadDataFromexcellshee() throws Throwable 
       {  
    	  	     FileInputStream fis = new FileInputStream("D:\\KCSM12\\DEMO_MAVEN_Project\\CommonData.xlsx");
		          Workbook wb= WorkbookFactory.create(fis);
		          Sheet sh= wb.getSheet("Sheet1");
		  		Row r = sh.getRow(3);
		  		Cell c = r.getCell(1);
		  		String val = c.getStringCellValue();
		  		System.out.println(val);
		  		
		  		
		  		

		// TODO Auto-generated method stub

	}

}
