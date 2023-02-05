//Day-62
//Matrix Program
//Java Program to determine whether two matrices are equal
class MatrixProgram4{
	public static void main(String[] args) {
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j]!=b[i][j]){
					 System.out.println("Matrices are not equal");
					 System.exit(0);   
				}
			}
		}
		System.out.println("Matrices is equal :");
	}
}
/*
OUTPUT
Matrices is equal :
*/