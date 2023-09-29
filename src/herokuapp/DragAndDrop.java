package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/"); // landing to the herokuapp site

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();

		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		a.dragAndDrop(source, target).build().perform();
	}

}
