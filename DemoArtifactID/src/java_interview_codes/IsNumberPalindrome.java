package java_interview_codes;

public class IsNumberPalindrome {

	public static void main(String[] args) {
		
		String s1 = "madam";
		
		StringBuilder sb = new StringBuilder(s1);
		StringBuilder temp = sb.reverse();
		
		String s2 = temp.toString();
		
		if(s1.equals(s2)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
