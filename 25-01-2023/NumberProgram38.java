//Day-51
//Number Program
//Fibonacciseries Using Recursion = > Call by it Self
import java.util.Scanner;
class NumberProgram38{        //6
	static int fibseries(int n){
		if(n==0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		return fibseries(n-2)+fibseries(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int number = sc.nextInt();//10
		System.out.println("fibseries ");
		for(int i=0;i<number;i++){
			System.out.print(fibseries(i)+" ");// 0 1 1 2 3 5 8 13 21 34 
		}
	}
}