package java_concepts;

public class BreakStatement3 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 5) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Control came out from the loop");
		
	}

}
