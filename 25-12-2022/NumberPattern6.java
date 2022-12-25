//Day-20
//Number Pattern 
class NumberPattern6{
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			if(i%2==0){
				int num=0;
				for(int j=1;j<=9;j++){
					System.out.print(num);
					num=(num==0)?1:0;//Ternary conditional operator
				}
			}
			else{
				int num=1;
				for(int j=1;j<=9;j++){
					System.out.print(num);
					num=(num==0)?1:0;//Ternary conditional operator
				}
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
101010101
010101010
101010101
010101010
101010101
010101010
101010101
010101010
101010101
*/