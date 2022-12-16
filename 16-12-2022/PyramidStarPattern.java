//Day-11
//PyramidStarPattern
class PyramidStarPattern{
	public static void main(String[] args) {
		int i,k,j,row=5;
		//outer loop works Rows
		for(i=0;i<5;i++){
			//inner loop works Space print
			for(j=0;j<=(row-i);j++){
				System.out.print(" ");
			}
			//inner loop works Prints Star
			for(k=0;k<=i;k++){
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