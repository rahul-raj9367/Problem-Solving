//Day-71
//String Program
//Java program to find the duplicate words in a string
class StringProgram17{
	public static void main(String[] args) {
		String str="rahul raj and rahul raj ";
		int count;
		str=str.toLowerCase();
		String words[] = str.split(" ");//[rahul,raj,and,rahul,raj]
		System.out.println("Duplicate Words in a given String:");
		for(int i=0;i<words.length;i++){
			count=1;
			for(int j=i+1;j<words.length;j++){
				if(words[i].equals(words[j])){
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i]!="0"){
				System.out.println(words[i]);
			}
		}
	}
}
/*
OUTPUT
Duplicate Words in a given String:
rahul
raj
*/