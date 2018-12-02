package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ExecutionOrder {
	
	@Test(priority=1)
	public void testCase() {
		
		System.out.println("testCase will execute ");
	}
	
	@Test(priority=0)
	public void demoCase() {
		
		System.out.println("demoCase will execute ");
	}

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("beforeMethod will execute ");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("afterMethod will execute ");
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("beforeClass will execute ");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("afterClass will execute ");
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("beforeTest will execute ");
	}

	@AfterTest
	public void afterTest() {
		
		System.out.println("afterTest will execute ");
	}

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("beforeSuite will execute ");
	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println("afterSuite will execute ");
	}

}
