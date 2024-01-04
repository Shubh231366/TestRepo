package java_concepts;

public class EH4 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		try {
			a[8] = 50; 
			System.out.println(a[8]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("Exception Handled");

	}

}
