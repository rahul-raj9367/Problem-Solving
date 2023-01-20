//Day-46
//Number Program
// Find Sum of Natural Numbers
import java.util.*;
class NumberProgram35{
	static int NaturalNumbers(int n){
		return (n*(n+1))/2;
	}
	public static void main(String[] args) {
		System.out.print("Enter the Number :");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		System.out.println("Sum of Natural Numbers is: "+NaturalNumbers(num));   
	}
}
/*
OUTPUT
Enter the Number :10
Sum of Natural Numbers is: 55
*/