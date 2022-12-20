//Day-15
//Alphabet Star Pattern
class BStarPattern{
	public static void main(String[] args) {
		int row=10;
		int col=8;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if(j==1||(i==1 || i==5 || i==10) && (j%2==1) || j==8 && i!=1 && i!=5 && i!=10  ){
					System.out.print("*");
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
* * * * 
*      *
*      *
* * * *
*      *
*      *
* * * *
*/