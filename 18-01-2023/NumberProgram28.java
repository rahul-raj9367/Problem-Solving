//Day-44
//Number Program
//Find Largest of Three Numbers 
import java.util.Scanner;
class NumberProgram28{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int b= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int c= sc.nextInt();
		if(a>b && a>c ){
			System.out.println("The largest number is: "+a);  
		}
		else if(b>c && b>a ){
			System.out.println("The largest number is: "+b);  
		}
		else if(c>a && c>b ){
			System.out.println("The largest number is: "+c);  
		}
		else{
			System.out.println("Numbers are Same ");
		}
	}
}
/*
OUTPUT
Enter the First Number :12
Enter the Second Number :13
Enter the Second Number :14
The largest number is: 14


Enter the First Number :11
Enter the Second Number :11
Enter the Second Number :11
Numbers are Same 

*/