//Day-30
//Number Program
/*Peterson Number
	Number = 145
	145 = !1 + !4 + !5
	=1+4*3*2*1+5*4*3*2*1
	=1+24+120
	145=145
*/
import java.util.*;
class NumberProgram5{
	static boolean ispeterson(int n){
		int temp=n;
		int sum=0,r;
		while(n>0){
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		return(temp==sum);
	}
	static int fact(int n){
		if(n==1) 
			return 1;
		else{
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n= in.nextInt();
		if(ispeterson(n)){
			System.out.println("is a Peterson Number:");
		}
		else{
			System.out.println("is not a Peterson Number:");
		}
	}
}
/*
OUTPUT
Enter the Number:145
is a Peterson Number:

Enter the Number:23
is not a Peterson Number:
*/