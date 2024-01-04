package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4SkipTest {
	
	//Skipping the tests in testNg
	
	//1st way- by commenting the annotation
	//@Test()
	public void a() {
		System.out.println("Hello a method");
	}
	
	//2nd way- by setting the false value in the annotation parameter
	@Test(enabled = false)
	public void b() {
		System.out.println("Hello b method");
	}
	
	@Test(enabled = true)
	public void c() {
		System.out.println("Hello c method");
	}
	
	//3rd way- by setting the invocation count as 0
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("Hello d method");
	}
	
	@Test()
	public void e() {
		System.out.println("Hello e method");
	}
	
	//4th way- correct way by which we will get the skip count but not recommended
	@Test()
	public void f() throws Exception {
		System.out.println("Hello f method");
		throw new SkipException("Skipping f test method");
	}
	
}
