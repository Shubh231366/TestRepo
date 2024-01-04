package java_interview_codes;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 100; 
		int b = 300; 
		
		a = a+b; 
		b = a-b;
		a = a-b; 
		
		System.out.println("swapped number a is: " + " " + a);
		System.out.println("swapped numbetr b is " +" " +b);

	}

}
