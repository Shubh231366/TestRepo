package java_concepts;

public class Array1 {

	public static void main(String[] args) {
		
		//Defining an array
		int a[] = new int [5];
		
		//printing the length of an array
		System.out.println(a.length);
		
		//printing the default value of an integer array
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//Assigning the values to an array
		a[0] = 16; 
		a[1] = 45;
		a[2] = 32;
		a[3] = 72;
		a[4] = 19; 
		//a[5] = 18; //out of bound exception
		
		//printing all array elements
		for(int i = 0; i < a.length; i ++) {
			if(i == a.length) {
				break;
			}
			System.out.println(a[i]);
		}
		System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		
	}

}
