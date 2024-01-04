package java_concepts;

import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		//using the put method to assign the key and value
		ht.put(1, "Shubham");
		ht.put(2, "Rajat");
		ht.put(3, "Kuldeep");
		ht.put(4, "sandesh");
		
		//printing the output of the value by defining the key value
		System.out.println("value of the 1st key :" + " " + ht.get(1));
		System.out.println();
		System.out.println("value of the 4th key :" + " " + ht.get(4));
		

	}

}
