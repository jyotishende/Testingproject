package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Zerodhaproject.Homepage;
import Zerodhaproject.Loginpage;
import Zerodhaproject.Loginpinpage;

public class Assertion {
	WebDriver driver;          //C:\Users\Admin\Downloads\gekodriver
	@BeforeClass
		public void launchbrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\msedgedriver.exe");
		driver = new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--disable-notifications");
	    //driver = new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		System.out.println("Before class");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void loginapp() {
		System.out.println("Before method");
		Loginpage login = new Loginpage(driver);
		login.enterUN();
		login.enterPW();
		login.enterclick();
		
		Loginpinpage  loginpin =new Loginpinpage  (driver);
		loginpin.enterPIN();
		loginpin.entercontinue();
	
	
	
	
	}
	@Test  
	public void orderpage()   {
		System.out.println("---------orders------------------");
		
		Homepage home =new Homepage(driver);
		home.oreders();
		String URL =driver.getCurrentUrl();
		String title = driver.getTitle();
		Assert.assertEquals(URL, URL);//pass
		Assert.assertNotEquals(title, URL);//fail
		//SoftAssert soft = new SoftAssert();
		//soft.assertEquals(URL, "jyoti");
	    
		
	}//result true test case =pass
	@Test (enabled = false)
	public void holding()  {
		System.out.println("---------holdings------------------");
		Homepage home =new Homepage(driver);
		home.holdings();
		String URL =driver.getCurrentUrl();
		//String title = driver.getTitle();
		boolean result = URL.equals("jyoti");
		Assert.assertTrue(result, "URL is not match");
	}
}