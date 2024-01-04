package java_concepts;

public class Interface5 extends Interface2 implements Interface3, Interface4{

	@Override
	public void c() {
		System.out.println("c method printed");
	}

	@Override
	public void b() {
		System.out.println("b method printed");
	}
	
	public static void main(String[] args) {
		
		Interface5 i5 = new Interface5();
		
		i5.a();
		i5.b();
		i5.c();
		
	}

}
