package Zerodhaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	 WebDriver driver;
	
	@FindBy (xpath = "//span[text()='Orders']") private WebElement oerders;
	@FindBy (xpath = "//span[text()='Holdings']") private WebElement holdings;
	@FindBy (xpath = "//span[text()='Positions']") private WebElement positions;
	@FindBy (xpath = "//span[text()='Funds']") private WebElement funds;
	@FindBy (xpath = "//span[text()='Apps']") private WebElement apps;
	@FindBy (xpath = "//span[text()='SG']") private WebElement ProfileName;
	@FindBy (xpath="//a[@target='_self']") private WebElement logout;
	@FindBy (xpath = "//button[@type='button']") private WebElement buybutton;
	
	public Homepage(WebDriver driver) {
	  
	   PageFactory.initElements(driver, this);
   }
   
	
    public void oreders() {
    	
    	oerders.click();
    }
    public void holdings() {
    	
	holdings.click();
    }
  
      public void positions() {
	
	positions.click();
}
    public void  funds() {
	
	funds.click();
}
         public void apps() {
	
	 apps.click();
}
         public void Profile() {
         	
         	ProfileName.click();
         }
         
         public void logoutclick() {
          	
        	 logout.click();
          }
         public void buybutt() {
        	 buybutton.click();
         }
         
         
         }
         



