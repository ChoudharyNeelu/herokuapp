package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/"); // landing to the herokuapp site

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();

		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();
		driver.switchTo().alert().accept();

	}

}
