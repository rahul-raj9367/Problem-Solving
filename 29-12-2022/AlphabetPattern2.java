//Day-24
//Alphabet Pattern
class AlphabetPattern2{
	public static void main(String[] args) {
		for (int i=8;i>=0;i--){  
			int alphabet = 65;  
			for(int j=0;j<=i;j++){  
				System.out.print((char)(alphabet+j)+" ");  
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
*/