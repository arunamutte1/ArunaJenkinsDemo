package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.SelectChannelEndPoint;

public class AutomationDemoSiteRegistration {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("anu");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("j");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("tampa ,florida");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("arunamutte@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8197713222");

		// WebElement femaleradiobutton =
		// driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]"));
		// femaleradiobutton.click();
		// if (!femaleradiobutton.isSelected())
		// {
		// femaleradiobutton.click();

		// }
		// driver.findElement(By.id("FeMale")).click();

		// driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("arunamutte@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]")).click();
		driver.findElement(By.id("checkbox2")).click();
		
		driver.quit();
		

	}

}
