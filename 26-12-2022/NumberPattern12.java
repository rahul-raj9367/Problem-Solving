//Day-21
//Number Pattern 
class NumberPattern12{
	public static void main(String[] args) {
		for(int i=0;i<7;i++){
			for(int j=7-i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/