package Amzaon.AmazonProject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class  LaunchQuit {
	WebDriver driver ;
	@BeforeTest
	public void lauch() {
		 new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterTest
	public void quitDriver() {
	driver.close();
	
	}
}
