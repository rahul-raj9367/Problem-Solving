/*
Form First N Number of +ve Integers.Find the missing Element and Duplicate Element
*/
import java.util.Arrays;
class Problem3{
	static void checkmissingandDuplicate(int arr[]){
		Arrays.sort(arr);

		int missingElement=-1;
		int duplicateElememt=-1;

		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
				duplicateElememt=arr[i];
			}24
			else if(arr[i]>arr[i-1]+1){
				missingElement=arr[i-1]+1;
			}
		}

		System.out.println("DuplicateElememt "+duplicateElememt);
		System.out.println("MissingElement "+missingElement);


	}
	public static void main(String[] args) {
		int arr[]={1,2,2,3,5};
		checkmissingandDuplicate(arr);
	}
}
/*
OUTPUT
DuplicateElememt2
MissingElement4
*/