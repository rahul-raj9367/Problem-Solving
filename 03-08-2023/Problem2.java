/*
Reverse the Each Word in a String
INPUT:Hi I am Rahul
OUPUT:iH I ma luhaR
*/
class Problem3{
	public static void main(String[] args) {
		String str="Hi I am Rahul";
		String sp[]=str.split(" ");
		//[I,am,Web,Developer]
		String revstring="";
		for(int i=0;i<sp.length;i++){
			String rev="";
			String word=sp[i];//Hi
			for(int j=word.length()-1;j>=0;j--){
				rev=rev+word.charAt(j);
			}
			revstring=revstring+rev+" ";
		}
		System.out.println(revstring);
	}
}
		