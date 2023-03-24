//Day-103
//HackerRank (Basic Program)
//You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a,b , and n values as a single line of n space-separated integers.
import java.util.*;
import java.io.*;

class Solution4{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();//1
        for(int i=0;i<t;i++){
            int a = in.nextInt();//0
            int b = in.nextInt();//2
            int n = in.nextInt();//10
            
            for(int j=0;j<n;j++){//0<10
                a=a+b;//2+4=6,6+8=14,14+16=30,30+32=62,62+64=126,126+128=254,254+256=510,510+512=1012,1012+1024=2046
                System.out.print(a+" ");//2,6,14,30,62,126,254,510,1012,2046
                b=b*2;//4,8,16,32,64,128,256,512,1024,
            }
            System.out.println();
        }
        in.close();
    }
}
/*
OUTPUT
1
0
2
10
2 6 14 30 62 126 254 510 1022 2046
*/