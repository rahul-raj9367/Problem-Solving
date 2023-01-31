//Day-56
//Array Program
//Sort odd number in descending order and even number in ascending order 
class ArrayProgram25{
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int arr2[]=new int[arr.length];
		System.out.println("Even Number in Ascending order :");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Number in Descending order :");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				arr2[i]=arr[i];
			}
		}
		System.out.println("Reverse theDescending order :");
		for(int i=arr2.length-1;i>=0;i--){
			if(arr2[i]==0){
				System.out.print("");
			}
			else{
				System.out.print(arr2[i]+" ");
			}
		}
	}
}
/*
OUTPUT
Even Number in Ascending order :
2 4 6 8 10 12 14 16
Odd Number in Descending order :
1 3 5 7 9 11 13 15 17
Reverse theDescending order :
17 15 13 11 9 7 5 3 1
*/