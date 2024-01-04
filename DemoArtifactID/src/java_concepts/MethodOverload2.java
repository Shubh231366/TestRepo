package java_concepts;

public class MethodOverload2 extends MethodOverload1{

	public static void main(String[] args) {
		
		MethodOverload2 mo2 = new MethodOverload2();
		
		int a = 10; 
		int b = 20; 
		int c = 30;
		
		mo2.sum(a, b);
		mo2.sum(a, b, c);
		
		//we can also pass the values directly in the parameters
		mo2.sum(50, 20);

	}

}
