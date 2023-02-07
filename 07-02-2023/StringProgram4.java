//Day-64
//String Program
//Java Program to determine whether two strings are the anagram
import java.util.Arrays;
class StringProgram4{
	public static void main(String[] args) {
		String str1="earth";
		String str2="heart";
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();

		if(c1.length!=c2.length){
			System.out.println("not a anagram :");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);

		for(int i=0;i<c1.length;i++){
			if(c1[i]!=c2[i]){
				System.out.println(str1+" and "+str2+" is Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("is a anagram");
	}
}
/*
OUTPUT
is a anagram
*/