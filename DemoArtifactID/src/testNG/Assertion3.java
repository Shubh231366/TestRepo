package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	
	@Test()
	public void assert3() {
		
		String actText = "xy";
		String expText = "xyz";
		
		try {
			Assert.assertEquals(actText, expText);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Equal assertion verified");
		
	}

}
