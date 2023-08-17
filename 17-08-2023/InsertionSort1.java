/*
InsertionSort -Sorting Asscending Order
*/
class InsertionSort1{
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        insertion(arr);
        System.out.println("After Sorted Array :");
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
    static void insertion(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
/*
OUTPUT
After Sorted Array :
1 2 3 4 5 6
*/