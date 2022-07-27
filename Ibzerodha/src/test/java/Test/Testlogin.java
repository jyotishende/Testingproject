package Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Zerodhaproject.Homepage;
import Zerodhaproject.Loginpage;
import Zerodhaproject.Loginpinpage;

public class Testlogin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
		 
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://kite.zerodha.com/");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // for first step
       Loginpage log = new  Loginpage(driver);
        
        log.enterUN();
        log.enterPW();
        log.enterclick();
        
       
        Thread.sleep(2000);
        // for second step
        Loginpinpage log2 = new Loginpinpage(driver);
        
        log2.enterPIN();
       
        log2.entercontinue();
        
       
        
        // for third step
        Homepage hom =new Homepage(driver);
        
       
        hom.oreders();
        hom.holdings();
        hom.funds();
        hom.positions();
        hom.apps();
        hom.Profile();
       
      
	}

}



