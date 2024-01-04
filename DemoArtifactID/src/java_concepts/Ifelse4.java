package java_concepts;

public class Ifelse4 {

	public static void main(String[] args) {
		
		int age = 15; 
		int weight = 55; 
		
		if(age >= 15) {
			
			if(weight < 50) {
				System.out.println("candidate is eligible");
			}
			
			else {
			System.out.println("candidate is not eligible");
			}
			
		}
		else {
			System.out.println("Age is not greater than 15");
		}

	}

}
