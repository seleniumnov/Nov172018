package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotations {

	@Test(priority=0,groups= {"Smoke"})
	public void demo1() {
		
		System.out.println("Actual Test Case 6th");
	}
	
	@Test(priority=1,invocationCount=5)
	public void sample() {	
		System.out.println("2nd test case");
	}
	
	@Test(priority=2,groups= {"Smoke"})
	
	public void assertVerification() {
		System.out.println("Verification Starts");
		
		Assert.assertEquals("Suresh", "Test");
		
		System.out.println("Verification Done");
	}
	
	@Test(priority=3,dependsOnMethods="assertVerification")
	public void ifverification() {
		
		System.out.println("Verification Starts");
		
		if ("Suresh".equals("Test")) {
				
		}
		
		System.out.println("Using If Verification Done");
		
		
		System.out.println("Verification Done");
	}


	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This beforeMethod will execute 4th");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("This afterMethod will execute 7th");
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("This beforeClass will execute 3rd");
		
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("This afterClass will execute 8th");
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("This beforeTest will execute 2nd");
	}

	@AfterTest
	public void afterTest() {
		
		System.out.println("This afterTest will execute 9th");
	}

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("This beforeSuite will execute 1st");
	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println("This afterSuite will execute 10th");
	}

}
