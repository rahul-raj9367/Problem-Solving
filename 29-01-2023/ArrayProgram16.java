//Day-54
//Array Program
//Java Program to sort the elements of an array in descending order Using Buil-in-function
import java.util.Arrays;
import java.util.Collections;
class ArrayProgram16{
	public static void main(String[] args) {
		Integer arr[] = new Integer[]{1,2,3,4,5,5,6,7,8,8,9,9,10,100};
		System.out.println("Elements of original array: ");    
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println();
		System.out.println("Elements of array sorted in ascending order: "); 
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}