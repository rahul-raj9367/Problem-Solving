//Day-12
// Mirrored Right Triangle Star Pattern
class  MirroredRightTriangleStarPattern{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			//space 4,3,2,1,0
			for(int j=5-i;j>0;j--){
				System.out.print(" ");
			}
			//star 1,2,3,4,5
			for(int k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
    *
   **
  ***
 ****
*****
*/