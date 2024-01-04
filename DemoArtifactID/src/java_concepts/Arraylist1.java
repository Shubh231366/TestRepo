package java_concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		
		//Declaring the arraylist
		ArrayList<Object> obj = new ArrayList<Object>();
		
		//assigning the values to the object obj
		
		obj.add(1);
		obj.add('A');
		obj.add("Selenium");
		obj.add(5 > 10);
		obj.add(56.13);
		obj.add(null);
		
		//using the iterator to print the values of the arraylist
		
		Iterator abc = obj.iterator();
		
		while(abc.hasNext()) {
		System.out.println("Using Iterator and while loop :" + abc.next());
		}
		
		//print the arraylist using the for each loop
		
		System.out.println();
		for(Object xyz : obj) {
			System.out.println("using for each loop :" + xyz);
		}

	}

}
