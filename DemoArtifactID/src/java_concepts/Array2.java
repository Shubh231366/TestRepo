package java_concepts;

public class Array2 {

	public static void main(String[] args) {
		
		int a[] = {1, 6, 5, 19, 36}; 
		
		String s[] = {"shubham", "Rajat", "Kuldeep", "sandesh"};
		
		Object b[] = {1, 5, "Selenium", 15.97, 'c'};
		
		//printing the length of all arrays
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		
		//printing the random array value from the 
		System.out.println(a[3]);
		System.out.println(s[2]);
		System.out.println(b[4]);
		
		
		b[4] = "automation"; //modify the string value of array using index
		System.out.println(b[4]);
		
		
		//printing the array using for each loop
		for(Object x : b) {
			System.out.println(x);
		}
		
		for(Object y : s) {
		System.out.println(y);
		}
		
		for(Object z : a) {
			System.out.println(z);
		}

	}

}
