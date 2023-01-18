//Day-44
//Number Program
//Check if a Number is Positive or Negative Using Conditional Statement
import java.util.Scanner;
class NumberProgram31{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num=sc.nextInt();
		if(num>0){
			System.out.println("Number is a postive "+num);
		}
		else if(num<0){
			System.out.println("Number is a Negative "+num);
		}
		else{
			System.out.println("Number is a Zero "+num);
		}
	}
}
/*
OUTPUT
Enter the Number :12
Number is a postive 12

Enter the Number :-12
Number is a Negative -12

Enter the Number : 0
Number is a Zero 0

*/