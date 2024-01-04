package java_concepts;

public class Static4 {
	
	static int z = 5; 
	int y = 1; 
	
	public static void a() {
		z = 10;
		System.out.println(z);
	}
	
	public void b() {
		z = 15; 
		System.out.println(z);
		System.out.println(y);
		a();
		
	}

	public static void main(String[] args) {
		
		a();
		Static4 s4 = new Static4();
		System.out.println(s4.y);
		s4.b();
	
	}

}
