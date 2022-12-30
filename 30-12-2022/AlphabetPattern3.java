//Day-25
//Alphabet Pattern
class AlphabetPattern3{
	public static void main(String[] args) {
		int letter=65;
		for(int i=9;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print((char)(letter+j)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=8;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)(letter+j)+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
A B C D E F G H I
A B C D E F G H 
A B C D E F G 
A B C D E F 
A B C D E
A B C D 
A B C 
A B
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