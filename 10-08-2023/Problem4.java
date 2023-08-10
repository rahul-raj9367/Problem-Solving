/*
Java Program to display first n or first 100 prime numbers
*/
import java.util.Scanner;
class Problem4{
	public static void main(String[] args) {
		int i=0,num=0,count=0;
		String primeNumbers="";
		System.out.print("Enter the Number of n:");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		for(i=1;i<=n;i++){
			int counter=0;
			for(num=i;num>=1;num--){
				if(i%num==0){
					counter=counter+1;
				}
			}
			if(counter==2){
				count++;
				primeNumbers=primeNumbers+i+" ";
			}
		}
		System.out.print("The first "+n+" primeNumbers is : ");
		System.out.println(primeNumbers);
		System.out.println("In "+n+" Numbers They are Prime Number Present in "+count+" ");
	}
}
/*
OUTPUT
Enter the Number of n:100
The first 100 primeNumbers is : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
In 100 Numbers They are Prime Number Present in 25
*/