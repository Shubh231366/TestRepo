package java_concepts;

public class Encapsulation1 {
	
	String name; 
	int b; 
	final int c = 2; 
	
	//final variable
	public void a() {
		//c = 5; //final variable value cannot be changed
	}
	
	//final method
	final void b() {
		System.out.println("Final method");
	}
	
	public void setname(String s) {
		this.name = s;
		this.b = 5; 
		System.out.println(b);
		System.out.println(c);
	}
	
	public Object getname() {
		return name;
	}

}
