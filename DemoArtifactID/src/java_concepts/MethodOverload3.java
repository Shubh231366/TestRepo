package java_concepts;

public class MethodOverload3 {
	
	static int add(int a, int b) {
		return a +b;
		
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,5));
		System.out.println(add(10,5,15));
	
		
		//another way
		int x = add(10,5);
		int y = add(10,5,15);
		
		System.out.println(x);
		System.out.println(y);
				
	}

}
