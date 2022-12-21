//Day-16
//UpTriangleBorderPattern
class UpTriangleBorderPattern{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			//space
			for(int j=i;j<=4;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				if(k==1 || k==2*i-1 ||i==5){
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
*********
*/