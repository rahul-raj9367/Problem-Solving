//Day-23
//Alphabet Pattern
class AlphabetPattern{
	public static void main(String[] args) {
		int alphabet=65;
		for(int i=0;i<8;i++){
			for(int j=0;j<=i;j++){
				System.out.print((alphabet+j)+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
A
A B 
A B C 
A B C D
A B C D E
A B C D E F
A B C D E F G 
A B C D E F G H
A B C D E F G H I
*/