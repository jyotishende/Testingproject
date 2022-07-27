package Zerodhaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	// step 1 declare variable globally (data member)
	
	@FindBy(xpath="//input[@type='text']") private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	
	@FindBy(xpath="//BUTTON[@TYPE='submit']") private WebElement loginbutton;
	
	//step 2 initialization global variable data member
	
	  public Loginpage(WebDriver driver) {
		
		
	PageFactory.initElements(driver, this);
		
		
	}
	// 3 step method creation 
	
	public void enterUN() {
		
		username.sendKeys("DI0912");
		
	}
	public void enterPW() {
		
		password.sendKeys("shiva123");
	}
	public void enterclick() {
		
		loginbutton.click();
	}

}
