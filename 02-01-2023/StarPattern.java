//Day-28
//Star Pattern
class  StarPattern{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=53;j++){
				if(j==1 || (i==1&j<=4) ||(i==3&j<=4)||(i==2&j==5)||(i==4&j==3)||(i==5&j==4)||
			    (j==7) ||(i==1&j==7)||(i==1&j==8)||(i==1&j==9)||(i==1&j==10)||(i==1&j==11)||
			    (i==1&j==12) ||(j==12) ||(i==3&j==7)||(i==3&j==8)||(i==3&j==9)||(i==3&j==10)||
			    (i==3&j==11) || (i==3&j==12) ||(j==14)||(i==3&j==15)||(i==3&j==16)||(i==3&j==17)||
			    (i==3&j==18) ||(j==19) ||(j==21&i<=4) ||(i==5&j==22)||(i==5&j==23)||(i==5&j==24)||
			    (i==5&j==25)||(j==26&i<=4)||(j==28)||(i==5&j==29)||(i==5&j==30)||(i==5&j==31)||
			    (i==5&j==32)||(i==5&j==33)||(i==5&j==34))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT

*****  ****** *    * *    * *
*    * *    * *    * *    * *
*****  ****** ****** *    * *
* *    *    * *    * *    * *
*  *   *    * *    *  ****  ****** 

*/