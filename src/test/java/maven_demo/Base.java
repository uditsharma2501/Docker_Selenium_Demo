package maven_demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class Base {

	public static WebDriver driver;		
	
	public static WebDriverWait wait;
	
	@BeforeSuite
	public void initialize() throws MalformedURLException
	{
		String host="localhost";
		
		if(System.getProperty("HUB_HOST")!=null)
		{
			host=System.getProperty("HUB_HOST");
		}
		
		String completeURL="http://" + host + ":4545/wd/hub";
		
		DesiredCapabilities dc=null;
		
		if(System.getProperty("BROWSER")!=null && System.getProperty("BROWSER").equalsIgnoreCase("firefox"))
		{
			dc=DesiredCapabilities.firefox();
		}
		
		dc=DesiredCapabilities.chrome();
		this.driver= new RemoteWebDriver(new URL(completeURL), dc);
		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lap-1100\\Documents\\Selenium\\Gecko Driver\\geckodriver.exe");
//		
//		driver=new FirefoxDriver();
//		
//		wait=new WebDriverWait(driver,300);
		
		String demo_URL="https://demo.applitools.com/";
		
		driver.get(demo_URL);
		
		driver.manage().window().maximize();
	}
	
}
