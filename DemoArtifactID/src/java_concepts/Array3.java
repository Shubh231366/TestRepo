package java_concepts;

public class Array3 {
	
	static int c[] = {18, 45, 3, 9};
	
	public static void passingArrayToMethod(int c[]) {
		
		int b = c[0];
		
		for(int i = 0; i < c.length; i++) {
			if(b >= c[i]) {
				System.out.println(b);
			}
			else {
				System.out.println("ABCD");
			}
		}
		
	}

	public static void main(String[] args) {
		
		passingArrayToMethod(c);
	}

}
