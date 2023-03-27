//Day-106
//HackerRank (Basic Program)
//Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
import java.util.Scanner;
import java.util.Arrays;
class Solution11{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String1:");
		String str1=in.nextLine();
		System.out.print("Enter the String2:");
		String str2=in.nextLine();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		if(ch1.length!=ch2.length){
			System.out.println(str1+" and "+str2+" is Not Anagram");
			System.exit(0);
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=ch1.length-1;i>=0;i--){
			if(ch1[i]!=ch2[i]){
				System.out.println(str1+" and "+str2+" is Not Anagram");
				System.exit(0);
			}
		}
		System.out.println(str1+" and "+str2+" is a Anagram");
	}
}
/*
OUTPUT
Enter the String1:earth
Enter the String2:heart
earth and heart is a Anagram


Enter the String1:car
Enter the String2:rat
car and rat is Not Anagram
*/