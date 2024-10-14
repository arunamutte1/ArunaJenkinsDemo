//Assignment-15(TestNG class by using Xapth)
//-------------------------------
//open https://www.sephora.com/ URL 
//click on New Menu
//click on any product
//click on Add to Basket
//Click on View Basket
//Click on Checkout
//Click on Check Out as a Guest

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment15_SephoraAutomation_usingXpath {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sephora.com/");
		driver.close();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//span[@data-at='sign_in_header']")).click();
  }
		
}
