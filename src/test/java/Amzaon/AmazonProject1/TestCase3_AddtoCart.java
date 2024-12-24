package Amzaon.AmazonProject1;


import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase3_AddtoCart {
@Test
public void addcart() 	throws InterruptedException, IOException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?");
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

Add_To_Cart a= new Add_To_Cart(driver);

String parents= driver.getWindowHandle();
Set<String> child = driver.getWindowHandles();
Iterator<String> pc = child.iterator();
String parid= pc.next();
String childid = pc.next();
driver.switchTo().window(childid);

a.productprice();
a.productrating();
a.addcart();
a.addoncart();
a.checkbox();
	
a.Quantityincrease(7);
}


}




