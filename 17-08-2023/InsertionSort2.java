/*
InsertionSort -Sorting Descending Order
*/
class InsertionSort2{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		insertion(arr);
		System.out.println("After Sorted Array");
		for(int value:arr){
			System.out.print(value+" ");
		}
	}
	static void insertion(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
/*
After Sorted Array
6 5 4 3 2 1
*/