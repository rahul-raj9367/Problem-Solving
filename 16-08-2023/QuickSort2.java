/*
QuickSort - Sorting Descending Order
*/
class QuickSort2{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int l=arr.length-1;

		quickSort(arr,0,l);
		System.out.println("After Sorted Array:");
		for(int value: arr){
			System.out.print(value+" ");
		}
	}
	static void quickSort(int arr[],int low,int high){
		if(low<high){
			int pi=partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

	static int partition(int arr[],int low,int high){
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]>pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;

		return i+1;
	}
}
/*
OUTPUT
After Sorted Array:
6 5 4 3 2 1
*/