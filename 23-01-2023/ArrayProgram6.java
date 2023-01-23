//Day-49
//Array Program
//Program to print the elements of an array present on even position
class ArrayProgram6{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("Elements of given array present on even position: ");
		for(int i=0;i<arr.length;i++){
			if(i%2==1)
			   System.out.print(arr[i]+" ");
		}  
	}
}
/*
OUTPUT
Elements of given array present on even position:
2 4 6 8 10
*/