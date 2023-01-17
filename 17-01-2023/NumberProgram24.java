//Day-43
//Number Program
//Swap Two Number Using Bitwise Operator(XOR)
import java.util.Scanner;
class NumberProgram24{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number:");
		a=sc.nextInt();
		System.out.print("Enter the Second Number:");
		b=sc.nextInt();
		System.out.println("Before swapping ");
		System.out.println("a ="+a+",b ="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping ");
		System.out.println("a ="+a+",b ="+b);
	}
}
/*
OUTPUT
Enter the First Number:5
Enter the Second Number:9
Before swapping
a =5,b =9
After swapping
a =9,b =5


(XOR)
A=A^B
A=5 => 0101
B=9 => 1001
A= 1100

B=A^B
A=5 => 1100
B=9 => 1001
B= 0101 =>5


A=A^B
A=>1100
B=>0101

A=1001 =>9
*/