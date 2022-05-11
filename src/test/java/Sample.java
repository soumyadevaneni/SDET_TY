

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.lenskart.com/");
       driver.manage().window().maximize();
       driver.findElement(By.name("q")).click();
       Thread.sleep(2000);
    WebElement d=  driver.findElement(By.xpath("//div[@class=\"trending_block\"]"));
    d.getText();
       System.out.println(d.getText());
       
	}

}
