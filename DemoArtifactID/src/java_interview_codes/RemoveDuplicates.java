package java_interview_codes;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		//approach 1
		String s = "Tttttttesstttttt";

		StringBuilder sb1 = new StringBuilder();
		s.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
		
		//approach 2
		char[] ch = s.toCharArray();
		
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int i = 0; i < ch.length; i++) {
			
			boolean flag = true;
			for(int j = i+1; j < ch.length; j++) {
				
				if(ch[i] == ch[j]) {
					
					flag = false;
					break;
					
				}
			}
			
			if(!flag) {
				sb2.append(ch[i]);
			}
			
			
			}
			
		System.out.print(sb2);
		}
		
		
		}

