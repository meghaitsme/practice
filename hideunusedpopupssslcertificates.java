package hyrtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hideunusedpopupssslcertificates {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cacert.com");
		
		
		
	}

}
