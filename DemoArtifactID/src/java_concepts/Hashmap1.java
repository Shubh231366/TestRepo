package java_concepts;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		//declaring the hashmap key and value
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//using the put method to assign the key and value
		hm.put(1, "january");
		hm.put(2, "february");
		hm.put(3, "March");
		hm.put(4, "April");
		hm.put(5, "May");
		hm.put(6, "June");
		hm.put(7, "July");
		hm.put(8, "August");
		hm.put(9, "September");
		hm.put(10, "October");
		hm.put(11, "November");
		hm.put(12, "December");
		hm.put(null, null);
		
		//printing the output of the value by defining the key
		System.out.println(hm.get(1));
		System.out.println();
		System.out.println(hm.get(5));
		System.out.println();
		System.out.println(hm.get(null)); //Hashmap gives the output for the multiple null values

	}

}
