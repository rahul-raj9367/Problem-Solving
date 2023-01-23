//Day-49
//Array Program
//Program to print the elements of an array present on Odd position
class ArrayProgram7{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("Elements of given array present on Odd position: ");
		for(int i=0;i<arr.length;i++){
			if(i%2==0)
			   System.out.print(arr[i]+" ");
		}  
	}
}
/*
OUTPUT
Elements of given array present on Odd position:
1 3 5 7 9
*/