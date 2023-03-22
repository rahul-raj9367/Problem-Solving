//Day-101
//HackerRank (Basic Program)
//if-else conditional statements
import java.util.Scanner;
class Solution{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter The Number:");
        int n=sc.nextInt();
        if(n%2==1){
            System.out.println("Weird");
        }
        else if(n%2==0 && n>=2&n<=5){
            System.out.println("Not Weird");
        }
        else if(n%2==0 && n>=6&n<=20){
            System.out.println("Not Weird");
        }
        else if(n%2==0 && n>20){
            System.out.println("Not Weird");
        }
    }
}
/*
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
*/
/*
OUTPUT
Enter The Number:12
Not Weird

Enter The Number:23
Weird
*/