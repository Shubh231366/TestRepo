package java_interview_codes;

import java.util.Arrays;

public class FindCommonElementinTwoArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
			Arrays.sort(a);
			int b[] = {6,7,2,9,1};
			Arrays.sort(b);
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < b.length; j++) {
					if(a[i] == b[j]) {
						System.out.println("Common element :" + a[i]);
					}
				}
				
			}
	}

}
