//Day 74
//String Program 
//Java Program to swap two string variables without using third or temp variable.
class StringProgram21{
	public static void main(String[] args) {
		String str1="Good ",str2="Evening";
		System.out.println("Before swapping"+str1+" "+str2);

		str1=str1+str2;//Concentation
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println("After swapping"+str1+" "+str2);
	}
}
/*
OUTPUT
Before swappingGood  Evening
After swappingEvening Good
*/