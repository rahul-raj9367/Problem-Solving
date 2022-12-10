//Day-5
//Let's see the factorial Program using loop in java.
import java.util.Scanner;
class Factorial{  
 public static void main(String[] args) {
   Scanner obj =new Scanner(System.in);
   System.out.println("Enter the Number:");
   int number=obj.nextInt();
   int fact=1;
   //using for loop
   for(int i=1;i<=number;i++){
      fact=fact*i;
   }
   System.out.println("Factorial of "+number+" is: "+fact);
 }
}  
