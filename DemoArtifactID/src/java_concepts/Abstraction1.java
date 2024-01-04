package java_concepts;

public abstract class Abstraction1 {
	
	static int a = 5; 
	int b = 5; 
	final int c = 10; 
	
	//abstract method
	abstract void eat();
	
	//non abstract method
	public void a() {
		System.out.println("Non abstract method");
	}
	
	//Abstraction1 ab1 = new Abstraction1(); object cannot be created for the abstract class
	

}
