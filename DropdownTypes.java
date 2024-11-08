package hyrtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTypes {

	public static void main(String[] args) {
//1. Select drpdwn:- <select >    selectByVisibleText(""), selectByVisibleIndex(1), selectByVisible
//2. Bootstrap drpdown :-<ul> <a .....>     --------->direct click()
//3. hidden drpdwn -> div tag is visible , so debug from selector hub and get the list
		// note selector hub freezes after 5 secs .
		
	WebDriverManager.chromedriver().setup();	
	WebDriver	driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
