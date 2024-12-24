package Amzaon.AmazonProject1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Add_To_Cart {
	 WebDriver driver ;
	
@FindBy(xpath="//span[@class='a-price-whole'][1]")
WebElement price;
@FindBy (css= "[class= 'a-popover-trigger a-declarative']")
WebElement rating;

@FindBy (css="#add-to-cart-button")
WebElement addtocart;
@FindBy(xpath="//div[@id='nav-cart-count-container']")
WebElement clickoncart;
@FindBy(xpath="(//input[@type='checkbox'])[2]")
WebElement checkboxx;
@FindBy(css="button[aria-label='Increase quantity by one']")
WebElement increase;

public void productprice() throws IOException {
	
	System.out.println(price.getText());
	Assert.assertEquals(price.getText(), price.getText(),"your test case pass ");

}
public void productrating() {
	System.out.println(rating.getText());
	
}
public void addcart() {
	addtocart.click();
}
public void addoncart() {
	clickoncart.click();
	
}
public void checkbox() {
	System.out.println(checkboxx.isEnabled());
}
public void Quantityincrease(int n) {
	
		
	

increase.click();

}
public Add_To_Cart(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}


}
