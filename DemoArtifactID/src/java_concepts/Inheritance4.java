package java_concepts;

public class Inheritance4 extends Inheritance3{
	
	public void multiply(int x, int y) {
		z = x * y;
		System.out.println("Product is :" + z);
	}
	
	public static void main(String[] args) {
		
		int x = 25;
		int y = 15; 
		
		Inheritance4 i4 = new Inheritance4();
		
		i4.add(x, y);
		i4.subtract(x, y);
		i4.multiply(x, y);
		System.out.println();
		
	}

}
