package hyrtutorials;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {
	public static void main(String args[]) throws InterruptedException {
		// 1. Select only 1 checkbox among 'n', find unique locator attribute 

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js =  (JavascriptExecutor) driver; //scroll bar 
		js.executeScript("window.scrollBy(0,430)");


		WebElement text = driver.findElement(By.xpath("//label[text()='Days:']"));
		System.out.println(text.getText()); //Days:

		//1. Select only 1 checkbox 
			driver.findElement(By.xpath("//input[@id='sunday']")).click(); // clicked

		//	2. Select all the checkbox 
		Thread.sleep(2000);

		List<WebElement> dayschkbx = driver.findElements(By.cssSelector("input.form-check-input[type='checkbox']"));
		for(int i=0; i < dayschkbx.size();i++) // exacltly match for 7 , type = checkbox 
		{
			dayschkbx.get(i).click();
		} 

		Thread.sleep(2000);
		for(WebElement enhfor :dayschkbx) { // select all check box 
			enhfor.click(); // clicked 
			System.out.println(enhfor.getText());
		} 

		Thread.sleep(2000);
		//select only last 3 checkbox  , Total 7 checkbox = 7 - 3 = 4 
		for(int i=2; i <dayschkbx.size()-2; i++) {
			dayschkbx.get(i).click();                   // list index -> starts from 0 1 2 ....
		} 
		Thread.sleep(2000);
		for(int i=2; i <dayschkbx.size(); i++) {
			dayschkbx.get(i).click();                   // list index -> starts from 0 1 2 ....
		} 
		Thread.sleep(2000);
		for(int i=0; i <dayschkbx.size()-3; i++) {
			dayschkbx.get(i).click();                   // list index -> starts from 0 1 2 ....
		} 	 
		
		for(int i=0; i < dayschkbx.size(); i++) {
			if(dayschkbx.get(i).isSelected()) {
				dayschkbx.get(i).click();          // uncheck 
			}
		}
		
	}
}
