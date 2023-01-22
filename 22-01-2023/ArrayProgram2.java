//Day-48
//Array Program
//left rotate the elements of an array
import java.util.Arrays; 
class ArrayProgram2{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5};
		int n=3; //left rotate an Array by 3 elements
		System.out.println("Original array: ");  
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		for(int j=0;j<n;j++){
			int first=arr[0];
			int size=arr.length;
			for(int i=0;i<size-1;i++){
				arr[i]=arr[i+1]; // 1=2,2=3,3=4,4=5;
			}
			arr[size-1]=first; //5=1;
		}
		System.out.println();
		System.out.println("Array after left rotation: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
Original array:
1 2 3 4 5
Array after left rotation:
4 5 1 2 3
*/