/*
Binary Search
*/
class binarySearch{
	static int BinarySearch(int arr[],int target){
		int low=0;
		int high=arr.length-1;

		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==target){
				return mid;
			}
			else if(arr[mid]<target){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,6,7,8,10};
		int target=6;

		int index=BinarySearch(arr,target);
		if(index!=-1){
			System.out.println("Element found at index: "+index);
		}
		else{
			System.out.println("Element not found in the Array:");
		}
	}
}
/*
OUTPUT
Element found at index: 3
*/