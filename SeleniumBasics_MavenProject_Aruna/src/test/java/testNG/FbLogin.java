package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbLogin {
  @Test
  public void facebook() {
	  
	//click on login
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("arunamutte@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("abcd");
			driver.findElement(By.name("login")).click();
					

		}
	  
  }

