package hyrtutorials;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*1. Testcase
 *2. Create listener interface
 *3. create testng.xml file , include both Test case and listerner interface 
 *   for all classes , there will b 1 listerner interface 1 child , multiple parents */

//This is Listerner class -> it is an utility file to generate report


public class mylisterner implements ITestListener {
	//Invoked each time before a test will be invoked. -> 
	//ITestListener inteface has abstract class . not implemented 
	//interface should be public 
	@Override
	public  void onStart(ITestContext context) {
	   System.out.println("1st. Post actions , onstart on annotation, this is listerner class , "
	   		+ "befor estarting onstart testmethod will trigger , testing is strated");
	   System.out.println("execute only once, before start testing all test  ");
	  }
	@Override
	public  void onTestStart(ITestResult result) { // 3noofTest = 3nooftimesitexecuteonTestStart
	    // not implemented
		System.out.println("3.6.10 this test will execute for every Test,before starting ");
	  }
	@Override
	public void onTestSuccess(ITestResult result) { //this method trigger,when my test is passed
	    // not implemented
		System.out.println("5.8. Test Passed, executes multiple times ");
	  }
	@Override
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		 System.out.println("Test failed ");
		  }
	 @Override
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		 System.out.println("test skipped ");
		  }
	 
	 @Override
	 public void onFinish(ITestContext context) {
		    // not implemented
		 System.out.println("completed ");
		  }
	 
	 

}
