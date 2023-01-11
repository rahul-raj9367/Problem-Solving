//Day-37
//Number Program
//Krishnamurthy Number = 145 =>1!+4!+5!=145
import java.util.*;
class NumberProgram17{
	static int factorial(int digit){
		int fact=1;
		while(digit>0){
			fact=fact*digit;
			digit--;
		}
		return fact;
	}
	static boolean tocheckKm(int num){
		int sum=0,temp=num;
		while(temp>0){
			int r=temp%10;
			sum=sum+factorial(r);
			temp=temp/10;
		}
		if(sum==num){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n =sc.nextInt();
		if(tocheckKm(n)){
			System.out.println("yes is a Krishnamurthy Number ");
		}
		else{
			System.out.println("No is not a Krishnamurthy Number ");
		}
	}
}
/*
OUTPUT
Enter the Number :145
yes is a Krishnamurthy Number 

Enter the Number :121
No is not a Krishnamurthy Number

*/