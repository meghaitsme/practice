package hyrtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationcommands {

	public static void main(String[] args) {
		/*Launch new Browser
Open DemoQA.com website
Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
Come back to Home page (Use 'Back' command)
Again go back to Registration page (This time use 'Forward' command)
Again come back to Home page (This time use 'To' command)
Refresh the Browser (Use 'Refresh' command)
Close the Browser */
		  
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();


	}

}
