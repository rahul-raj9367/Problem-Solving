//Day-49
//Array Program
//Java Program to print the sum of all the items of the array
class ArrayProgram11{
	public static void main(String[] args) {
		int arr[] = new int[]{10,10,20,30,40,50};
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("Sum of all the elements of an array: " + sum);  
	}
}
/*
OUTPUT
Sum of all the elements of an array: 160
*/