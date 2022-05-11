package Com.TesTNG;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  
public class Testdata { 
	 @BeforeTest
	 public void createDBConn() {
		System.out.println("creating db conn"); 
	 } @AfterTest
	 public void closeDBConn() {
			System.out.println("closing db conn"); 
		 }

	@BeforeMethod
	public void launchingBrowser() {
		System.out.println("Launching browser");
	}
	 @Test(priority = 1,groups= {"function","smoke"})
	 public void doUserReg() { 
		 try {
		
		 
		 System.out.println("Executing User Regtest");
		 }catch (Throwable e) {
			// TODO: handle exception
			 System.out.println("Caputure screenshot");
		}
	 }
 @Test(priority = 2,dependsOnMethods="doUserReg",groups={"function","smoke"})
 public void doLogin() {
	 System.out.println("Executing login test");
 }
    @AfterMethod
  public void closeBrowser() {
	  System.out.println("closing the browser");
  }
    @Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true,groups= {"function","smoke"})
  public void thirdTest() {
    	System.out.println("Executing Third Test");
    }
    @Test(priority=4,groups="bvt")
    public void fourthTest() {
      	System.out.println("Executing fourth Test");
      }
}
