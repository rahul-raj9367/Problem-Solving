/*
Anagram
*/
import java.util.Arrays;
class Problem9{
	public static void main(String[] args) {
		String str1="earth";
		String str2="heart";
		char ch1[] =str1.toCharArray();
		char ch2[]=str2.toCharArray();

		if(ch1.length!=ch2.length){
			System.out.println("Is not a Anagram");
			System.exit(0);
		}

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for(int i=0;i<ch1.length;i++){
			if(ch1[i]!=ch2[i]){
				System.out.println("Is not a Anagram");
				System.exit(0);
			}
		}
		System.out.println("Is a Anagram");
	}
}
/*
OUTPUT
Is a Anagram
*/