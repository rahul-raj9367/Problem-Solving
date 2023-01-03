//Day-29
//Number Program
//Automorphic number is 5>5*5>=2(5)
import java.util.*;
class NumberProgram4{
	static boolean method(int n){
		int count=0;
		int square=n*n;
		int temp=n;
		while(temp>0){
			count++;
			temp=temp/10;
		}
		int lastdigit =(int)(square%(Math.pow(10,count)));
		if(n==lastdigit){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Number limits :");
		int num =in.nextInt();
		System.out.print("The Automorphic number is :");
		for(int i=1;i<=num;i++){
			if(method(i))
				System.out.print(i+" ");  
		}
	}
}
/*
OUTPUT
Enter The Number limits :10000
The Automorphic number is :1 5 6 25 76 376 625 9376
*/