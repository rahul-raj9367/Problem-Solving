//Day-102
//HackerRank (Basic Program)
//The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=1;
        while(sc.hasNext()){
            System.out.println(n+++" "+sc.nextLine());
        }
        sc.close();
    }
}
/*
OUTPUT
1 Hello world
2 I am a file
3 Read me until end-of-file.
*/