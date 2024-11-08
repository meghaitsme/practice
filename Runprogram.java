package hyrtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
                                        //Eg for Inheritance 
public class Runprogram  extends BaseClassTestng{
	
@Test(priority = 1)
	public void Googlesearch() throws InterruptedException {
	
		//	driver.get("https://www.google.co.in/"); //opens specified url, waits until page get loaded before proceeding
		driver.navigate().to("https://www.google.co.in/"); // open url . provides additional capibilities to go back, forward on browser history .
		WebElement searchbx = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	
		if(searchbx.isEnabled()) {
			System.out.println("is enabled " + searchbx.isEnabled());//is enabled true
			searchbx.sendKeys("hyr tutorials", Keys.ENTER); //link is opened 
			System.out.println(driver.getCurrentUrl());//https://www.google.co.in/search?q=hyr+tutorials&sca_esv=159f37a1251190f9&source=hp&ei=VtoEZ4bXEc7k2roPjZ7v4Qk&iflsig=AL9hbdgAAAAAZwToZhkdd3KoSwpA4e42QdMhD0oY9yp9&ved=0ahUKEwiG2rzknP6IAxVOslYBHQ3PO5wQ4dUDCA8&uact=5&oq=hyr+tutorials&gs_lp=Egdnd3Mtd2l6Ig1oeXIgdHV0b3JpYWxzSDFQAFgucAB4AJABAJgBAKABAKoBALgBA8gBAPgBAZgCAKACAJgDAJIHAKAHAA&sclient=gws-wiz
			System.out.println(driver.getTitle()); //hyr tutorials - Google Search
		
		}else {
			Thread.sleep(2000);
			searchbx.clear();
		}	
			// quits the driver, close the associated window. 
			//driver.close(); //close the window, java.net.SocketException: where connection is null, reset the connection
			
		}

@Test(priority=2)
public void facebook() throws InterruptedException {
	driver.navigate().to("https://www.facebook.com/");
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	//1 TC 
	System.out.println(email.isEnabled()); //true 
		email.sendKeys("megha.k@gmail.com");
		System.out.println("The password that you've entered is incorrect.Forgotten password?");//text printed 
	
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	 
	System.out.println(password.isEnabled()); //true 
		password.sendKeys("megha.k@gmail.com");
	
	WebElement login = driver.findElement(By.xpath("//button[@name= 'login']"));
	System.out.println(login.isEnabled()) ; //true 
	System.out.println(login.getAttribute("value"));  // value is  1 

		login.click();
		
		}
}
