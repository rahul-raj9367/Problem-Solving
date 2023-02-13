//Day-70
//String Program
//Java Program to determine whether one string is a rotation of another
class StringProgram15{
	public static void main(String[] args) {
		String str1="abcde",str2="deabc";
		if(str1.length()!=str2.length()){
			System.out.println("Second String is not a rotation of first String");
		}
		else{
			str1=str1.concat(str1);
			if(str1.indexOf(str2)!=-1){
				System.out.println("Second String is a rotation of first String");
			}
			else{
				System.out.println("Second String is not a rotation of first String");
			}
		}
	}
}
/*
OUTPUT
Second String is a rotation of first String
*/