package hyrtutorials;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {    // apache commons io dependency 

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com"); //Simple drop down 
		driver.manage().window().maximize();

		JavascriptExecutor js = ( JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,456)");
		
		//we cannot create an instance for interface 
		
		interviewInterface.capturescreenshot(driver, "Img1.png"); // Interface 

		driver.quit();
	}

}
