//Day-29
//Number Program
//Automorphic number is 5>5*5>=2(5)
import java.util.*;
class NumberProgram3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Number :");
		int num =in.nextInt();
		int count=0;
		int square=num*num;
		int temp=num;
		while(temp>0){
			count++;
			temp=temp/10;
		}
		int lastdigits =(int)(square%(Math.pow(10,count)));
		if(lastdigits==num){
			System.out.println("The given number is Automorphic number "+lastdigits);
		}
		else{
			System.out.println("The given number is Not Automorphic number "+lastdigits);
		}
		

	}
}
/*
OUTPUT
Enter The Number :25
The given number is Automorphic number 25

Enter The Number :12
The given number is Not Automorphic number 44


*/