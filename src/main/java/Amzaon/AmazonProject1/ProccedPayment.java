package Amzaon.AmazonProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProccedPayment {
	WebDriver driver;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement pay;
void payamne() {
	pay.click();
}
ProccedPayment(WebDriver driver){
	PageFactory.initElements(driver, this);
	
}
}
