package hyrtutorials;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAnnotations {
	//Annotations control the Execution
/*TC 1 ->
 *Login ->@BeforeMethod ,
 *Search -> @Test
 *Logout -> @AfterMethod
 *Login -> @BeforeMethod
 *Advsearch -> @Test
 *Logout -> @AfterMethod  
	*/
@BeforeMethod	// 2 times it gets executed 
void Login() {
	System.out.println("Before method annotaion class: Login : Pre - requiste ,executes every time  before method(Test), 2 @Test, 2 times login() logout() need to run  ");
}	


@Test
void Search() { // executes 1 
	System.out.println("11. BeforeMethodAnnotationsclass: Search :ACtual Test, after login,but it doesnot consider as Test  ");
}
@AfterMethod
void Logout() {
	System.out.println("Logout :executes after every method(Test), 2 @Test, 2 times login() logout() need to run  ");
}
	
@BeforeMethod
void login() {
	System.out.println("Before method annotaion class: Login: Pre - requiste ,executes every time  before method(Test),but it doesnot consider as Test, 10 @Test, 10 times login() need to run  ");
}

@Test(dependsOnMethods = "Search")
void advsearch() {
	System.out.println("Adv search : ACtual before after login, 2 @Test, 2 timeslogin() and  logout() need to run");
}


@AfterMethod
void logout() {
	System.out.println("executes after every Test method, but it doesnot consider as Test  ");
} 

}
