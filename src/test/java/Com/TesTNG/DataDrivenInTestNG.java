package Com.TesTNG;

import org.testng.Reporter;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenInTestNG {
	@DataProvider
   public Object[][] dataBank() {
	     Object [][] obj= new Object[2][2];
	     obj[0][0]="admin";
	     obj[0][1]="manager";
	     
	     obj[1][0]="admin2";
	     obj[1][1]="manager2";
	     return obj;
   }
    @DataProvider
   public Object[][] dataBank2() {
	     Object  [] [] obj= new Object[2][3];
	     obj[0][0]="admin1";
	     obj[0][1]="manager1";
	     obj[0][2]="Goa";
	     
	     obj[1][0]="admin2";
	     obj[1][1]="manager2";
	     obj[1][2]="Hyd";
	     
	     return obj;
 }
   
    @Test (dataProvider="dataBank2")
    public void getCred(String un, String pw,String city) {
    	
    	Reporter.log(un+"---pw+", true);
    	
    	
    }
}
