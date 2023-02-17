//Day 74
//String Program 
//Isogram - Doesn't have any Character Repeating in a String 
import java.util.*;
class StringProgram20{
	static boolean is_isogram(String str){
		str=str.toLowerCase();
		int len=str.length();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<len-1;i++){
			if(ch[i]==ch[i+1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String str="Isogram";
		System.out.println(is_isogram(str));
		String str1="RahulRaj";
		System.out.println(is_isogram(str1));
		String str2="Java";
		System.out.println(is_isogram(str2));
	}
}
/*
OUTPUT
true
false
false
*/