//Day-4
//Here,user has to put the Number as input to check if the Number is palindrome or Not. 
import java.util.Scanner;
class Palinodrome{
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=obj.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("is a palinodrome number");
		}
		else{
			System.out.println("is not a palinodrome number");
		}
	}
}
