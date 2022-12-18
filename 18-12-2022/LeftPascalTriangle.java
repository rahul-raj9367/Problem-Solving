//Day-13
//Left Pascal's Triangle
class LeftPascalTriangle{
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++){
			//Space 9,8,7,6,5,4,3,2,1
			for(int j=9;j>=i;j--){
				System.out.print(" ");
			}
			//Star-1,2,3,4,5,6,7,8,9
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<=8;i++){
			//Space 2,3,4,5,6,7,8,9
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			//Star-8,7,6,5,4,3,2,1
			for(int k=8;k>=i;k--){
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
    ******
   *******
  ********
 *********
  ********
   ******* 
    ******
     *****
      ****
       ***
        **
         *
*/