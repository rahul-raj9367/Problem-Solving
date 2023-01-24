//Day-50
//Array Program
//Java Program to right rotate the elements of an array
class ArrayProgram12{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5};
		int n=3;//right rotate an Array by 3 elements
		System.out.println("Original array: ");  
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++){
			int last,j;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--){
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();
		System.out.println("Array after right rotation: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
Original array:
1 2 3 4 5
Array after right rotation:
3 4 5 1 2
*/