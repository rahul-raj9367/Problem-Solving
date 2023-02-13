//Day-70
//String Program
//Java Program to replace lower-case characters with upper-case and vice-versa
class StringProgram13{
	public static void main(String[] args) {
		String str="Rahul Raj";
		StringBuffer obj = new StringBuffer(str);

		for(int i=0;i<str.length();i++){
			if(Character.isLowerCase(str.charAt(i))){
				obj.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i))){
				obj.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after case conversion : "+ obj);    
	}
}
/*
OUTPUT
String after case conversion : rAHUL rAJ
*/