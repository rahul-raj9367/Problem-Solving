/*
Bubble Sort - Sorting Descending Order
*/
class BubbleSort2{
	public static void main(String[] args) {
		int temp;
		int arr[]={1,2,3,4,5};
		System.out.println("Original Array ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After Sorting Descending Order : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
Original Array
1 2 3 4 5
After Sorting Descending Order :
5 4 3 2 1
*/