//Day-41
//Number Program
//nth-Prime Number
import java.util.Scanner;
class NumberProgram22{
	public static void main(String[] args) {
		int count=0,num=1,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		while(count<n){
			num=num+1;
			for(int i=2;i<=num;i++){
				if(num%i==0){
					break;
				}
			}
			if(i==num){
				count =count+1;
			}
		}
		System.out.println("The " +n +"th prime number is: " + num);  
	}
}