//Day-6
//Here,user has to put the string as input to check if the string is palindrome or Not palindrome. 
import java.util.Scanner;
class Palindrome2{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a string to check if it is a palindrome:");
		String str=obj.nextLine();
		String empty="";
		for(int i= str.length()-1;i>=0;i--){
			empty=empty+str.charAt(i);
		}
		if(str.equals(empty)){
			System.out.println("Entered string is a palindrome :"+str);
		}
		else{
			System.out.println("Entered string is not a palindrome:"+str);
		}
	}
}
