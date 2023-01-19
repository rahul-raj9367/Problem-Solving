//Day-45
//Number Program
//Check if a Given Number is Perfect Number
import java.util.*;
class NumberProgram34{
	static boolean  CheckPerfectSqware(double n){
		double sqrt=(Math.sqrt(n));
		System.out.println(sqrt);
		return ((sqrt-Math.floor(sqrt))==0);	
	}
	public static void main(String[] args) {
		System.out.print("Enter the Number :");
		Scanner sc =new Scanner(System.in);
		double num =sc.nextDouble();
		if(CheckPerfectSqware(num)){
			System.out.print("Yes, the given number is perfect square.");   
		}
		else{
			System.out.print("No, the given number is perfect square.");   
		}
	}
}
/*
OUTPUT
Enter the Number :24
4.898979485566356
No, the given number is perfect square.

Enter the Number :25
5.0
Yes, the given number is perfect square.
*/