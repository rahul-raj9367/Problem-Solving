//Day-56
//Array Program
//How to Sort an Array in Java
class ArrayProgram23{
	public static void main(String[] args) {
		int arr[]=new int[]{113,124,35,12,34,90,12,22,10};
		System.out.println("Original array: ");  
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();  
		System.out.println("Elements of array sorted in ascending order: ");    
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
Original array:
113 124 35 12 34 90 12 22 10
Elements of array sorted in ascending order:
10 12 12 22 34 35 90 113 124
*/
