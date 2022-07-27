package Zerodhaproject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareList {
	@FindBy(xpath = "//input[@type='text']")private WebElement search;
	@FindBy(xpath = "//span[text()='HDFCBANK']")private WebElement hdfc_bank;
	@FindBy(xpath = "//span[text()='HINDUNILVR']") private WebElement hindun_liver;
	@FindBy(xpath = "//span[@class='icon icon-trash']") private WebElement delete;
public ShareList(WebDriver Driver) {
	PageFactory.initElements(Driver, this);
	
}
public void add_share(String share) {
	search.sendKeys(share);
	search.sendKeys(Keys.ENTER);
}
public WebElement hdfc_bank () {
	return hdfc_bank;
	
}
public WebElement hindun_liver() {
	return hindun_liver;
	
}
public void delete() {
	delete.click();
}
}