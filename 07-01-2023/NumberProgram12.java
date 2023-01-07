//Day-33
//Number Program
//Neon Number n=9 =>square=n*n=81 => f=8+1= 9
import java.util.*;
class NumberProgram12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		int temp=n,sum=0;
		int square=n*n;
		while(square>0){
			int f=square%10;
			sum=sum+f;
			square=square/10;
		}
		if(sum==n){
			System.out.println("yes,is a Neon Number:");
		}
		else{
			System.out.println("no,is not a Neon Number:");
		}
	}
}
/*
OUTPUT
Enter the Number :9
yes,is a Neon Number:

Enter the Number :8
no,is not a Neon Number:
*/