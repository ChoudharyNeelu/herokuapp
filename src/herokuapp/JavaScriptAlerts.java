package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/"); // landing to the herokuapp site

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.linkText("JavaScript Alerts")).click(); // clicking on the JavaScript Alerts link
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();

		driver.switchTo().alert().accept(); // Switching to alert and accepting the alert

		System.out.println(driver.findElement(By.id("result")).getText()); //printing the action done on the alert i.e text displayed in the result section in the output

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.switchTo().alert().dismiss(); // Switching to alert and rejecting the alert
		System.out.println(driver.findElement(By.id("result")).getText()); //printing the action done on the alert i.e text displayed in the result section in the output

		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

		driver.switchTo().alert().sendKeys("Hello");

		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("result")).getText()); //printing the action done on the alert i.e text displayed in the result section in the output

	}

}
