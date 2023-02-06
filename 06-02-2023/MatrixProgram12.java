//Day-63
//Matrix Program
//Java Program to determine whether a given matrix is a sparse matrix
class MatrixProgram12{
	public static void main(String[] args) {
		int a[][]={{1,0,0},{0,1,0},{1,4,0}};
		int rows,cols,size,count=0;
		rows=a.length;
		cols=a[0].length;
		size=rows*cols;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(a[i][j]==0){
					count++;
				}
			}
		}

		if(count>(size/2))
		 	System.out.println("Given matrix is a sparse matrix");    
        else    
            System.out.println("Given matrix is not a sparse matrix");    
	}
}
/*
OUTPUT
Given matrix is a sparse matrix
*/