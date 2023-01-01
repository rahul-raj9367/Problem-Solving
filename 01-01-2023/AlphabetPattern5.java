//Day-27
//Alphabet Pattern
class AlphabetPattern5{
	public static void main(String[] args) {
		int count=0;
		int space=10;
		for(int i=1;i<=10;i++){
			if(i<=5){
				count=i;
				space=space-2;
			}
			else{
				count=count-1;
				space=space+2;
			}
			for(int j=1;j<=count;j++){
				System.out.print("*");
			}
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=count;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
*        *
**      **
***    ***
****  ****
**********
****  **** 
***    ***
**      **
*        *
*/