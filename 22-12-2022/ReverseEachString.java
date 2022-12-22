//Day-17
//Reverse a each word in a string 
import java.util.Scanner;
class ReverseEachString{
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.print("Enter the String :");
		String str1=obj.nextLine();

		String sp[] =str1.split(" ");
		//[Good,Evening] Length-2,IndexPosition-0,1
		String revstring="";
	
		for(int i=0;i<sp.length;i++){
			String word=sp[i]; 
			String revword="";

			for(int j=word.length()-1;j>=0;j--){
				revword=revword+word.charAt(j);
			}
			revstring=revstring+revword+" ";
		}
		System.out.println(revstring);
	}
}
/*
INPUT-Good Evening

OUTPUT-dooG gninevE

*/
