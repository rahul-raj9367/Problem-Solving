//Day-10
//Prints all the Armstrong numbers up to the specified limit.
import java.util.Scanner;  
import java.lang.Math;  
class ArmStrong2{
	static boolean checkNumber(int n){
		int temp,digits=0,last=0,sum=0;
		temp=n;
		while(temp>0){
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0){
			last=temp%10;
			sum+=(Math.pow(last,digits));
			temp=temp/10;
		}
		if(n==sum)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		System.out.print("Enter the Limit:");
		Scanner in = new Scanner(System.in);
		int num =in.nextInt();
		for(int i=0;i<=num;i++){
			if(checkNumber(i))
			System.out.print(i+",");
		}
	}
}