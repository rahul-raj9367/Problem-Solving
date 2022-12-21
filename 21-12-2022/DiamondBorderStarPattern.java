//Day-16
//Diamond Star Border Pattern
class DiamondBorderStarPattern{
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++){
			//Space
			for(int j=i;j<4;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				if(k==1 || k==2*i-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

		for(int i=1;i<=3;i++){
			//Space
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=5;k>=2*i-1;k--){
				if(k==5 || k==2*i-1){
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
   *
  * *
 *   *
*     *
 *   *
  * *
   *
*/