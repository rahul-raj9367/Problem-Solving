//Day-62
//Matrix Program
//Java Program to find the frequency of odd & even numbers in the given matrix
class MatrixProgram5{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int countEven=0,countOdd=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j]%2==0){
					countEven++;
				}
				else{
					countOdd++;
				}
			}
		}
		System.out.println("frequency of odd number :"+countOdd);
		System.out.println("frequency of Even number :"+countEven);
	}
}
/*
OUTPUT
frequency of odd number :5
frequency of Even number :4
*/