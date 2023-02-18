//Day 75
//Linear Search in Java
class LinearSearch{
	static int linear_Search(int arr[],int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		int key=50;
		System.out.println(key+" is found at index: "+linear_Search(arr,key));
	}
}
/*
OUTPUT
50 is found at index: 4
*/