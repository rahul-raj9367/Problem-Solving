//Day-43
//Number Program
//swap two numbers using multiplication and division operator
import java.util.Scanner;
class NumberProgram25{
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number:");
		x=sc.nextInt();
		System.out.print("Enter the Second Number:");
		y=sc.nextInt();
		System.out.println("values before swapping:");   
		System.out.println("x = " + x +" y = " + y); 
		x=x*y;//10*20 = 200
		y=x/y; //200/20 = 10
		x=x/y; //200/10 = 20 
		System.out.println("values after swapping:");  
		System.out.println("x = " + x +" y = " + y);   
	}
}
/*
OUTPUT

Enter the First Number:10
Enter the Second Number:20
values before swapping:
x = 10 y = 20
values after swapping:
x = 20 y = 10

*/