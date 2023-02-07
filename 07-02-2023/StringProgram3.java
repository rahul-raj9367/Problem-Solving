//Day-64
//String Program
//Java Program to count the total number of vowels and consonants in a string
class StringProgram3{
	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String name="This is a really simple sentence";    
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
				vCount++;
			}
			else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);   
    }
    	   
}
/*
OUTPUT
Number of vowels: 10
Number of consonants: 16
*/