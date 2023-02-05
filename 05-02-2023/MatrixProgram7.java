//Day-62
//Matrix Program
//Java Program to determine whether a given matrix is an identity matrix
class MatrixProgram7{
	public static void main(String[] args) {
		int a[][]={{1,0,0},{0,1,0},{0,0,1}};

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j && a[i][j] != 1){    
                   	System.out.println("Given matrix is not an identity matrix"); 
                   	System.exit(0);    
                }
                else if(i==j && a[i][j]==1){
                	System.out.println("Given matrix is an identity matrix");
                	System.exit(0);
                }  
			}
		}
	}
}