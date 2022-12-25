//Day-20
//Number Pattern 
class NumberPattern5{
	public static void main(String[] args) {

		for(int i=1;i<=5;i++){
			int num=i;
			for(int j=1;j<=i;j++){
				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
1 
2 1 
3 2 1
4 3 2 1 
5 4 3 2 1
*/