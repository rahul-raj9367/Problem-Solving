//Day-96
//Xylem and Phloem Number Java Program-1234 = 1+4=5,2+3=5,5==5
import java.util.Scanner;
import java.io.*;
class XylemPhloem{
	public static void main(String[] args) {
		int num,extreme_sum=0,mean_sum=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		num=Math.abs(num);
		n=num;
		while(n!=0){
			if(n==num || n<10)
				extreme_sum=extreme_sum+n%10;
			else
				mean_sum=mean_sum+n%10;
			n=n/10;
		}
		System.out.println("The sum of extreme_sum digits "+extreme_sum);
		System.out.println("The sum of mean_sum digits "+mean_sum);
		if(extreme_sum==mean_sum){
			System.out.println(num+"is a Xylem Number");
		}
		else{
			System.out.println(num+"is a Phleom Number");
		}
	}
}
/*
OUTPUT
Enter the Number
1234
The sum of extreme_sum digits 5
The sum of mean_sum digits 5
1234is a Xylem Number
*/