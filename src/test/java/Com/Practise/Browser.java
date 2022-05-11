package Com.Practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.Vtiger.generic.ProppertyFiles;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {


	// TODO Auto-generated method stub
	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
	public static 	WebDriver driver;
	public void OpenBrowser() throws Throwable {


		ProppertyFiles prop = new ProppertyFiles();

		String BROWSER=	prop.readDatafrompropertyfile("browser");   

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
			driver= new ChromeDriver();
		}

		driver.get(prop.readDatafrompropertyfile("url"));

		driver.findElement(By.name("user_name")).sendKeys(prop.readDatafrompropertyfile("username"));
		driver.findElement(By.name("user_password")).sendKeys(prop.readDatafrompropertyfile("password"));
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();



	}








}


