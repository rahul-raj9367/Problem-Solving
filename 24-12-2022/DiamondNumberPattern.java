//Day-19
//Number Pattern 
class DiamondNumberPattern{
	public static void main(String[] args) {
		int count=0;
		int number=0; 
		int spaces=3;
		for(int i=1;i<=7;i++){
			//Space
			for(int k=1;k<=spaces;k++){
				System.out.print(" ");
			}
			if(i<=4){
				count=2*i-1;
				number=i;
				spaces--;
				if(i==4){
					spaces+=2;
				}
			}
			else{
				count = count - 2;
				number= 8-i;
				spaces++;
			}
			//prints Number
			for(int j=1;j<=count;j++){
				System.out.print(number);
				int midpposition=count/2+1;
				if(j<midpposition)
					number--;
				else
					number++;
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
   1
  212
 32123
4321234
 32123
  212
   1
*/