/*
Computing the sum of all elements in a Array
*/
class SumofArray{
	static int ComputingSum(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int total=ComputingSum(arr);
		System.out.println("sum of all elements : "+total);
	}
}
/*
OUTPUT
sum of all elements : 21
*/