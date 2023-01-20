//Day-46
//Number Program
// Find Sum of Natural Numbers Using While Loop
import java.util.*;
class NumberProgram36{
	public static void main(String[] args) {
		System.out.print("Enter the Number :");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		int sum=0;
		while(num>0){
			sum=sum+num;
			num=num-1;
		}
		System.out.println("Sum of Natural Numbers is: "+sum); 
	}
}
/*
OUTPUT
Enter the Number :10
Sum of Natural Numbers is: 55
*/