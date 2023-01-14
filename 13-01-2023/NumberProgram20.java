//Day-39
//Number Program 
//Smith Number =>Sum of the Digit of the primefactor and sum of the digit Are Equal
import java.util.*;
class NumberProgram20{
	static int sumofD(int n){
		int sum=0,rem;
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int temp,num,i=2,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		num =sc.nextInt();
		temp=num;
		while(temp>1){
			 if(temp%i==0){
			 	sum=sum+sumofD(i);
			 	temp=temp/i;
			 }
			 else{
			 	i++;
			 }
		}
		if(sum==sumofD(num)){
			System.out.println("Yes is Smith Number ");
		}
		else{
			System.out.println("No is Smith Number ");
		}
	}
}
/*
OUTPUT
Enter the Number :666
Yes is Smith Number
 
Enter the Number :66
No is Smith Number
*/