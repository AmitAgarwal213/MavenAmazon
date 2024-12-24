package Amzaon.AmazonProject1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterbySize {
	WebDriver driver;
@FindBy (xpath="//button[@aria-label='7']")
WebElement size;

@FindBy (xpath="//div[@class='a-section aok-relative s-image-tall-aspect']")
//@FindBy(xpath="//button[@class='a-button-text']")
WebElement click;

public void filterbysize() throws IOException {
	size.click();	
//	TakesScreenshot a = (TakesScreenshot) driver;
//	File source = a.getScreenshotAs(OutputType.FILE);
//	File destination = new File("C:\\Users\\AMIT AGARWAL\\eclipse-workspace\\AmazonProject1\\.settings\\ScreenShort\\Amit.jpeg");
//	FileHandler.copy(source, destination);
}

public void clickonproduct() {
	click.click();
}
	public FilterbySize(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
}
}
