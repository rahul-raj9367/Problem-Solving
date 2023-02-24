//Day 81
//Array Program
//Find The Missing Number in array
class ArrayProgram29{
	public static void main(String[] args) {
		int arr[]={1,3,4,5,6};
		int n=arr.length+1;
		int sum=(n*(n+1))/2;
		for(int i=0;i<arr.length;i++){
			sum=sum-arr[i];
		}
		System.out.println("Missing element in the array is "+sum);
	}
}
/*
OUTPUT
Missing element in the array is 2
*/