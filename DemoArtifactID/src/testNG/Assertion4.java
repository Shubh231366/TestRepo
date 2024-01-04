package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 {
	
	@Test()
	public void assert4() {
		
		int i = 10; 
		int j = 10;
		
		try {
			Assert.assertTrue(i > j);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("True assertion passed");
	}
		
		@Test()
		public void assertfinal() {
			
			int i = 10; 
			int j = 10;
			
			Assert.assertTrue(i == j);
			System.out.println("True assertion verified");
		}
		
	}

