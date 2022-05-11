package Regression;


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
	 @Test(priority = 1)
	 public void doUserReg() {
		 System.out.println("Executing User Regtest");
		// Assert.fail("User not registered succeessfully");
	 }
 @Test(priority = 2,dependsOnMethods="doUserReg")
 public void doLogin() {
	 System.out.println("Executing login test");
 }
    @AfterMethod
  public void closeBrowser() {
	  System.out.println("closing the browser");
  }
    @Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true)
  public void thirdTest() {
    	System.out.println("Executing Third Test");
    }
    @Test(priority=4,dependsOnMethods="doUserReg")
    public void fourthTest() {
      	System.out.println("Executing fourth Test");
      }
}
