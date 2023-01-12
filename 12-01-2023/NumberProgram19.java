//Day-38
//Number Program
//Mystery Number 121 =92+29 =121 
import java.util.*;
class NumberProgram19{
	static int rev(int n){
		int sum=0,rem;
		while(n>0){
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num =sc.nextInt();
		int f=0;
		for(int i=1;i<num;i++){
			if(i+rev(i)==num){
				System.out.println("Yes is a Mystery Number ");
				f=1;
				break;
			}
		}
		if(f==0){
			System.out.println("No is not a Mystery Number ");
		}
	}
}
/*
OUTPUT
Enter the Number :121
Yes is a Mystery Number

Enter the Number :123
No is not a Mystery Number
*/