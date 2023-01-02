//Day-28
//Number Program
//How to Reverse a Number in Java using for loop
import java.util.Scanner;
class  NumberProgram{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int a =in.nextInt();
		int temp=0,r;
		while(a>0){
			r=a%10;
			temp=(temp*10)+r;
			a=a/10;
		}
		System.out.println("The reverse of the given number is "+ temp);
	}
}
/*
OUTPUT
Enter the Number:12345
The reverse of the given number is 54321
*/