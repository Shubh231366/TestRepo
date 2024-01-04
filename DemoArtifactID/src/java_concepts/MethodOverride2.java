package java_concepts;

public class MethodOverride2 extends MethodOverride1{
	
	public void eat() {
		
		System.out.println("You are eating");
	}
	
	public void run() {
		System.out.println("You are running");
		
	}
	
	public static void xyz(int a, int b) {
		
		System.out.println(a + b);
	
	}
	
	public static void main(String[] args) {
		
		MethodOverride1 mo1 = new MethodOverride1();
		MethodOverride2 mo2 = new MethodOverride2();
		
		mo2.eat();
		mo2.run();
		mo1.eat();
		mo1.run();
		xyz(5,5);
		
		
	}

}
