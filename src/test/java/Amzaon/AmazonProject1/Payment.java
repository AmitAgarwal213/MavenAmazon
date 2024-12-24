package Amzaon.AmazonProject1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Payment extends LaunchQuit{
	@Test
public void runtest() throws IOException {
	
Login l7= new Login(driver);



l7.clickonlink();
l7.enteremail();
l7.continuebtn();
l7.enterpassword();
l7.clicksignup();
l7.searchsh();


FilterProduct f= new FilterProduct(driver);
f.brand();

FilterbySize s3= new FilterbySize(driver);
s3.filterbysize();
s3.clickonproduct();

Add_To_Cart a3= new Add_To_Cart(driver);

String parents= driver.getWindowHandle();
Set<String> child = driver.getWindowHandles();
Iterator<String> pc = child.iterator();
String parid= pc.next();
String childid = pc.next();
driver.switchTo().window(childid);

a3.productprice();
a3.productrating();
a3.addcart();
a3.addoncart();
a3.checkbox();
	
a3.Quantityincrease(7);


ProccedtoBuy p= new ProccedtoBuy(driver);
p.proceedButton();
p.selectAddress();
p.useThisads();

}
	
}
