//Day-25
//Alphabet Pattern
class AlphabetPattern4{
	public static void main(String[] args) {
		for(int i=0;i<9;i++){
			//Space
			for(int j=1+i;j<9;j++){
				System.out.print(" ");
			}
			int letter=65;
			for(int k=0;k<=i;k++){
				System.out.print((char)(letter)+" ");
				letter++;
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