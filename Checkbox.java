package hyrtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/"); //Inner checkbox :-   
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		List<WebElement> chk = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
		
		// to select all 
	for(int i=0; i < chk.size(); i++) {
		chk.get(i).click();
	}
	for(int i=0; i < chk.size()-3; i++) { // last 3 are selected 
		chk.get(i).click();
	}
	for(int i=2; i < chk.size()-1; i++) { // from 3rd  are selected 
		chk.get(i).click();
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		driver.get("https://demoqa.com/checkbox"); //Inner checkbox :-   
		driver.manage().window().maximize();
		
		js.executeScript("window.scrollBy(0,456)");
		
		WebElement expand = driver.findElement(By.xpath("//button[@title='Toggle']"));
		expand.click(); 
		
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("//div[@class='check-box-tree-wrapper']"));
		System.out.println("reusult :" + result.getText());
		result.click();
		reusult :Home
Desktop
Documents
Downloads
		
		Thread.sleep(2000);
		List<WebElement> foldercheckbx = driver.findElements(By.xpath("//span[@class='rct-checkbox']"));
	for(int i=0; i < foldercheckbx.size() ;i++) {
		foldercheckbx.get(i).click();
		System.out.println("innercheckbox " +foldercheckbx.get(i).getText());
		Thread.sleep(2000); 
		
		 * innercheckbox 
innercheckbox 
innercheckbox 
innercheckbox
	}		
	
	//You have selected :documents
	//	workspace react angular veu office public private classified general
		
	//take element for main tree , then u can able to find 	
	/*	WebElement result = driver.findElement(By.xpath("//div[@class='check-box-tree-wrapper']"));
		System.out.println(result.getText());

/*You have selected : 
Home
You have selected :
home
desktop
notes
commands
documents
workspace
react
angular
veu
office
public
private
classified
general
downloads
wordFile
excelFile
 * */   

	}

}
