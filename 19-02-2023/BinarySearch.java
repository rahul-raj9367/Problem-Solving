//Day 76
//Binary Search in Java 
class BinarySearch{
	static void binearSearch(int arr[],int first,int last,int key){
		int mid=(first+last)/2;
		while(first<=last){
			if(arr[mid]<key){
				first=mid+1;
			}
			else if(arr[mid]==key){
				System.out.println(key+" Element is found at index:"+mid);  
				System.exit(0);
			}
			else{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last){
				System.out.println("Element is not found ");  
		}
	}
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		int key=50;
		int len=arr.length-1;
		binearSearch(arr,0,len,key);//Call the Method
	}
}
/*
OUTPUT
50 Element is found at index:4
*/