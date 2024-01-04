package java_concepts;

public class Interface2 implements Interface1{

	@Override
	public void a() {
		System.out.println("a method printed");
		
	}
	
	public static void main(String[] args) {
		Interface2 i2 = new Interface2();
		i2.a();
		
	}

}
