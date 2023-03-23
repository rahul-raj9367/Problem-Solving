//Day-102
//HackerRank (Basic Program)
//Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
import java.util.*;
import java.io.*;
class Solution2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int ");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long ");
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
/*
OUTPUT
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
*/


