package Amzaon.AmazonProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProccedtoBuy {
	WebDriver driver;
@FindBy(css="input[name='proceedToRetailCheckout']")
WebElement procedbtn;
 @FindBy(xpath="(//input[@type='radio'])[2]")
 WebElement selectadd;
 
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement usethisad;
	public void proceedButton() {
		procedbtn.click();
	}
	public void selectAddress() {
		selectadd.click();
	}
	public void useThisads() {
		usethisad.click();
	}
	public ProccedtoBuy(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
}
