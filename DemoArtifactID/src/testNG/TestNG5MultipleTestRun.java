package testNG;

import org.testng.annotations.Test;

public class TestNG5MultipleTestRun {
	
	//Executing the tests multiple times in testNG
	
	@Test(invocationCount = 2)
	public void a() {
		System.out.println("a method executed 2 times");
	}
	
	@Test(invocationCount = 3)
	public void b() {
		System.out.println("b method executed 3 times");
	}

}
