//Day-28
//Number Program
//How to Reverse a Number in Java Using For Loop
import java.util.Scanner;
class  NumberProgram1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int number =in.nextInt();
		int temp=0,r;
		for(;number!=0; number=number/10){
			r=number%10;
			temp=(temp*10)+r;
		}
		System.out.println("The reverse of the given number is: " + temp);  
	}
}
/*
OUTPUT
Enter the Number:123
The reverse of the given number is: 321
*/