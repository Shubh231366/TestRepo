package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6MixTests {
	
	//Mix executions in testNG by setting the property, giving the invocation count and skipping the tests
	
	@Test()
	public void a() {
		System.out.println("hello a test method");
	}
	
	@Test(invocationCount = 2, priority = -1, enabled = false)
	public void b() {
		System.out.println("hello b test method");
	}
	
	@Test(invocationCount = 1)
	public void c() {
		System.out.println("hello c test method");
	}
	
	@Test(priority = 1, enabled = true)
	public void d() {
		System.out.println("hello d test method");
	}
	
	@BeforeMethod()
	public void e() {
		System.out.println("hello e test method");
	}

}
