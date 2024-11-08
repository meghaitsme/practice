package hyrtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//  1 window open another window , like embedded frame , it is a WEB ELEMENT 

public class TestFramesEmbeddedanotherframe {

	@SuppressWarnings("deprecation")
	public static void main(String args[])throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//open url 
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");

		//implicitlywait 
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(("window.scrollBy(0,456)"));

		//1st enter the text 
		WebElement entertxt = driver.findElement(By.id("name"));
		entertxt.sendKeys("Entry to frame ");

		WebElement frame1 = driver.findElement(By.id("frm1"));   // identify the reference to launch the WebDriver 
		//open frame1: switch to frame 
		driver.switchTo().frame(frame1);

		// menu 
		WebElement drpdwn = driver.findElement(By.id("selectnav2"));
		Select menu = new Select(drpdwn);
		menu.selectByVisibleText("Contact"); //-> contact page is opened 

		System.out.println( menu.getAllSelectedOptions());
		//id: selectnav2]] -> tag name: option]]
		menu.selectByIndex(1); //Menu 
		menu.selectByIndex(2); //Home
		menu.selectByIndex(3); //Contact 

		

		menu.selectByValue("undefined"); //blank
		
		Thread.sleep(2000);
	//	menu.selectByValue("https://www.hyrtutorials.com/"); //home
		//Thread.sleep(2000);
		//menu.selectByValue("https://www.hyrtutorials.com/p/contactus.html"); // contact 


driver.switchTo().defaultContent(); 
entertxt.clear();
Thread.sleep(2000);
entertxt.sendKeys("back to mainpage ");


	}
}
