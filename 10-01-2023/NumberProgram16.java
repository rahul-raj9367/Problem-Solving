//Day-36
//Number Program
/*Duck Number => zeros present in it,
but there Should be no zero present at the begining of the number 
*/
import java.io.*;
import java.util.*;
class NumberProgram16{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		String str = sc.nextLine();
		char ch;
		int k=0,l,i;
		l=str.length();
		if(str.charAt(0)=='0'){
			System.out.println("No is not a Duck Number");
		}
		else{
			for(i=0;i<l;i++){
				ch=str.charAt(i);
				if(ch=='0'){
					k=1;
					break;
				}
					
			}
			if(k==1){
				System.out.println("Yes is a Duck Number");
			}
			else{
				System.out.println("No is not a Duck Number");
			}
		}
		
	}
}
/*
OUTPUT
Enter the Number:2028
Yes is a Duck Number

Enter the Number:0987
No is not a Duck Number

Enter the Number:12
No is not a Duck Number
*/