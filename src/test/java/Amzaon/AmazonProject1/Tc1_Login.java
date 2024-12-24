package Amzaon.AmazonProject1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc1_Login extends LaunchQuit {
@Test
public void loginamazon() {
	//ChromeOptions option  = new ChromeOptions();
//	option.addArguments("--headless=new");
	//ChromeDriver driver = new ChromeDriver();
	//driver.get("");
//	LaunchQuit lonch = new LaunchQuit();
//	lonch.lauch();
	
	Login l2 = new Login(driver);
	//lonch.lauch();
   l2.clickonlink();
l2.enteremail();
l2.continuebtn();
l2.enterpassword();
l2.clicksignup();
l2.searchsh();


}
}
