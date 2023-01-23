//Day-49
//Array Program
//Program to print the elements of an array in reverse order
class ArrayProgram5{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5};
		System.out.println("Original array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}  
		System.out.println();
		System.out.println("Reverse array: ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
Original array:
1 2 3 4 5
Reverse array:
5 4 3 2 1
*/