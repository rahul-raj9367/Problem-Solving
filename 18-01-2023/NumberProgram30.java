//Day-44
//Number Program
//Find Smallest of Three Numbers 
import java.util.Scanner;
class NumberProgram30{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int b= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int c= sc.nextInt();
		if(a<b && a<c ){
			System.out.println("The Smallest number is: "+a);  
		}
		else if(b<c && b<a ){
			System.out.println("The Smallest number is: "+b);  
		}
		else if(c<a && c<b ){
			System.out.println("The Smallest number is: "+c);  
		}
		else{
			System.out.println("Numbers are Same ");
		}
	}
}
/*
OUTPUT
Enter the First Number :10
Enter the Second Number :9
Enter the Second Number :8
The Smallest number is: 8
*/