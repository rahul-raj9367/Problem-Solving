//Day-11
//Left Triangle Star Pattern
class LeftTriangleStarPattern{
	public static void main(String[] args) {
		int i,j,k,row=5;
		//outer loop for rows 
		for(i=0;i<5;i++){
			//inner loop work for space
			for(j=1;j<=2*(row-i);j++){
				System.out.print(" ");
			}
			//inner loop for columns  
			for(k=0;k<=i;k++){
				//prints stars
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
         *
       * *
     * * *
   * * * *
 * * * * *
*/