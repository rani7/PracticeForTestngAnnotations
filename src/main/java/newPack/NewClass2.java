package newPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewClass2 {
	

@BeforeMethod
public void befMethod2() {
	System.out.println("before method class2");
}

@Test
public void test4() {
	System.out.println("main job class2");
}

@AfterMethod
public void aftMethod2() {
	System.out.println("after method class2");
}
}