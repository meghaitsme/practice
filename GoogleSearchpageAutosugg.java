package hyrtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchpageAutosugg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ( JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		
		List<WebElement> sugglist = driver.findElements(By.xpath("//ul[@role='listbox']"));
		//main list the xpath all 
		for(WebElement sugpoplist : sugglist) {
			if(sugpoplist.getText().equals("selenium webdriver")) {
				sugpoplist.click();
				System.out.println(sugpoplist);

				
			}
		}
		
		
		
		
		
		
	}

}
