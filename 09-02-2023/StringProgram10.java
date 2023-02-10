//Day-66
//String Program
//Java Program to determine whether a given string is palindrome
class StringProgram10{
	public static void main(String[] args) {
		String str="radar";
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)){
			System.out.println("a given string is palindrome" +str);
		}
		else{
			System.out.println("a given string is not a  palindrome" +str);
		}
	}
}
/*
OUTPUT
a given string is palindromeradar
*/
