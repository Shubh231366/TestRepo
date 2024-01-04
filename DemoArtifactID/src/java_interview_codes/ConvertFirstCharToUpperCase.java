package java_interview_codes;

public class ConvertFirstCharToUpperCase {

	public static void main(String[] args) {
		
		String s = "Life is beautiful enjoy it";
		String parts[] = s.split(" ");
		System.out.println(parts.length);
		
		for(int i = 0; i < parts.length; i++) {
			char[] ch = parts[i].toCharArray();
			for(int j = 0; j < ch.length; j++) {
				ch[0] = Character.toUpperCase(ch[0]);
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
	}
		
}	
