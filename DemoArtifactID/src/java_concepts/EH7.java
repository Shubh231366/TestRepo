package java_concepts;

public class EH7 {

		public static void a(int age){
			
			try {
			if (age < 18) {
				throw new Exception("Not Applicable");
			}
			else {
				System.out.println("Applicable");
			}
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
			
		}
		public static void main(String[] args) {
			
			a(15); //throw exception
			a(20); //print applicable

	}

}
