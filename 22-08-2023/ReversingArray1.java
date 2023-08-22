/*
Reversing a Array
*/
class ReversingArray1{
	static void reverseArray(int arr[]){
		int low=0;
		int high=arr.length-1;
		while(low<high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;

			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};

		reverseArray(arr);
		System.out.println("After Reverse Array");
		for(int value:arr){
			System.out.print(value+" ");
		}
	}
}
/*
OUTPUT
After Reverse Array
5 4 3 2 1
*/