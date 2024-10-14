package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSiteLogout {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		
		// code to enter invalid credentials with error message
	
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[10]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
		driver.findElement(By.name("username")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
		//code to register and logout 
		driver.findElement(By.name("email")).sendKeys("arunamutte1@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("Aruna@12345");
		driver.findElement(By.name("register")).click();
		
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
		driver.quit();

	}

}
