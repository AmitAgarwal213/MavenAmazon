package Amzaon.AmazonProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterProduct {
@FindBy(linkText="Campus")
WebElement bran;
public void brand() {
	bran.click();
}
public FilterProduct (WebDriver driver){
	

	PageFactory.initElements(driver, this);
}
}
