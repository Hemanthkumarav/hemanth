package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javapagetwo {
	
		public static void main(String[]args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			//driver.findElement(By.xpath("//span[contains(.,'Introduction to Java - W3Schools')]")).click();
			List<WebElement> f = driver.findElements(By.xpath("//span[@class='S3Uucc']/parent::h3"));
			Thread.sleep(5000);
			for (WebElement h : f) {
				System.out.println(h.getText());
				
			}
			
			
}
	}
