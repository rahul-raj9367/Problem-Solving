//Day-106
//HackerRank (Basic Program)
//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward
import java.util.Scanner;
class Solution10{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String name=sc.nextLine();
		String rev="";0
		for(int i=name.length()-1;i>=0;i--){
			rev=rev+name.charAt(i);
		}
		if(rev.equals(name)){
			System.out.println("Yes if it is a palindrome");
		}
		else{
			System.out.println("No if it is a palindrome");		
		}
	}
}
/*
OUTPUT
Enter the String:radar
Yes if it is a palindrome

Enter the String:rahul
No if it is a palindrome
*/