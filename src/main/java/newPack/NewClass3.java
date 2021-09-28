package newPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewClass3 {
	

@BeforeMethod
public void befMethod3() {
	System.out.println("before method class3");
}

@Test
public void test5() {
	System.out.println("main job class3");
}

@AfterMethod
public void aftMethod3() {
	System.out.println("after method class3");
}
}