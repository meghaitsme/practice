package hyrtutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager; 

public class Handledropdown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php"); //Simple drop down 
		driver.manage().window().maximize();

		JavascriptExecutor js = ( JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,456)");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//Country field :-  select tag 
		WebElement  selecttag = driver.findElement(By.name("country")); 
		//Select any 1 
		Select country = new Select(selecttag);
		System.out.println( country.getOptions()); // tagname = option is displaying 
		
		List<WebElement> countrylist = country.getOptions(); //single option locator we can find , but all we need
		for(WebElement option :countrylist) {
			if(option.getText().equalsIgnoreCase("CUBA")) {
				option.click();
				System.out.println("selected option is "+ option.getText());
				break;
			}
	}

/*		country.selectByVisibleText("DENMARK"); 
		Thread.sleep(2000);
		country.selectByValue("AUSTRALIA");
		Thread.sleep(2000);
		country.selectByIndex(25); //9-ARMENIA 20-BASA DE INDIA   25-BERMUDA

		System.out.println(selecttag.getText());/*ALBANIA
ALGERIA
AMERICAN SAMOA
ANDORRA
ANGOLA
ANGUILLA
ANTARCTICA ..... */
 
		
//		For 1 DROPDOWN , suppose for multpile dropdown in a page - write a generic code , call the method 
//	and pass the parameters 
		//Without using select option  --- Simple dropdown 
}
}
