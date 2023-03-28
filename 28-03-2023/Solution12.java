//Day-107
//HackerRank (Basic Program)
//Given a string,S , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
//Note: You may find the String.split method helpful in completing this challenge.
import java.util.Scanner;
class Solution12{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String []tokens= s.split("[ !,?._'@]+");
        int count=0;
        for(int i=0;i<tokens.length;i++){
        	if(!tokens.equals("")){
        		count++;
        	}
        }
        System.out.println(count);
        for(int i=0;i<tokens.length;i++){
        	if(!tokens.equals("")){
        		System.out.println(tokens[i]);
        	}
        }
	}
}
/*
OUTPUT
rahul raj rahul raj
4
rahul
raj
rahul
raj
*/