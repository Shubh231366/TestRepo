package java_interview_codes;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		int n = 7;
		
		for(int i = 2; i < n; i++) {
			int rem = n%i;
			if(rem ==0) {
				flag = false;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
