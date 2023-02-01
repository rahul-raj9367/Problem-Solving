//Day-58
//Array Program
//Merging two Arrays
import java.util.*;
class ArrayProgram26{
	public static void main(String[] args) {
		int arr[]={1,23,45,6};
		int arr2[]={1,34,67,8};
		int c[]=new int[arr.length+arr2.length];
		int ci=0;
		for(int i=0;i<arr.length;i++){
			c[ci]=arr[i];
			ci++;
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			c[ci]=arr2[i];
			ci++;
		}
		System.out.println();
		System.out.println("Merging the two array");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
}
/*
OUTPUT
Merging the two array
1 23 45 6 1 34 67 8
*/