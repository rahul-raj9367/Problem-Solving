//Day-44
//Number Program
//Find GCD of Two Numbers (Greatest Common Factor)
import java.util.Scanner;
class NumberProgram26{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a= sc.nextInt();
		System.out.print("Enter the Second Number :");
		int b= sc.nextInt();
		while(a!=b){
			if(a==0){
				System.out.println("GCD "+b);
				System.exit(0);
			}
			if(b==0){
				System.out.println("GCD "+a);
				System.exit(0);
			}
			if(a>b){
				a=a-b;
			}
			if(b>a){
				b=b-a;
			}
			if(a==b){
				System.out.println("GCD "+a);
			}
		}
		
	}
}
/*

Factors of 12: 1, 2, 3, 4, 6, 12

Factors of 8: 1, 2, 4, 8

Common Factors: 1, 2, 4

Greatest Common Factor: 4

OUTPUT
Enter the First Number :50
Enter the Second Number :60
GCD 10

Enter the First Number :12
Enter the Second Number :8
GCD 4

*/