package maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class Base {

	public static WebDriver driver;		
	
	public static WebDriverWait wait;
	
	@BeforeSuite
	public void initialize()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lap-1100\\Documents\\Selenium\\Gecko Driver\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		wait=new WebDriverWait(driver,300);
		
		String demo_URL="https://demo.applitools.com/";
		
		driver.get(demo_URL);
		
		driver.manage().window().maximize();
	}
	
}
