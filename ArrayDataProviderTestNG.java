package hyrtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Registeration code                        Eg for Array :-
public class ArrayDataProviderTestNG extends BaseClassTestng{
	
	@DataProvider(name="Registersupplydata")
	public Object[][] loginData(){
		Object[][] data = new Object[2][4]; // 2 times , 4 colomns 
		data[0][0] = "Adams";
		data[0][1]= "paul";
		data[0][2] = "9876543210";
		data[0][3]= "Adamspaul";
		
		data[1][0] = "adreck";
		data[1][1]= "paul";
		data[1][2] = "9876543210";
		data[1][3]= "adreckpaul";
		
		return data;	
	}
	


	@Test(dataProvider = "Registersupplydata")
	public void launch(String fn,String ln, String phoneno,String un) throws Exception{
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	JavascriptExecutor js =  (JavascriptExecutor) driver; //scroll bar 
	js.executeScript("window.scrollBy(0,330)");
	Thread.sleep(2000);
	
	
	driver.findElement(By.name("firstName")).sendKeys(fn);
	Thread.sleep(1000);
	driver.findElement(By.name("lastName")).sendKeys(ln);
	Thread.sleep(1000);
	driver.findElement(By.name("phone")).sendKeys(phoneno);
	Thread.sleep(1000);
	driver.findElement(By.name("userName")).sendKeys(un);

/*	WebElement Address = driver.findElement(By.name("address1"));
	WebElement City = driver.findElement(By.name("city"));
	WebElement State_Province = driver.findElement(By.name("state"));
	WebElement Postal_Code = driver.findElement(By.name("postalCode"));
	WebElement Country = driver.findElement(By.name("country")); */	
	}
	
	
	

}
