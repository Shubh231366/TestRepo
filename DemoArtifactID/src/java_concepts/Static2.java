package java_concepts;

public class Static2 {
	
	int roll; 
	String name; 
	static String college = "IIT Bombay";
	
	public void getresult() {
		System.out.println(roll + " " + name + " " + college);
		
	}
	

	public static void main(String[] args) {
		Static2 s2 = new Static2();
		s2.roll = 50; 
		s2.name = "Selenium";
		
		s2.getresult();

	}

}
