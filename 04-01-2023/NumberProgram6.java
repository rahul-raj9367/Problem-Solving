//Day-30
//Number Program
//Sunny Program
/* A number is called a sunny number if the number next to the given number is a perfect square. In other words, 
 a number N will be a sunny number if N+1 is a perfect square.*/
import java.util.*;
class NumberProgram6{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = in.nextInt();
		double root;
		root=Math.sqrt(num+1);
		if((int)root==root){
			System.out.println(num +" is a Sunny Number");
		}
		else{
			System.out.println(num +" is not a Sunny Number");
		}
	}
}
/*
OUTPUT
Enter the Number :8
8 is a Sunny Number

Enter the Number :9
9 is not a Sunny Number
*/