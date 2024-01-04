package java_interview_codes;

public class SortIntegerArray {

	public static void main(String[] args) {
		
		int a[] = {5,4,1,2,3};
		int temp = 0; 
		for(int i = 0; i<a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
							
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
