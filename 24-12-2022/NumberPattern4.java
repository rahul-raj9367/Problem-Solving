//Day-19
//Number Pattern 
class NumberPattern4{
	public static void main(String[] args) {
		for(int i=8;i>=1;i--){
			for(int j=8;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
8
8 7 
8 7 6 
8 7 6 5
8 7 6 5 4
8 7 6 5 4 3
8 7 6 5 4 3 2
8 7 6 5 4 3 2 1
*/