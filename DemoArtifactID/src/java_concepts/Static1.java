package java_concepts;

public class Static1 {
	
	Double x = 125.25;
	String s = "My name is Shubham"; 
	static int y = 10; 
	
	public static void method1() {
		String x = "Java is a programming language";
		System.out.println(x);
		
	}
	
	public void method2() {
		int i = 100; 
		i = 200;
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		Static1 s1 = new Static1();
		s1.method2();
		method1();
		
		System.out.println(y);
		System.out.println(s1.x);
		System.out.println(s1.s);
		

	}

}
