package java_concepts;

public class Static6 {
	
	String a; 
	int b; 
	static int c = 4;
	
	public static void a() {
		System.out.println("hello static");
	}
	
	public static void main(String[] args) {
		
		Static6 s6 = new Static6();
		
		s6.a = "Selenium webdriver";
		s6.b = 90;
		c = 12;
		
		a();
		
		System.out.println(s6.a + " " + s6.b + " " + c);
		
	}

}
