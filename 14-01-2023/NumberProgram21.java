//Day-40
//Number Program
//Strontio Number 1221*2=>2442%100=>442/10=> 42/10 & 42/10 =>4=4
import java.util.Scanner;
class NumberProgram21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num=sc.nextInt();
		num=(num*2%1000)/10;
		if(num%10==num/10){
			System.out.print("Yes Strontino Number ");
		}  
		else{
			System.out.print("No Strontino Number");
		}
	}
}
/*
OUTPUT
Enter the Number :1221
Yes Strontino Number

Enter the Number :2453
No Strontino Number
*/