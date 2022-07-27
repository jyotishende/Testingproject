package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Zerodhaproject.Homepage;
import Zerodhaproject.Loginpage;
import Zerodhaproject.Loginpinpage;

public class Testhomepage {
	
	WebDriver driver;
	
	@BeforeClass
		public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	    driver = new ChromeDriver(opt);
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
		if(URL.equals(URL) && title.equals(title)) {
			System.out.println("PASS");
		}
		 else {
			 System.out.println("FAIl");}
		 }
	
		
		
		
	
	@Test   
	public void holding()  {
		System.out.println("---------holdings------------------");
		Homepage home =new Homepage(driver);
		home.holdings();
		String URL =driver.getCurrentUrl();
		String title = driver.getTitle();
		if(URL.equals(URL) && title.equals(title)) {
			System.out.println("PASS");
		}
		 else {
			 System.out.println("FAIl");}
		 }
		 @Test
			public void positions()  {
			 System.out.println("---------positions------------------");
				Homepage home =new Homepage(driver);
				home.positions();
				String URL =driver.getCurrentUrl();
				String title = driver.getTitle();
				if(URL.equals(URL) && title.equals(title)) {
					System.out.println("PASS");
				}
				 else {
					 System.out.println("FAIl");}
				 }
				
					 
				 
		 
				 @Test  
					public void funds()  {
					 System.out.println("---------funds------------------");
						Homepage home =new Homepage(driver);
						home.funds();
						String URL =driver.getCurrentUrl();
						String title = driver.getTitle();
						if(URL.equals(URL) && title.equals(title)) {
							System.out.println("PASS");
						}
						 else {
							 System.out.println("FAIl");}
						 }
				
						 @Test   
							public void apps()  {
							 System.out.println("---------apps------------------");
								Homepage home =new Homepage(driver);
								home.apps();
								String URL =driver.getCurrentUrl();
								String title = driver.getTitle();
								if(URL.equals(URL) && title.equals(title)) {
									System.out.println("PASS");
								}
								 else {
									 System.out.println("FAIl");}
								 }
						 
						
	
						 
						
						 
					
	
	
         


				@AfterMethod
				public void logout() throws InterruptedException  {
				System.out.println("After Method");
				Homepage home =new Homepage(driver);
				Thread.sleep(2000);
				home.Profile();
				home.logoutclick();
				driver.findElement(By.xpath("//a[text()='Change user']")).click();
				
				
			
		 }
		 
			
	        
            
			@AfterClass
			public void close() {
				System.out.println("After class");
				driver.close();
			}
			
			
}