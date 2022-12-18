//Day-13
//Right Down Mirror Star Pattern
class RightDownMirrorStarPattern{
	public static void main(String[] args) {
		//outer loop for rows  
		for(int i=1;i<=5;i++){
			//Space 0,1,2,3,4
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			//Star 5,4,3,2,1
			for(int k=i;k<=5;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
*****
 ****
  ***
   **
    *
*/