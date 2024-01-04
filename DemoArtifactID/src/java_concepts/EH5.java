package java_concepts;

public class EH5 {

	public static void main(String[] args) {
		
		try {
			int i = 10/0; 
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		finally {
			System.out.println("finally will always execute");
		}
		
	}

}
