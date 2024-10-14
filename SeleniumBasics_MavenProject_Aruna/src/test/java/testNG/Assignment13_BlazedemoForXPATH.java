//Assignment-13 [Xpath]
//=================
//book a flight ticket.
//https://blazedemo.com/
//Fill all the Attributes using XPATH
//Final page content have to print into Console

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment13_BlazedemoForXPATH {
  @Test
  public void f() {
	  
	  WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		Select dep_city = new Select(driver.findElement(By.name("fromPort")));
		dep_city.selectByVisibleText("São Paolo");
		
		Select destination_city = new Select(driver.findElement(By.name("toPort")));
		destination_city.selectByVisibleText("London");
		
		//driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click(); using copy xpath element - method1
		
		//Syntax-1 using basic xpath 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Syntax-2 [Length/Index xpath] using in case of duplicate elements
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		String bookingdetails = driver.findElement(By.xpath("/html/body/div[2]/div")).getText();
		System.out.println(bookingdetails);
		driver.close();
		
		
		
  }
}
