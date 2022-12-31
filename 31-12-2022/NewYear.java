//Day-26
//Alphabet Pattern
class NewYear{
	public static void main(String[] args) {
		//H
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==1 || j==5 ||i==3)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();	

		//A
		for(int i=1;i<=5;i++){
			for(int k=1;k<=6;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(j==1 || j==5||i==1 ||i==3 )
					System.out.print("*");
				else
		 			System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
 
 		//P
 		for(int i=1;i<=5;i++){
 			for(int k=1;k<=12;k++){
				System.out.print(" ");
			}
 			for(int j=1;j<=6;j++){
 				if(j==1 || (i==1&j<=5) ||(i==2&j==6) || (i==3&j<=5))
 					System.out.print("*");
 				else 
 					System.out.print(" ");
 			}
 			System.out.println();
 		}
 		System.out.println();

 		//P
 		for(int i=1;i<=5;i++){
 			for(int k=1;k<=18;k++){
				System.out.print(" ");
			}
 			for(int j=1;j<=6;j++){
 				if(j==1 || (i==1&j<=5) ||(i==2&j==6) || (i==3&j<=5))
 					System.out.print("*");
 				else 
 					System.out.print(" ");
 			}
 			System.out.println();
 		}
 		System.out.println();


		//Y
		for(int i=1;i<=5;i++){
			for(int k=1;k<=24;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if((i==j&i<=3)||(i==2&j==4)||(i==1&j==5)||(i==4&j==3)||(i==5&j==3))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//N
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==1||i==j||j==5 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//E
		for(int i=1;i<=5;i++){
			for(int k=1;k<=6;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(j==1 || i%2==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();


		//W
		for(int i=1;i<=5;i++){
			for(int k=1;k<=12;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(j==1 || j==5 || (i==j&i>2) ||(i==4 & j==2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	
		//Y
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((i==j&i<=3)||(i==2&j==4)||(i==1&j==5)||(i==4&j==3)||(i==5&j==3))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();


		//E
		for(int i=1;i<=5;i++){
			for(int k=1;k<=6;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(j==1 || i%2==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//A
		for(int i=1;i<=5;i++){
			for(int k=1;k<=12;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(j==1 || j==5||i==1 ||i==3 )
					System.out.print("*");
				else
		 			System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//R
		for(int i=1;i<=5;i++){
			for(int k=1;k<=18;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=6;j++){
				if(j==1 ||(i==1&j<=5)||(i==3&j<=5)||(i==2&j==6)||(i==4&j==4)||(i==5&j==5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	
		//2
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || i==3 || i==5 ||(i==2&j==5)||(i==4&j==1))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//0
		for(int i=1;i<=5;i++){
			for(int k=1;k<=6;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(i==1 ||j==1 ||j==5 ||i==5)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//2
		for(int i=1;i<=5;i++){
			for(int k=1;k<=12;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(i==1 || i==3 || i==5 ||(i==2&j==5)||(i==4&j==1))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//3
		for(int i=1;i<=5;i++){
			for(int k=1;k<=18;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(i==1 || j==5 || i==3 || i==5)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
/*
OUTPUT
*   *
*   *
*****
*   *
*   *

      *****
      *   *
      *****
      *   *
      *   *

            *****
            *    *
            *****
            *
            *

                  *****
                  *    *
                  *****
                  *
                  *

                        *   *
                         * *
                          *
                          *
                          *

*   *
**  *
* * *
*  **
*   *

      *****
      *
      *****
      *
      *****

            *   *
            *   *
            * * *
            ** **
            *   *

*   *
 * *
  *
  *
  *

      *****
      *
      *****
      *
      *****

            *****
            *   *
            *****
            *   *
            *   *

                  *****
                  *    *
                  *****
                  *  *
                  *   *
*****
    *
*****
*
*****

      *****
      *   *
      *   *
      *   *
      *****

            *****
                *
            *****
            *
            *****

                  *****
                      *
                  *****
                      *
                  *****



*/