	package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		//open browser
		//enter URL
		//Type credentials
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
