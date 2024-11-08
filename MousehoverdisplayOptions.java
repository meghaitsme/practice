package hyrtutorials;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MousehoverdisplayOptions {
	static WebDriver driver;

	@Parameters("browserName") //   String browser
	@BeforeTest
	public void initializebrowser(String browserName)
	{ 
		
		switch(browserName.toLowerCase()) {
		case "chrome" :  WebDriverManager.chromedriver().setup(); 
						 driver  = new ChromeDriver();
					      break;
					      
		case "ie" :  	WebDriverManager.iedriver().setup();
						driver = new InternetExplorerDriver();
						break;
			
		case "firefox": 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			default : System.err.println("Select any one chrome | ie  |  firefox ");
			break;
			}
		driver.manage().window().maximize();
	}

	@SuppressWarnings("deprecation")
	@Parameters("url")
	@Test(priority=1)
	void launchApp(String url) {
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@Test(priority=2)
	public void enterLoginDetails() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		//	driver.get("https://www.flipkart.com/");

	}

	@SuppressWarnings("unused")
	@Test(priority = 3)  //mousehowver depends on menu options are displayed 
	static
	void mousehower() throws Exception{  //   1. Movetoelement/mouse howver , 2. right click()/contextclick() 3. double click()

		Actions actclk = new Actions(driver);
		//	actclk.moveToElement(driver.findElement(By.xpath("//a[@class = '_1TOQfO']"))).perform();
		Actions ad = actclk.moveToElement(driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")));
		ad.click().perform();
		Actions usermngt = actclk.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")));
		usermngt.click().perform();
		Actions Users = actclk.moveToElement(driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']")));
		Users.click().perform();

		
	}
	 
/*	@Test(priority = 4)
	public void usertitle(String Name) {
	//	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));

		WebElement Username = driver.findElement(By.xpath("//div[@class=\"oxd-topbar-header-title\"']"));
		assertTrue(Username.isDisplayed());
		System.out.println(Username.getText());

		
		} */

	@AfterClass
	void TearDown() throws Exception{

		Thread.sleep(2000);
		driver.quit();

	}

}
