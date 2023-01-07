//Day-33
//Number Program
//Syp Number =>sum of number == product of the number ;
import java.util.*;
class NumberProgram13{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n = sc.nextInt();
		int temp=n,sum=0,prod=1,f;
		while(temp>0){
			f=temp%10;
			sum=sum+f;
			prod=prod*f;
			temp=temp/10;
		}
		if(sum==prod){
			System.out.println("yes, is a spy Number:");
		}
		else{
			System.out.println("no, is not  a spy Number:");
		}
	}
}
/*
OUTPUT
Enter the Number :22
yes, is a spy Number:

Enter the Number :14
no, is not  a spy Number:
*/