package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/"); // landing to the herokuapp site

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.xpath("//a[contains(text(),'Hovers')]")).click();

		Actions a = new Actions(driver);
		// moving to user 2
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][2]"))).build().perform();
		// clicking on View profile link of user2
		a.moveToElement(driver.findElement(By.linkText("View profile"))).click().build().perform();

	}
}