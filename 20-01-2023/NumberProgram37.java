//Day-46
//Number Program
// Find Sum of Natural Numbers Using For Loop
import java.util.*;
class NumberProgram37{
	static int NaturalNumbers(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum=sum+i;
		}
		return sum;
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