//Day-31
//Number Program
//Tech Number 2025=> 20|25 => (20+25) =>(45*45) => 2025
import java.util.*;
class NumberProgram8{
	static void istechnumber(int n){
		int temp=n;
		int f,l;
		l=n%100;
		f=n/100;
		int square =(int)Math.pow((f+l),2);
		if(temp==square){
			System.out.println(temp+"is a Tech Number ");
		}
		else{
			System.out.println(temp+"is not a Tech Number ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n =in.nextInt();
		istechnumber(n);
	}
}
/*
OUTPUT
Enter the Number :2025
2025is a Tech Number

Enter the Number :8023
8023is not a Tech Number
*/