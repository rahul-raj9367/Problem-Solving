//Day-34
//Number Program
//EMIRP Number
import java.io.*;
import java.util.*;
class NumberProgram14{
	static boolean isprime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
			return true;
	}
	static boolean isEmirp(int n){
		if(isprime(n)==false)
			return false;
		int reverse =0;
		while(n!=0){
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		return isprime(reverse);  
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a number to check: ");  
	int n=sc.nextInt();  
	if (isEmirp(n) == true)  
		System.out.println("Yes, the given number is an emirp number.");  
	else  
		System.out.println("No, the given number is not an emirp number.");  
	}
}