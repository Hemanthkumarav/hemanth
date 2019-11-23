package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	WebElement search =driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	search.sendKeys("shirts",Keys.ENTER);
	Thread.sleep(2000);
	//driver.findElement(By.xpath(xpathExpression))

}
}
