/*
Biggest of (Sum of row elements )in a Matrix
*/
class Problem10{
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int row=matrix.length;
        int col=matrix[0].length;

        int largestRowSum=Integer.MIN_VALUE;
        int largestRowIndex=-1;

        for(int i=0;i<row;i++){
            int rowSum=0;
            for(int j=0;j<col;j++){
                rowSum+=matrix[i][j];
            }
            if(rowSum>largestRowSum){
                largestRowSum=rowSum;
                largestRowIndex=i;
            }
        }

        if(largestRowIndex!=-1){
            System.out.println("Row with the largest sum is row " + largestRowIndex);
            System.out.println("Sum of elements: " + largestRowSum);
        }
        else{
            System.out.println("Matrix is Empty");
        }

    }
}
/*
OUTPUT
Row with the largest sum is row 2
Sum of elements: 24
*/