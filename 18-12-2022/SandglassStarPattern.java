//Day-13
//Sandglass Star Pattern
class SandglassStarPattern{
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++){
			//Space 0,1,2,3,4,5,6,7,8
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			//Star 9,8,7,6,5,4,3,2,1
			for(int k=9;k>=i;k--){
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=1;i<=9;i++){
			//Space 8,7,6,5,4,3,2,1,0
			for(int j=9;j>i;j--){
				System.out.print(" ");
			}
			//Star 1,2,3,4,5,6,7,8,9
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *
*/