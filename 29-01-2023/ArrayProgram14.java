//Day-54
//Array Program
//Java Program to sort the elements of an array in ascending order Using Buil-in-functions
import java.util.Arrays; 
class ArrayProgram14{
	public static void main(String[] args) {
		int arr[] = new int[]{10,2,7,3,6,4,8,0,1,9};
		System.out.println("Elements of original array: ");    
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Elements of array sorted in ascending order: "); 
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
Elements of original array:
10 2 7 3 6 4 8 0 1 9
Elements of array sorted in ascending order:
0 1 2 3 4 6 7 8 9 10
*/