package java_concepts;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		
		double a = 7.5;
		
		//convert double type into int type
		int b = (int) a;
		System.out.println(a);
		System.out.println(b);
		
		
		//String to integer conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		//String x = "Shubham";
		//int j = Integer.parseInt(x);
		//System.out.println(j);
		
		//Integer to String conversion
		int z = 5; 
		String t = String.valueOf(z);
		System.out.println(t);
		
		int x = 5; 
		
		//automatic casting
		double y = x;
		
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
