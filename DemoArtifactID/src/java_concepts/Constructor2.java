package java_concepts;

public class Constructor2 {
	
	int id; //Global variable
	String name; //Global variable
	String address; //Global variable
	
	//default constructor
	Constructor2(){
		System.out.println("Hello default constructor");
		
	} 
	
	//Parametrized constructor
	Constructor2(int a, String b, String c){
		this.id = a;
		this.name = b; 
		this.address = c;
		System.out.println(id + " " + name + " " + address);
		
	}
		
		//non static method
		public void displayInfo() {
			System.out.println();
			System.out.println("Output of the displayInfo method is");
			System.out.println("ID :-" + " " + id);
			System.out.println("Name :-" + " " + name);
			System.out.println("Address :-" + " " + address);
			
		}
		
		public static void main(String[] args) {
			
			//creating an object of default constructor
			Constructor2 c2 = new Constructor2();
			
			//creating an object of parametrized constructor
			Constructor2 c3 = new Constructor2(8, "Shubham", "Agra");
			
			//creating an object of non static method
			Constructor2 c4 = new Constructor2(5, "Rajat", "Faridabad");
			c4.displayInfo();
			
		}
		
	}
