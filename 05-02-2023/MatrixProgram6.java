//Day-62
//Matrix Program
//Java Program to find the transpose of a given matrix
class MatrixProgram6{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int t[][]=new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				t[i][j]=a[j][i];
			}
		}

		System.out.println("Transpose of given matrix: ");    
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
               System.out.print(t[i][j] + " ");    
            }    
        	System.out.println();
        }   
	}
}
/*
OUTPUT
Transpose of given matrix:
1 4 7
2 5 8
3 6 9
*/