package DDTpackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;


public class ReadingdatafromJSONTest {
@Test
public void ReadingdatafromJSONTest() throws Throwable {
	
	       FileReader fr = new FileReader("D:\\KCSM12\\TYSS_Soumi\\CommonData.JSON");
	 
	 JSONParser    jp=new JSONParser();
	  Object   job=jp.parse(fr);
	  
	     HashMap hp = (HashMap)job;
	     
	     String URL=(String)hp.get("url");
	     System.out.println(URL);
	 
}}