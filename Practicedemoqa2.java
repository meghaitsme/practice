package hyrtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicedemoqa2 {
	/*Launch a new Chrome browser.
	Open ToolsQA Practice Automation Page for Switch Windows: https://demoqa.com/browser-windows/
	Use this statement to click on a New Browser Window button "driver.findElement(By.id("New Browser Window")).click();"
	Close the browser using close() command
	 */
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://demoqa.com/browser-windows/");

		JavascriptExecutor js = (JavascriptExecutor) driver2;
		js.executeScript("window.scrollBy(0,340)");
		
		WebElement newtab = driver2.findElement(By.xpath("//button[@id='tabButton']")); //invalid session id 
		WebElement newwindow = driver2.findElement(By.xpath("//button[@id='windowButton']"));
		WebElement newwindowmsg = driver2.findElement(By.xpath("//button[@id='messageWindowButton']"));
		Thread.sleep(2000);
		newtab.click();
		
		Thread.sleep(2000);
		newwindow.click();
		Thread.sleep(2000);
		newwindowmsg.click();
		Thread.sleep(2000);
		
		driver2.close(); //not closed 
		driver2.quit(); //it closes all the windows which r opened by driver

	}

}
