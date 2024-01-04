package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7DependsOnMethod {
	
	//depends on method execution
	
	@Test()
	public void x() {
		Assert.assertTrue(5 < 10);
		System.out.println("Print x test method");	
	}
	
	@Test(dependsOnMethods = "x")
	public void y() {
		System.out.println("Print y method only if x method is true");
	}

}
