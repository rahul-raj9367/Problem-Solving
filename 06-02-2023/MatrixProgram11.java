//Day-63
//Matrix Program
//Java Program to find the product of two matrices
class MatrixProgram11{
	public static void main(String[] args) {
		int a[][]={{1,3,2},{3,1,1},{1,2,2}};
		int b[][]={{2,1,1},{1,0,1},{1,3,1}};
		int p[][]=new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					p[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
7 7 6
8 6 5
6 7 5
*/