package Ses1;

public class VowelStr {

	public static void main(String[] args) {
		String s = "Education";
		s=s.toLowerCase();
		
		//Vowels count 
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch =='e' || ch=='i' || ch =='o' || ch== 'u') {
				count++;
			}
		}
		System.out.println("The number of vowels present are: "+count);
		
		//Reverse String
		String result = " ";
		for(int i = s.length()-1;i>=0;i--) {
			result+=s.charAt(i);
		}
		System.out.println(result);
		
		//To count words in string 
		String str = "Java is a Programming Language";
		String[] word = str.split(" ");
		System.out.println("Count of words in string :" + word.length);
	}

}
