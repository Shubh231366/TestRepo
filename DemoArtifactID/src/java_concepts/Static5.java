package java_concepts;

public class Static5 {
	
	int x = 10; 
	static int  y = 5; 
	
	public void a() {
		int z = 10; 
		System.out.println(z);
	}
	
	static int b = 6;
	
	public static void b() {
		int a = 5; 
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		Static5 s5 = new Static5();
		
		s5.a();
		b();
		System.out.println(y);
		System.out.println(b);
		System.out.println(s5.x);
		
	}
	

}
