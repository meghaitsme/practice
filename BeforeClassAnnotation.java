package hyrtutorials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeClassAnnotation {
	/* 1. Login -> @BeforeClass -> 1 time 
	 * 2. search -> @Test
	 * 3. Adv search -> Test
	 * 4. Logout -> @AfterClass -> 1 time
	 */
	private int a;
	//1 setup configouration , before exceuting all test at once.
	@BeforeTest // execeutess 1 time, @ class level , before executing other methods.
	void login() {
		
		 a= 10;
		System.out.println("2. login : prerequiste, 1 time exceute, it aplies to the entire class ");
		System.out.println(" include initializing objects, setting up database connections,");
	}
	
	
	@BeforeMethod
	void setup() { //runs at each test step 
		System.out.println("runs before every test method in the class. "
				+ "This ensures that any necessary setup is performed fresh for each test.");
	}
	@Test
	void search() {
		System.out.println(a);
		System.out.println("7.search : perform Task ");
	}
	
	@Test
	void advSearch() {
		System.out.println(a);
		System.out.println("4. advSearch: advanced search , perform task ");
	}
	
	@AfterClass // executes 1 time 
	void logout() { 
		System.out.println("9. @Class level , after executing all methods ,execute this logout: logout, 1 time "); // logout executing 2 times -> AfterMethod 
	}

}
