package herokuapp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/"); // landing to the herokuapp site

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.xpath("//a[contains(text() ,'Add/Remove Elements')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).getText(),
				"Add Element");

		driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).getText(), "Delete");

		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).getText(),
				"Add Element");

	}

}
