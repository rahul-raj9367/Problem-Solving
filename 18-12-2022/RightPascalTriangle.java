//Day-13
//Right Pascal's Triangle
class RightPascalTriangle{
	public static void main(String[] args) {
		
		for(int i=1;i<=8;i++){
			//Star 1,2,3,4,5,6,7,8
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=7;i>0;i--){
			//Star 7,6,5,4,3,2,1
			for(int j=1;j<=i;j++){ 
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
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
* 

*/
