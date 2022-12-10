//Day-5
//Let's see the factorial program in java using recursion.
import java.util.Scanner;
class Factorial1{  
  static int factorial(int n){
    if(n==0||n==1)
      return 1;
    else
      return (n*factorial(n-1));
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number =obj.nextInt();
    int fact=1;
    fact=factorial(number);
    System.out.println("Factorial of "+number+" is :"+fact);

  }
}  