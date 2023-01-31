//Day-56
//Array Program
//Java Program to print Odd and Even Numbers from an Array
class ArrayProgram22{
	public static void main(String[] args) {
		int arr[]= new int []{1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even Number in a Array :");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Number in a Array :");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
/*
OUTPUT
Even Number in a Array :
2 4 6 8 10
Odd Number in a Array :
1 3 5 7 9
*/
