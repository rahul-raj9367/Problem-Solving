//Day-108
//Star Pattern Program Using if statement
class PatternProgram3{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				if(i==1&j==5||i==2&j==4||i==2&j==6 ||i==3&j==3||i==3&j==5||i==3&j==7||
					i==4&j==2||i==4&j==4||i==4&j==6||i==4&j==8||i==5&j==3||i==5&j==5||i==5&j==7||
					i==6&j==4||i==6&j==6||i==7&j==5){
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
  * * *
 * * * *
  * * *
   * *
    *
*/