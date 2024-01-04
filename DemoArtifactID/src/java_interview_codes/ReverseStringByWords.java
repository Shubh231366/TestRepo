package java_interview_codes;

public class ReverseStringByWords {

	public static void main(String[] args) {
		
		String s = "Life is beautiful enjoy it";
		String parts[] = s.split(" ");
		System.out.println(parts.length); //5
		
		for(int i = parts.length-1; i>= 0; i--) {
			System.out.print(parts[i] + " ");
		}

	}

}
