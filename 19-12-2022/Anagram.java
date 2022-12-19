//Day-14
//Anagram
import java.util.Arrays;   
import java.util.Scanner;
class Anagram{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String1:");
		String str1=in.nextLine();
		System.out.print("Enter the String2:");
		String str2=in.nextLine();
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		if(c1.length!=c2.length){
			System.out.println(str1+" and "+str2+" is Not Anagram");
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
		System.out.println(str1+" and "+str2+" is  Anagram");
	}
}