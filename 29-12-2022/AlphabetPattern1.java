//Day-24
//Alphabet Pattern
class AlphabetPattern1{
	public static void main(String[] args) {
		int letter=65;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(letter)+" ");
			}
			letter++;
			System.out.println();
		}
	}
}
/*
OUTPUT
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G
H H H H H H H H
I I I I I I I I I

*/