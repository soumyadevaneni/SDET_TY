package Com.Vtiger.generic;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Vtiger.ObjectRepo.HomePage;
import Com.Vtiger.ObjectRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public 	WebDriver driver;
	public ProppertyFiles propertyFiles = new ProppertyFiles();
	@Parameters("BROWSER")
	@BeforeClass
	public void OpenBrowser(String BROWSER) throws Throwable {



		//	String BROWSER=	propertyFiles.readDatafrompropertyfile("browser");   

			if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("No Browser Provided Launching Default browser");

		}

		driver.get(propertyFiles.readDatafrompropertyfile("url"));
		WebDriverUtil  webDriverUtil=new WebDriverUtil(driver);
		webDriverUtil.maxwindow();
		webDriverUtil.pageloadtimeout();
	}
	@BeforeMethod
	public void login() throws IOException {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.logintoApp();
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		homePage.logoutfromApp();
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(10000);
		driver.close();
	}
}
