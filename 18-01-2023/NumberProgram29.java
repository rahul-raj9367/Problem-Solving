//Day-44
//Number Program
//Find Smallest of Three Numbers using Ternary Operator
import java.util.Scanner;
class NumberProgram29{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int b= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int c= sc.nextInt();
		int temp=a<b?a:b;
		int smallest=c<temp?c:temp;
		System.out.println("smallest Number is "+ smallest);
	}
}
/*
OUTPUT
Enter the First Number :121
Enter the Second Number :11
Enter the Second Number :1
smallest Number is 1
*/