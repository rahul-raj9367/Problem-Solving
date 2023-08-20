/*
Linear Searching 
*/
class LinearSearch{
	static int LinearSearch(int arr[],int search){
		int l=arr.length;
		for(int i=0;i<l;i++){
			if(arr[i]==search){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={38,90,76,3,11,65,10};
		int search=10;

		int index=LinearSearch(arr,search);
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
Element found at index: 6
*/