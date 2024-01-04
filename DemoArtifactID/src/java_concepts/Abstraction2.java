package java_concepts;

public class Abstraction2 extends Abstraction1{
	
	@Override
	public void eat() {
		System.out.println("I am eating");
	}
	
	public static void main(String[] args) {
		
		Abstraction2 ab1 = new Abstraction2();
		ab1.eat();
		
		ab1.a();
		
		
	}
	
	
	

}
