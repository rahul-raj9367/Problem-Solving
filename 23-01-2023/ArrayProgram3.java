//Day-49
//Array Program
//Program to print the duplicate elements of an array
class ArrayProgram3{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,4,5,6,7,2,3,1};
		System.out.println("Duplicate elements in given array: ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]+" ");
				}
			}
		}
	}
}
/*
OUTPUT
Duplicate elements in given array:
1
2
3
4
*/