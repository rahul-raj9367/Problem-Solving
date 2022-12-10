//Day-5
//Let's see the factorial program in java using While Loop.
import java.util.Scanner;
class Factorial2{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int number =obj.nextInt();
		int fact=1,n;
		int num=number;
		while(number>0){
			fact=fact*(number);
			number--;
		}
		System.out.println("Factorial of "+num+" is :"+fact);
	}
}