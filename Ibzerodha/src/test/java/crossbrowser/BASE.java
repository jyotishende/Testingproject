package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BASE{
	WebDriver driver;
	public static WebDriver openchromebrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	   WebDriver driver = new ChromeDriver(opt);
	   return driver;
		
		
	}
	public static WebDriver openFireFoxbrowser() {
		System.setProperty("WebDriver.gecko.driver","C:\\Users\\Admin\\Downloads\\gekodriver.exe");
				
				ChromeOptions fir = new ChromeOptions();
				fir.addArguments("--disable-notifications");
			   WebDriver driver = new FirefoxDriver();
			   return driver;
				
				
			}
	public static WebDriver openedegebrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\msedgedriver.exe");
		
				
			   WebDriver driver = new EdgeDriver();
			   return driver;
	}
}

