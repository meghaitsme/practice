package hyrtutorials;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupExplicitwait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		//Without using switchTo().alert()

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,455)");

		//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();//click on button

		//popup entry :- driver.switchTo().alert();
		Alert popup = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Prompt popup Text field :- "+ popup.getText());
		//Prompt popup Text field :- Please enter your name
		
		popup.sendKeys("HELLOIAMMEGHA");    
		Thread.sleep(2000);
		popup.accept(); //popup closed    dismiss()

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
