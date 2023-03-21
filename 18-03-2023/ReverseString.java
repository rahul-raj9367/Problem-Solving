//Day-97
//How to reserve a string in Java without using reverse function(While Loop)
import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String s=sc.nextLine();
		System.out.print("After reverse string is: "); 
		int i=s.length();
		while(i>0){
			System.out.print(s.charAt(i-1));
			i--;
		}
	}
}
/*
OUTPUT
Enter the String:Rahul_Raj
After reverse string is: jaR_luhaR
*/