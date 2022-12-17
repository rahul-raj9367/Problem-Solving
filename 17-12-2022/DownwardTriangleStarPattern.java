//Day-12
//DownwardTriangleStarPattern
class  DownwardTriangleStarPattern{
    public static void main(String[] args) {
        //rows
        for(int i=5;i>0;i--){
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT
* * * * *
* * * *
* * *
* *
*
*/