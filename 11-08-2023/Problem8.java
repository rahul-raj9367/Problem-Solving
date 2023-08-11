/*
Liner Search
*/
class Problem8{
	static int linerSearch(int arr[],int n,int val){
		for(int i=0;i<n;i++){
			if(arr[i]==val){
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={10,22,44,5,6,88,90};
		int val=90;
		int n=arr.length;

		int res=linerSearch(arr,n,val);
		System.out.println();
		System.out.println("Elements of the Array is");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Element to be Searched a"+val);
		if(res==-1){
			System.out.println("Element is not present in the array");  
		}
  		else{
  			System.out.println("Element is present at "+ res +" position of array");  
  		}  
	}
}
/*
OUTPUT
Elements of the Array is
10 22 44 5 6 88 90
Element to be Searched a 90
Element is present at 7 position of array

*/