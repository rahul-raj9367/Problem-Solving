//Day-65
//String Program
//Java Program to find Reverse of the Each string.
class StringProgram8{
	public static void main(String[] args) {
		String str="Good Evening";
		String reverseStr="";
		String sp[] = str.split(" ");
		for(int i=0;i<sp.length;i++){
			String word=sp[i];
			String wordrev="";
			for(int j=word.length()-1;j>=0;j--){
				wordrev=wordrev+word.charAt(j);
			}
			reverseStr=reverseStr+" "+wordrev;
		}
		System.out.println("Reverse of the Each string :"+ reverseStr);
	}
}
/*
OUTPUT
Reverse of the Each string : dooG gninevE
*/