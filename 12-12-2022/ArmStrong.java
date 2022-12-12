//Day-7
//To checks if the given number is an Armstrong number or not. 
import java.lang.Math;   
import java.util.Scanner;
class ArmStrong{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number to check if the number is Armstrong or not :");
		int n=obj.nextInt();
		int temp;
		double Arm=0;
		double temp1;
		int original=n;
		while(n>0){
			temp=n%10;
			temp1=Math.pow(temp,3);
			Arm = Arm +temp1;
			n=n/10;
		}
		if(Arm==original){
			System.out.println(original+" is ArmStrong Number");
		}
		else{
			System.out.println(original+" is Not a ArmStrong Number");

		}
	}
} 