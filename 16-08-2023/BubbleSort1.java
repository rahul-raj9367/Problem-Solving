/*
Bubble Sort - Sorting Asscending Order
*/
class BubbleSort1{
	public static void main(String[] args) {
		int temp;
		int arr[]={5,4,3,2,1};
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			for(int j=0+i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After Sorting Asscending Order : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
Original Array:
5 4 3 2 1
After Sorting Asscending Order :
1 2 3 4 5
*/