package java_concepts;

public class EH1 {

	public static void main(String[] args) {
		
		//Exception handling using try and catch block
		
		try {
		int a = 5 /0; //arithmentic exception
		}
		catch(ArithmeticException a) {
			a.printStackTrace(); //gives complete exception info
			System.out.println(a); //gives only the exception info
		}
		
		//for 1 try block we can have multiple catch block
		//if e do not know which exception is implemented then we can use different set of catch block for exception handling
		
		catch(NullPointerException n) {
		System.out.println(n);
		}
		
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Exception Handled");
		
		}

	}

