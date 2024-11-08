package hyrtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imageclick {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");   // Tagname is image , then use image click logic
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
