//Assignment-12
//=================
// https://cricclubs.com/ColoradoCricket
// Players>>Player Search>>
//Name editbox>>Type any name like Sravan
//Click on search button
// Click on Player name in the below table

package testNG;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment12DemoCricktplayerdata {

	@Test
	public void f() throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cricclubs.com/ColoradoCricket");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// create an object for Action class
		Actions act = new Actions(driver);
		// move mouse pointer to players menu
		act.moveToElement(driver.findElement(By.linkText("Players"))).build().perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("firstName")).sendKeys("Aruna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"searchPlayer\"]/div/div[7]/div[1]/div/div/input")).click();
		Thread.sleep(1000);

		// scroll up
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoview();",
				driver.findElement(By.linkText(" Arunachalam Lakshminarayanan (777109)  (InActive)")));
		Thread.sleep(1000);
		driver.findElement(By.linkText(" Arunachalam Lakshminarayanan (777109)  (InActive)")).click();
		Thread.sleep(1000);

		// get player details
		String playerdetails = driver.findElement(By.className("col-sm-6")).getText();
		System.out.println(playerdetails);
	}

}
