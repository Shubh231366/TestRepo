package java_concepts;

public class MethodOverride4 extends MethodOverride3{
	
	public void cook() {
		System.out.println("Sister is cooking");
	}
	
	public void angry() {
		System.out.println("Father is angry");
	}
	

	public static void main(String[] args) {
		
		MethodOverride4 mo4 = new MethodOverride4();
		mo4.cook();
		mo4.angry();
		mo4.handwash();
		mo4.eat();
		
		System.out.println();
		
		MethodOverride3 mo5 = new MethodOverride3();
		mo5.cook();
		mo5.eat();
		mo5.handwash();
	    //mo5.angry //undefined
		

	}

}
