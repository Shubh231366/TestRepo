package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test()
	public void assert2() {
		
		String actualtext = "ab";
		String exptext = "ab";
		int a = 10;
		int b = 20;
		
		//equal assertion
		Assert.assertEquals(actualtext, exptext, "actual and expected text are matching");
		System.out.println("Equal assertion verified");
		
		//false assertion
		Assert.assertFalse(a > b, "a is not greater than b");
		System.out.println("False assertion verified");
		
		Assert.assertTrue(a < b, "a is less than b ");
		System.out.println("True assertion verified");
		
	}

}
