package hyrtutorials;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopup {

	public static void main(String[] args) throws InterruptedException {
		//Authenticated popup :- 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");


		//Assignment :- skip un & pswd, cick on login btn , open popup 

		driver.get("https://mypage.rediff.com/login/dologin");
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		
		Alert	text = driver.switchTo().alert();
		System.out.println("get the text "+ text.getText());//Please enter captcha
		text.accept();




	}

}
