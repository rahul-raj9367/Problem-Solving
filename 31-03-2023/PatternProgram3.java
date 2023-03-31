//Day-109
//Star Pattern Program Using if statement
class PatternProgram3{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=10;j++){
				if(i==j||i==1&j==5||i==2&j==4||i==4&j==2||i==5&j==1){
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
*   *
 * *
  *
 * *
*   *
*/