package hyrtutorials;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	 // So , better to use Hard Assetion
	SoftAssert soft;//fail still continues 
	
	//Soft Assertion in TestNG allows a test to continue executing even if one or more assertions fail.
	
	@Test
	void Test_softassertion(){ //Hard assertion is a last step , (we use more 99 % hard , soft assertion rare 1%)
		soft = new SoftAssert(); 
		
		System.out.println("1. executes ");
		System.out.println("2. executes ");  // use hard assertion :- SoftAssertclass used 
		
	//	soft.assertEquals(1, 1);//they r not static methods.
		soft.assertEquals(1, 2); // condition failed , 3 and 4 th not execeuted .
		
		// After validating with assertion, dont perform any operation/validation. 
		// if u want to perform other task after validation, then use Soft assertion.
		System.out.println("3. condition true, continues execution"); //not executed 
		System.out.println("4. condition fails , stops the execution."); //not executed 
	
		soft.assertAll(); //Mandate 
	}
	
	@Test
	void Test_hardassertion(){ //Hard assertion is a last step , (we use more 99 % hard, soft assertion rare 1%)
		System.out.println("1. executes ");
		System.out.println("2. executes ");  // use hard assertion 
		
	//	Assert.assertEquals(1, 1); // 2nd diff , hard -> Assert class is used 
		Assert.assertEquals(1, 2); // condition failed , 3 and 4 th not execeuted .
		//Assert.assertEquals(1, 1);
		
		// After validating with assertion, dont perform any operation/validation. 
		// if u want to perform other task after validation, then use Soft assertion.
		
		System.out.println("hello");
		
		
/*1. executes 
2. executes 
FAILED: hardassertion
java.lang.AssertionError: expected [2] but found [1] 
		 */

	}

}
