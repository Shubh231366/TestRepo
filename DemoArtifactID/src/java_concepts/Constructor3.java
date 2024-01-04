package java_concepts;

public class Constructor3 {
	
	int x; 
	String y;
	
	//constructor overloading
	Constructor3(){
		System.out.println("No arg constructor with no integer and string value");
		System.out.println();
	}
	
	Constructor3(int a){
		this.x = a;
		System.out.println("int arg constructor with integer value :-" + " " + x);
		System.out.println();
	}
	
	
	Constructor3(String b){
		this.y = b;
		System.out.println("String arg constructor with String value :-" + " " + b);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Constructor3 c5 = new Constructor3();
		Constructor3 c6 = new Constructor3(54);
		Constructor3 c7 = new Constructor3("Automation");
	}
	

}
