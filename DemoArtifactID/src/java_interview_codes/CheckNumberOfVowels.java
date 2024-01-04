package java_interview_codes;

public class CheckNumberOfVowels {

	public static void main(String[] args) {
		
		String s = "Life is beautiful enjoy it";
		
		char[] letters = s.toCharArray();
		
		int count = 0; 
		
		for(char c : letters) {
			switch(c) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				count++;
				break;
				default:
			
			}
		}
		
		System.out.println(count);

	}

}
