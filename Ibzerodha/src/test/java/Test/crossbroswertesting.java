package Test;


	

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Zerodhaproject.Homepage;
	import Zerodhaproject.Loginpage;
	import Zerodhaproject.Loginpinpage;



	public class crossbroswertesting  {
		WebDriver driver;
		Loginpage login;
		Loginpinpage loginpin;
		
        @BeforeTest
        @Parameters("browser")
	public  void lanchbrowser (String browser ) throws Exception {
	
	
	//ChromeOptions opt = new ChromeOptions();
	//opt.addArguments("--disable-notifications");
	//ChromeOptions fir = new ChromeOptions();
	//fir.addArguments("--disable-notifications");
	if (browser.equalsIgnoreCase(("chrome")) ){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver=  new ChromeDriver();	
	}
	
		
	else if (browser.equalsIgnoreCase(("edge")) ){ 
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	else {
		throw new Exception("Browser is not correct");
	}
   driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
			 }
		   @BeforeClass
			public void pomobject() {
			System.out.println("----------beforeclass-----------");
		      login = new Loginpage(driver);
			  loginpin =new Loginpinpage  (driver);
			  
		}
		@BeforeMethod
		public void loginapp() {
			System.out.println("Before method");
			
			login.enterUN();
			login.enterPW();
			login.enterclick();
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
					public void logout()  {
					System.out.println("-----------After Method------------");
					Homepage home =new Homepage(driver);
					
					home.Profile();
					home.logoutclick();
					driver.findElement(By.xpath("//a[text()='Change user']")).click();
					
					
				
			 }
			   @AfterClass
				public void close() {
					System.out.println("-------------After class------------");
					 login =null;
					 loginpin=null;
					driver.close();
				}
				

	}
