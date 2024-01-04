package java_concepts;

public class EH3 {

	public static void main(String[] args) {
		
		String x = "Selenium"; 
		String y = "10"; 
		
		try {
			int a = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Length of the string x is :" + " " + x.length());
		
		int z = Integer.parseInt(y);
		System.out.println(z);
		
		System.out.println("Exception Handled");

	}

}
