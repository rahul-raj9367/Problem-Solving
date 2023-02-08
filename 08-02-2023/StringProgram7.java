//Day-65
//String Program
//Java Program to find Reverse of the string.
class StringProgram7{
	public static void main(String[] args) {
		String str = "Rahul Raj";
		String reversedStr = "";    
		for(int i=str.length()-1;i>=0;i--){
			reversedStr=reversedStr+str.charAt(i);
		}
		System.out.println("Reverse of given string: "+reversedStr);
	}
}
/*
OUTPUT
Reverse of given string: jaR luhaR
*/