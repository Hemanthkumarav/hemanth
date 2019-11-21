package selenium;

public class Demo12356 {
	public static void main(String [] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
	}

}
