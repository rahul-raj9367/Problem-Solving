//Day-15
//Alphabet Star Pattern
class CStarPattern{
	public static void main(String[] args) {
	
		for(int rows=0;rows<6;rows++){
			for(int col=0;col<6;col++){
				if(((rows==5||rows==0) && col>0) || (rows<5 && rows>0 && col<1)){
					System.out.print(" *");
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
  * * * * *
 *
 *
 *
 *
  * * * * *
*/ 