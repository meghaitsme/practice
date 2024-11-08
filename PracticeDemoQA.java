package hyrtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDemoQA {

	public static void main(String[] args) throws InterruptedException {
		/*Launch a new Chrome browser.
Open Shop.DemoQA.com
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.
		 *///1. launch the browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//2. open url
		String url = "https://parabank.parasoft.com/parabank/services.htm;jsessionid=3FE74633253D48546F79E8F7E1A58CD5";
		driver.get(url);  //it opens the url current browser , accepts parameter , return nothing

		//3. get page title and title length, print page title and title length 
		String title = driver.getTitle();
		int titlelen = driver.getTitle().length();

		//4. print page title and title length 
//		System.out.println("title of the url " + title);/ParaBank | Services
		System.out.println("title length of the url " + titlelen); //19

		System.out.println("Current url "+ driver.getCurrentUrl());
		//5. Get Page URL and verify if it is a correct page opened
		String expected = driver.getCurrentUrl();
		if(url.equals(expected)) { //valid url  , if u give == , throws invalid 
			System.out.println("valid url ");
		} else {
			System.out.println("invalid url ");
		}

		//6. Get Page Source (HTML Source code) and Page Source length
		String code = driver.getPageSource();
		System.out.println(code); //<html> ..... </html>

//7.page source length 
		System.out.println(code.length());//25971
		
//8. close the browser 
		driver.quit();
	}

}
