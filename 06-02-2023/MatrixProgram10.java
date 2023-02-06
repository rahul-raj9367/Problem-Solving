//Day-63
//Matrix Program
//Java Program to find the sum of each row and each column of a matrix
class MatrixProgram10{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int rows,cols;
		rows=a.length;
		cols=a[0].length;

		//Calculates sum of each row of given matrix   
		for(int i=0;i<rows;i++){
			int Sumrow=0;
			for(int j=0;j<cols;j++){
				Sumrow=Sumrow+a[i][j];
			}
			System.out.println("Sum of "+(i+1)+" row:"+Sumrow);
		}

		//Calculates sum of each column of given matrix   
		for(int i=0;i<cols;i++){
			int Sumcol=0;
			for(int j=0;j<rows;j++){
				Sumcol=Sumcol+a[j][i];
			}
			System.out.println("Sum of "+(i+1)+" column:"+Sumcol);
		}
	}
}
/*
OUTPUT
Sum of 1 row:6
Sum of 2 row:15
Sum of 3 row:24
Sum of 1 column:12
Sum of 2 column:15
Sum of 3 column:18
*/