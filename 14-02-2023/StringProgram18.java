//Day-71
//String Program
//Java Program to find the frequency of characters
class StringProgram18{
	public static void main(String[] args) {
		String str="rahul raj";
		int freq[] = new int[str.length()];
		char ch[] =str.toCharArray();

		for(int i=0;i<str.length();i++){
			freq[i]=1;
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j] && ch[i]!=' '){
					freq[i]++;
					ch[j]='0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");    
		for(int i=0;i<freq.length;i++){
			if(ch[i]!='0' && ch[i]!=' ')
				System.out.println(ch[i]+" "+freq[i]);
		}
	}
}
/*
OUTPUT
r 2
a 2
h 1
u 1
l 1
j 1
*/