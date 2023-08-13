/*
ISOGRAM-Does not have Any Character Repeating
*/
class Problem14{
	static boolean CheckIsogram(String str){
		str=str.toLowerCase();
		int len=str.length();
		char ch[]=str.toCharArray();
		// Arrays.sort(ch);
		for(int i=0;i<len-1;i++){
			if(ch[i]==ch[i+1]){
				return false;
			}
		}
		return true;


	}
	public static void main(String[] args) {
		String str="machine";
		System.out.println(CheckIsogram(str));
	}
}
/*
OUTPUT
true
*/