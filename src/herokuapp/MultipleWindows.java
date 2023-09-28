package herokuapp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/"); // landing to the herokuapp site

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		// clicking on Click here link to open the child window
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		// switching to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		// switching back to parent window
		driver.switchTo().window(parentId);

	}

}
