package hyrtutorials;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {
 /* There is no workaround until close the popups or alert
	Alert windows are not web element (cannot inspect , not even text field ) 
    Alert storevar = driver.switchTo().alert();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	driver.switchTo().alert().sendKeys();
	driver.switchTo().alert().getText();   */

	WebDriver driver;
	@SuppressWarnings({ "deprecation", "deprecation" })
	@Test(priority = 1)
	void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");	
	//	driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

		//scroll down 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,320)");
		
		//Simple OK button :-  accept()
		WebElement clkbtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clkbtn.click();

		Alert simplepopup = driver.switchTo().alert();
		System.out.println("Simple popup "+ simplepopup.getText());//Simple popup You clicked a button
		String ActualText = simplepopup.getText();
		String expectedText = "You clicked a button";
		Assert.assertEquals(ActualText, expectedText);
		
		simplepopup.accept(); // it disappears.
		Thread.sleep(2000);
		clkbtn.click();
		driver.switchTo().alert().accept();
		//====================================================================================
			
		// Alert popup with Ok button and cancel button 
		js.executeScript("window.scrollBy(0,230)");
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000); // wait untill it gets loaded
		
		Alert text = driver.switchTo().alert(); // accepts and go off 
		System.out.println("Text is :"+ text.getText());//Text is :This alert appeared after 5 seconds
	    text.accept();
		//===========================================================================
		
		// prompt or alert button with Text field :- switchTo().alert().sendKeys(),accept()dismiss()
		js.executeScript("window.scrollBy(0,340)");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		//popup entry 	
		Alert popup = driver.switchTo().alert();
	System.out.println("Prompt popup Text field :- "+ popup.getText());
	//Prompt popup Text field :- Please enter your name
		popup.sendKeys("I am in Alert box ");   
		Thread.sleep(2000);
		//popup.dismiss(); you entered text wont appear/
		popup.accept(); //popup closed 
		// back to main page 
		WebElement result = driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println("You eneterded" + result.getText());//You eneterdedYou entered I am in Alert box
		

	
	
	}
}
