//Day-22
////Number Pattern 
class NumberPattern15{
	public static void main(String[] args) {
		for(int i=1;i<=8;i++){
			for(int j=1;j<=8-i;j++){
				System.out.print(1);
			}
			for(int k=1;k<=i;k++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
11111111
11111122
11111333
11114444
11155555
11666666
17777777
88888888
*/