//Day-70
//String Program
//Java Program to find the longest repeating sequence in a string
class StringProgram12{
	static String lcp(String s,String t){
		int n=Math.min(s.length(),t.length());
		// System.out.println(s.length()+"  "+t.length());
		for(int i=0;i<n;i++){
			if(s.charAt(i)!=t.charAt(i)){
				return s.substring(0,i);
			}
		}
		return s.substring(0,n);
	}

	public static void main(String[] args) {
		String str="acbdfghybdf";
		String lrs="";
		int n= str.length();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				String x=lcp(str.substring(i,n),str.substring(j,n));
				if(x.length()>lrs.length()){
					lrs=x;
				}
				// System.out.println(x.length()+"  "+lrs.length());

			}
		}
		System.out.println("Longest repeating sequence: "+lrs);  
	}
}
/*
OUTPUT
Longest repeating sequence: bdf
*/