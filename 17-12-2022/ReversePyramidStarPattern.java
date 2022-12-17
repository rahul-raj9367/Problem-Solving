//Day-12
//Reverse Pyramid Star Pattern
class ReversePyramidStarPattern{
	public static void main(String[] args){
		//rows
		for(int i=0;i<5;i++){
			//Space 1,2,3,4,5
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			//star 5,4,3,2,1
			for(int k=i;k<5;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
 * * * * *
  * * * *
   * * *
    * *
     *
*/