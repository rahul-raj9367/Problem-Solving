//Day-44
//Number Program
//Find Largest of Three Numbers using Ternary Operator
import java.util.Scanner;
class NumberProgram27{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int b= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int c= sc.nextInt();
		int temp=a>b?a:b;//Ternary Operator
		int largest =c>temp?c:temp;
		System.out.println("largest Number is "+ largest);
	}
}
/*
OUTPUT
Enter the First Number :12
Enter the Second Number :13
Enter the Second Number :14
largest Number is 14


Enter the First Number :10
Enter the Second Number :100
Enter the Second Number :101
largest Number is 101
*/