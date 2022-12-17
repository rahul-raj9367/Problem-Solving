//Day-12
//Diamond Shape Pattern
class DiamondShapePattern{
	public static void main(String[] args) {
		//Outer loop runs for rows 5 prints
		for(int i=1;i<=5;i++){
			//Inner loop runs for Space 4,3,2,1,0 prints
			for(int j=5-i;j>0;j--){
				System.out.print(" ");
			}
			//inner loop runs for Star 1,3,5,7,9 prints 
			for(int k=1;k<=2*i-1;k++){ 
				System.out.print("*");
			}
			System.out.println();
		}
		//Outer loop runs for rows 4 prints
		for(int i=4;i>0;i--){
			//Inner loop runs for Space 1,2,3,4 prints
			for(int j=4-i;j>=0;j--){
				System.out.print(" ");
			}
			//inner loop runs for Star 7,5,3,1 prints
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/