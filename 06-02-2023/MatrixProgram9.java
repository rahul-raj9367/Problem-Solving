//Day-63
//Matrix Program
//Java Program to display the upper triangular matrix
class MatrixProgram9{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int rows,cols;
		rows=a.length;
		cols=a[0].length;
		if(rows!=cols){
			System.out.println("Should be a matrix Square");
		}
		else{
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					if(i>j){
						System.out.print("0 ");
					}
					else{
						System.out.print(a[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	}
}
/*
OUTPUT
1 2 3
0 5 6
0 0 9
*/