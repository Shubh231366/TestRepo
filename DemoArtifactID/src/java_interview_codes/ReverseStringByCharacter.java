package java_interview_codes;

public class ReverseStringByCharacter {

	public static void main(String[] args) {
		
		String s = "Life is beautiful enjoy it";
		System.out.println(s.length()); //5
		
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
			
		}

	}

}
