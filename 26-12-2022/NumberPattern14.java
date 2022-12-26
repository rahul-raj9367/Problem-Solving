//Day-21
//Number Pattern 
class NumberPattern14{
	public static void main(String[] args) {
		for(int i=0;i<9;i++){
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=1+i;j<=9;j++){
				System.out.print(j);
			}
			System.out.println();
		}

		for(int i=0;i<8;i++){
			for(int k=7;k>i;k--){
				System.out.print(" ");
			}
			for(int j=8-i;j<=9;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
123456789
 23456789
  3456789
   456789
    56789
     6789
      789
       89
        9
       89
      789
     6789
    56789
   456789
  3456789
 23456789
123456789
*/