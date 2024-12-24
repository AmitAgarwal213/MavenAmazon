package Amzaon.AmazonProject1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	 WebDriver driver;
@FindBy(css=".nav-line-1-container")
WebElement hyperlink;
@FindBy(xpath="//input[@type='email']")
WebElement email;
@FindBy(css= "#continue")
WebElement submit;
@FindBy(css="input[type='password']")
WebElement password;
@FindBy(css="#signInSubmit")
WebElement sign;
@FindBy(xpath="//input[@type='text']")
WebElement search;

public void clickonlink() {
	hyperlink.click();
}
public void enteremail() {
	email.sendKeys("amitaggarwal1213@gmail.com");
}
public void continuebtn() {
	submit.click();
}
public void enterpassword() {
	password.sendKeys("eohDTR9m");
}
public void clicksignup() {
	sign.click();
}
public void searchsh() {
	search.sendKeys("shoes"+Keys.ENTER);
}

public Login(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
