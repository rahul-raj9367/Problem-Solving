//Day-30
//Number Program
//Sunny Program
/* A number is called a sunny number if the number next to the given number is a perfect square. In other words, 
 a number N will be a sunny number if N+1 is a perfect square.*/

import java.util.*;
class NumberProgram7{

    static boolean method(int n){
        double root;
        root=Math.sqrt(n+1);
        if((int)root==root){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number Range :");
        int num = in.nextInt();
        System.out.println("The Sunny Number Range is : "+ num);
        for(int i=1;i<=num;i++){
            if(method(i))
            System.out.print(i+" ");
        }
    }
}
/*
OUTPUT
Enter the Number Range :1000
The Sunny Number Range is :1000
3 8 15 24 35 48 63 80 99 120 143 168 195 224 255 288 323 360 399 440 483 528 575 624 675 728 783 840 899 960
*/