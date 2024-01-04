package java_concepts;

public class EH8 {
	
	String s = "Selenium"; //Global variable
	
	public void exception() {
		
		int a = s.length();
		
		try {
		if(a > 10) {
			System.out.println("lenghth of the string is greater than 10");
		}
		
		else {
			throw new ArithmeticException("Not Applicable");
		}
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		EH8 e = new EH8();
		e.exception();
		System.out.println(e.s);
		
	}

}
