//Day-31
//Number Program
//Tech Number 2025=> 20|25 => (20+25) =>(45*45) => 2025
import java.util.*;
class NumberProgram9{
	static boolean istechnumber(int n){
		int temp=n;
		int f,l;
		l=n%100;
		f=n/100;
		int square =(int)Math.pow((f+l),2);
		if(temp==square){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Limit:");
		int n =in.nextInt();
		System.out.print("Tech numbers between 1 to "+ n +" are:" );
		for(int i=1;i<=n;i++){
			if(istechnumber(i))
			System.out.print(i +" ");
		}
	}
}
/*
OUTPUT
Enter the Limit:10000
Tech numbers between 1 to 10000 are: 1 2025 3025 9801 10000
*/