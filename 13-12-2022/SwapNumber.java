//Day-8
//Swap 2 no using 3rd Variable Program
import java.util.Scanner;
class SwapNumber{
	public static void main(String[] args) {
		int x,y,temp;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the x value:");
		x=obj.nextInt();
		System.out.print("Enter the y value:");
		y=obj.nextInt();
		
		System.out.println("Before swapping numbers: X="+x +" Y="+y); 

		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping numbers: X="+x +" Y="+y); 
	}
}