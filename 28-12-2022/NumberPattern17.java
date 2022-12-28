//Day-23
////Number Pattern 
class NumberPattern17{
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=0+i;j<=9;j++){
				System.out.print(j+" ");
			}
			for(int k=1;k<i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}	
	}
}
/*
OUTPUT
1 2 3 4 5 6 7 8 9
2 3 4 5 6 7 8 9 1
3 4 5 6 7 8 9 1 2
4 5 6 7 8 9 1 2 3
5 6 7 8 9 1 2 3 4
6 7 8 9 1 2 3 4 5
7 8 9 1 2 3 4 5 6 
8 9 1 2 3 4 5 6 7
9 1 2 3 4 5 6 7 8
*/