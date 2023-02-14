//Day-71
//String Program
//Java program to find the duplicate characters in a string
class StringProgram16{
	public static void main(String[] args) {
		String str="Great responsibility";
		int count=0;
		char ch[]=str.toCharArray();//[G,r,e,a,t, ,r,e,s,p,o,n,s,i,b,i,l,i,t,y]
		System.out.println("Duplicate Character in a given String ");
		for(int i=0;i<ch.length;i++){
			count=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j] && ch[i]!=' '){
					count++; //2
					ch[j]='0'; 
				}
			}
			if(count>1 && ch[i]!='0'){
				System.out.println(ch[i]);
			}
		}
	}
}
/*
OUTPUT
Duplicate Character in a given String
r
e
t
s
i
*/