//Day-64
//String Program
//Java Program to count the total number of characters in a string
class StringProgram1{
	public static void main(String[] args) {
		String name="rahul raj";
		int count=0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)!=' '){
				count++;
			}
		}
		System.out.println("Total number of characters in a string:"+count);
	}
}
/*
OUTPUT
Total number of characters in a string:8
*/