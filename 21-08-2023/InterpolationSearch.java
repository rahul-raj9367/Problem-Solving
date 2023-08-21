class InterpolationSearch{
	static int InterpolationSearch(int arr[],int target){
		int low=0;
		int high=arr.length-1;

		while(low<=high && target>=arr[low] && target<=arr[high]){
			if(low==high){
				if(arr[low]==target){
					return low;
				}
				return -1;
			}

			int pos=low+((target-arr[low])*(high-low))/(arr[high]-arr[low]);

			if(arr[pos]==target){
				return pos;
			}
			if(arr[pos]<target){
				low=pos+1;
			}else{
				high=pos-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,2,4,5,6,7,9};
		int target=6;

		int index=InterpolationSearch(arr,target);
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
Element found at index: 4
*/