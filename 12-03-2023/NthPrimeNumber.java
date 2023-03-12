//Day 94
//Number Program
import java.util.Scanner;
class NthPrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the value of n to compute the nth prime number: ");   
		int n=sc.nextInt();   
		int num=1,count=0,i;  
		while(count<n){  
			num=num+1; 
			//System.out.println(num); 
			for (i=2;i<=num;i++){      
				if(num%i==0){  
					break;  
				}  
			}  
			if(i==num){
				count=count+1;  
			}  
			//System.out.println(count); 
		}    
		System.out.println("The " +n +"th prime number is: " + num);  
	}
}
/*
OUTPUT
Enter the value of n to compute the nth prime number: 5
The 5th prime number is: 11
*/