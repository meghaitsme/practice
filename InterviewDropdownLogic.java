package hyrtutorials;
//=================================================Reservationpage.java url tourist
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewDropdownLogic implements interviewInterface{
	// rt once , reusable code 

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		InterviewDropdownLogic obj = new InterviewDropdownLogic();

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		js.executeScript("window.scrollBy(0,456)");

		Thread.sleep(2000);
		WebElement Passengers = driver.findElement(By.name("passCount"));
		Thread.sleep(2000);
		obj.selectfromdropdown(Passengers, "3"); //selected option is 1
		Assert.assertEquals(3, 3, "3 is selected");
		Assert.assertFalse(false, "false condition");
		//	System.out.println(Passengers.getText()); // 1 2 3 4 

		WebElement Departing_From = driver.findElement(By.name("fromPort"));
		Thread.sleep(2000);
		obj.selectfromdropdown(Departing_From, "Paris"); //selected option is 1

		WebElement onmonth = driver.findElement(By.name("fromMonth"));
		Thread.sleep(2000);
		obj.selectfromdropdown(onmonth, "December"); //selected option is 1

		WebElement onday = driver.findElement(By.name("fromDay"));
		Thread.sleep(2000);
		obj.selectfromdropdown(onday, "26"); 

		WebElement Arriving_In = driver.findElement(By.name("toPort"));
		Thread.sleep(2000);
		obj.selectfromdropdown(Arriving_In, "London"); //selected option is 1

		WebElement Ronmonth = driver.findElement(By.name("toMonth"));
		Thread.sleep(2000);
		obj.selectfromdropdown(Ronmonth, "January"); //selected option is 1

		WebElement today = driver.findElement(By.name("toDay"));
		Thread.sleep(2000);
		obj.selectfromdropdown(today, "26"); 

		WebElement airlineselect = driver.findElement(By.name("airline"));
		Thread.sleep(2000);
		obj.selectfromdropdown(airlineselect, "Pangea Airlines"); 
		
		

	}

}
