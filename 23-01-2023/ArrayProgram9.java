//Day-49
//Array Program
//Program to print the Smallest element in an array
class ArrayProgram9{
	public static void main(String[] args) {
		int arr[] =new int[]{25,34,7,56,78,90};
		int max=arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i]<max)
				max=arr[i];
		}
		System.out.println("Smallest element present in given array: " + max);  
	}
}
/*
OUTPUT
Smallest element present in given array: 7
*/