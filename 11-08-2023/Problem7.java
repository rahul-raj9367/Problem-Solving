/*
Sum of Both Diagonal of a Square Matrix 
*/
class Problem7{
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int size=arr.length;
        int mainSum=0;
        int secondSum=0;

        for(int i=0;i<size;i++){
            mainSum=mainSum+arr[i][i];//1+5+9= 15
            secondSum=secondSum+arr[i][2-i];//3+5+7=15
        }
        System.out.println("Main Diagonal Sum: "+mainSum);
        System.out.println("Secondary Diagonal Sum: "+secondSum);
    }
}
/*
OUTPUT
Main Diagonal Sum: 15
Secondary Diagonal Sum: 15
*/