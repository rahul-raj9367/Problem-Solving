//Day 88
//Java program to print the following pattern on the console
class PatternProgram{
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==0 || i==9 || j==0 || j==9){
					System.out.print("1");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
1111111111
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1111111111
*/
