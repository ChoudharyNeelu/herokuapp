package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/"); // landing to the herokuapp site

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.linkText("Checkboxes")).click();

		System.out.println("Earlier checkboxes status was: ");

		System.out.println("Checkbox 1 was selected : "
				+ driver.findElement(By.xpath("//input[@type = 'checkbox'][1]")).isSelected());
		System.out.println("Checkbox 2 was selected : "
				+ driver.findElement(By.xpath("//input[@type = 'checkbox'][2]")).isSelected());

		if (driver.findElement(By.xpath("//input[@type = 'checkbox'][1]")).isSelected()
				|| driver.findElement(By.xpath("//input[@type = 'checkbox'][2]")).isSelected()) {
			driver.findElement(By.xpath("//input[@type = 'checkbox'][1]")).click();
			driver.findElement(By.xpath("//input[@type = 'checkbox'][2]")).click(); // to unselect the checkbox
		} else {
			driver.findElement(By.xpath("//input[@type = 'checkbox'][1]")).click(); // to select the checkbox
																					// if not selected earlier
			driver.findElement(By.xpath("//input[@type = 'checkbox'][2]")).click();
		}

		System.out.println("-------------------------------");
		System.out.println("After performing action on checkboxes, their status are: ");

		System.out.println("Checkbox 1 was selected : "
				+ driver.findElement(By.xpath("//input[@type = 'checkbox'][1]")).isSelected());
		System.out.println("Checkbox 2 was selected : "
				+ driver.findElement(By.xpath("//input[@type = 'checkbox'][2]")).isSelected());
	}

}
