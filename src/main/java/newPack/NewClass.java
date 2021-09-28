package newPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClass {
	
	@BeforeSuite
	public void befSuite() {
		System.out.println("start");
	}
	
	@BeforeTest
	public void befTest() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void befClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("before method");
	}
	
	@Test (priority=1)
	public void test1() {
		System.out.println("main job1");
	}
	
	@Test (priority=2)
	public void test2() {
		System.out.println("main job2");
	}
	
	@Test (priority=3)
	public void test3() {
		System.out.println("main job3");
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void aftClass() {
		System.out.println("after class");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("after test");
	}
	
	@AfterSuite
	public void aftSuite() {
		System.out.println("end");
	}

}
