package Amzaon.AmazonProject1;


import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2FilterBysize extends LaunchQuit {
@Test
public void filterwithSize() throws IOException {
//	ChromeDriver driver = new ChromeDriver();
//	driver.get("https://www.amazon.in/?");
Login l4= new Login(driver);

l4.clickonlink();
l4.enteremail();
l4.continuebtn();
l4.enterpassword();
l4.clicksignup();
l4.searchsh();


FilterProduct f= new FilterProduct(driver);
f.brand();

FilterbySize s= new FilterbySize(driver);

s.filterbysize();
s.clickonproduct();




}
}
