/*
Reversing a Array
*/
class ReversingArray2{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int l=arr.length-1;
		System.out.println("After Reverse Array");
		for(int i=l;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
After Reverse Array
5 4 3 2 1
*/