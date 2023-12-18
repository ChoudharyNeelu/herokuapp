package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// username & password: admin
		// url needs to be changed for authentication
		// https://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		driver.manage().window().maximize(); // maximizing the screen

		String textToBeVerified = "Congratulations! You must have the proper credentials.";
		String textOnTheWebpage = driver.findElement(By.xpath("//div[@class = 'example']/p")).getText();

		if (textToBeVerified.equals(textOnTheWebpage)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}
}
