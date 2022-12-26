//Day-21
//Number Pattern 
class NumberPattern8{
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			for(int k=i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1+i;j<=10;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
         
        for(int i=9;i>=1;i--){
        	for(int k=1;k<i;k++){
        		System.out.print(" ");
        	}
        	for(int j=i;j<=10;j++){
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }


	}
}
/*
OUTPUT
1 2 3 4 5 6 7 8 9 10
 2 3 4 5 6 7 8 9 10
  3 4 5 6 7 8 9 10 
   4 5 6 7 8 9 10
    5 6 7 8 9 10
     6 7 8 9 10
      7 8 9 10
       8 9 10 
        9 10
         10 
        9 10
       8 9 10 
      7 8 9 10
     6 7 8 9 10
    5 6 7 8 9 10
   4 5 6 7 8 9 10
  3 4 5 6 7 8 9 10 
 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
*/
