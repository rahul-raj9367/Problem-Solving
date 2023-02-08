//Day-65
//String Program
//Java Program to divide a string in 'N' equal parts.
class StringProgram5{
	public static void main(String[] args) {
		String str="aaaaddddcccc";
		int len=str.length();
		int n=3;
		int temp=0,chars=len/n;//12/3=4
		String equalstr[] = new String [n];
		if(len%n!=0){
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
		}
		else{
			for(int i=0;i<len;i=i+chars){
				String part = str.substring(i,i+chars);
				equalstr[temp]=part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for(int i=0;i<equalstr.length;i++){
				System.out.println(equalstr[i]);  
			}
		}
	}
}
/*
OUTPUT
3 equal parts of given string are
aaaa
dddd
cccc
*/
