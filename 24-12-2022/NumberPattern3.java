//Day-19
//Number Pattern 
class NumberPattern3{
	public static void main(String[] args) {
		int number=1;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(number+" ");
			}
			number++;
			System.out.println();
		}
	}
}
/*
OUTPUT
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/