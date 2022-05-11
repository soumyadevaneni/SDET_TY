package Com.TesTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Listeners1.class)
public class Sample {
    static WebDriver sdriver;
    
    WebDriver driver;
    
	@BeforeClass
	public void bc() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 sdriver=driver;
	}
	   @Test
	public void org() {
		
		
		
		
		driver.get("http://localhost:8888");
		WebElement un=driver.findElement(By.name("user_name"));
		un.sendKeys("admin");
		WebElement pwd=driver.findElement(By.name("user_password"));
		pwd.sendKeys("admin");

	     WebElement loginbtn=driver.findElement(By.id("submitButton"));
		      loginbtn.click();
		Assert.assertEquals(false,true);
	}
		
	   @Test
		
		public void Contact() {
			
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("http://localhost:8888");
			WebElement un=driver.findElement(By.name("user_name"));
			boolean value=un.isDisplayed();
			un.sendKeys("admin");
			WebElement pwd=driver.findElement(By.name("user_password"));
			pwd.sendKeys("admin");

			 WebElement loginbtn=driver.findElement(By.id("submitButton"));
		      loginbtn.click();
			
			Assert.assertEquals(true, true);
			

		
		
			}
}
