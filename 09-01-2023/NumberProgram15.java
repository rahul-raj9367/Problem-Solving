//Day-35
//Number Program
//Buzz Number => To check last digits 7 (or) also check it divisible by 7 
import java.util.Scanner;
class NumberProgram15{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		if(n%10==7 || n%7==0){
			System.out.println("yes is a Buzz Number ");
		}
		else{
			System.out.println("no  is not  a Buzz Number ");
		}
	}
}
/*
OUTPUT
Enter the Number :307
yes is a Buzz Number 

Enter the Number :54
no  is not  a Buzz Number

Enter the Number :63
yes is a Buzz Number
*/