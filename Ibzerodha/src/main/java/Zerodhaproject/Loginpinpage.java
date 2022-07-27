package Zerodhaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpinpage {
	
	@FindBy (xpath = "//input[@id='pin']") private WebElement PIN;
	
	
	@FindBy (xpath = "//BUTTON[@TYPE='submit']") private WebElement Continue;
	
	
	public Loginpinpage(WebDriver driver) {
		
		
	PageFactory.initElements(driver, this);
	
	}
	
	public void enterPIN() {
		
		
    PIN.sendKeys("766529");
	
	}
	
	public void entercontinue() {
		
		
		Continue.click();
	}
	
   	 	
        
        
	        

}
