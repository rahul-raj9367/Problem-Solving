//Day-42
//Number Program
//Find Square Root of a Number Without sqrt Method
import java.util.*;
class NumberProgram23{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n = sc.nextInt();
		System.out.println("The Sqware root of "+n+" is :"+Sqwareroot(n));	
	}
	public static double Sqwareroot(int num){
			double t;
			double Sqrtroot=num/2;
			do{
				t=Sqrtroot;
				Sqrtroot=(t+(num/t))/2;
				System.out.println(Sqrtroot);
			}
			while((t-Sqrtroot!=0));
			return Sqrtroot;
		}
}
/*
OUTPUT
4.0
3.5
3.4642857142857144
3.4641016200294548
3.4641016151377544
3.4641016151377544
The Sqware root of 12 is :3.4641016151377544


Enter the Number :25
7.041666666666667
5.295981262327416
5.008270885347736
5.000006829457312
5.000000000004665
5.0
5.0
*/