package hyrtutorials;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public interface interviewInterface {  //Child class is InterviewDropdownLogic.java
	
	public  WebDriver driver = new ChromeDriver();
	public  JavascriptExecutor js = (JavascriptExecutor) driver;

	public default void selectfromdropdown(WebElement ele , String value) {
		Select drp = new Select(ele); //not iterable , so convert 
		//select 1 among them
		List<WebElement> alloptions = drp.getOptions();
		for(WebElement option : alloptions) {
			drp.selectByVisibleText(value);
			System.out.println("selected option is " + ele + "element is " + option.getText()); //selected only 1 
			break;
		}
	}	
	
	public static void capturescreenshot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File store = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(store, new File("./Screenshot/"+ fileName +""));
	}
	

}
