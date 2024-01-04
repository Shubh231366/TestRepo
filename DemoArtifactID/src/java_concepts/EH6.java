package java_concepts;

public class EH6 {

	public static void main(String[] args) {
		
		try {
		int i = 20/2;
		}
		finally {
			System.out.println("finally will always execute");
		}
		
		try {
			int a = 5/0; 
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		finally {
			System.out.println("finally will always execute");
		}
		
		System.out.println("Exception Handled");	

	}

}
