package java_concepts;

public class Encapsulation2 extends Encapsulation1 {

	
		//final method cannot be override
		/*final void b() {
			System.out.println("Final method");
		}*/
		
	public static void main(String[] args) {
		
		Encapsulation2 e2 = new Encapsulation2();
		e2.setname("Selenium");
		
		System.out.println(e2.getname());

	}

}
