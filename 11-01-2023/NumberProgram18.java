//Day-37
//Number Program
//Krishnamurthy Number = 145 =>1!+4!+5!=145
import java.util.*;
class NumberProgram18{
	static int factorial(int digit){
		int fact=1;
		while(digit>0){
			fact=fact*digit;
			digit--;
		}
		return fact;
	}
	static boolean istocheckKm(int num){
		int sum=0,r,temp=num;
		while(temp>0){
			r=temp%10;
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
		System.out.print("Enter the Range :");
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			if(istocheckKm(i)){
				System.out.print(i+" ");
			}
		} 
	}
}
