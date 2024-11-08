package hyrtutorials;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion { // these r static methods, so they r accessed directly .
	
	@Test
	void relational() {
		
		Assert.assertTrue(1==2);  //fails 
		Assert.fail();
	}
	
	@Test 
	void valuetrue(){
	Assert.assertTrue(false); //java.lang.AssertionError: did not expect to find [true] but found [false]
	//it should be true, but displayed false 
	}
	
	@Test
	void valuefalse(){
		Assert.assertTrue(true); //PASSED: valuefalse
	}
	
	
	@Test
	void notequal() {
		Assert.assertNotEquals(123,1236); // should not equal so, passed 
		Assert.assertNotEquals(123,123); //both r same , so failed 
	}
	
	@Test
	void testString() {
		Assert.assertEquals("welcome", "welcome"); //PASSED: testString
		System.out.println("1 testString ");//1 testString 
		//PASSED: testString
	}
	@Test
	void testStringint() { 
		Assert.assertEquals("123", 123,"String and number so fails ");
		//java.lang.AssertionError: String and number so fails  expected [123] but found [123]

	}
	
	@Test
	void testintvalue() {
	int a = 20; //if 2 int values r equal , Test is passed , else assertion error is thrown.
		int b= 30;
		Assert.assertEquals(a, b);
		System.out.println("2 test int ");//java.lang.AssertionError: expected [30] but found [20]
	}
	
	@Test
	void testExpectedactual() {
		String expected_req = "opencart"; //if 2 strings r equal -Test is passed , else assertion error thrown
		String actual_website = "openart";
		Assert.assertEquals(expected_req,actual_website); //Hard assertion 
		
		if(expected_req.equals(actual_website)) { // using assertion 
			System.out.println("Passed ");
			Assert.assertTrue(true); //Hard assertion is used 
		} else {
			System.out.println("failed");
			Assert.assertTrue(false);
	    /*	failed
			FAILED: testTitle
			java.lang.AssertionError: expected [openart] but found [opencart]
		*/    
		}
  }
}