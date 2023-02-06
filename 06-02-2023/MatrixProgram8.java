//Day-63
//Matrix Program
//Java Program to display the lower triangular matrix
class MatrixProgram8{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int rows,cols;
		rows=a.length;
		cols=a[0].length;

		if(rows!=cols){
			System.out.println("Matrix should be a sqware matrix");
		}
		else{
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					if(j>i){
						System.out.print("0 ");
					}
					else{
						System.out.print(a[i][j]+" ");
					}
				}
				System.out.println();  
		}	}
	}
}
/*
OUTPUT
1 0 0
4 5 0
7 8 9
*/