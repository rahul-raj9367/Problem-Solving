//Day-20
//Number Pattern 
class NumberPattern7{
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				System.out.print(num);
				num=(num==0)?1:0;
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
1
10
101
1010
10101
101010
1010101
10101010
101010101
*/