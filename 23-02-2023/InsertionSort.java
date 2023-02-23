//Day 80
//InsertionSort Program
class InsertionSort{
	static void insertionSort(int arr[]){
		int n=arr.length;
		for(int j=1;j<n;j++){
			int key=arr[j];
			int i=j-1;
			while((1>-1)&&(arr[i]>key)){
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	}
	public static void main(String[] args) {
		int arr[]={0,12,45,7,2,9,6,3};
		System.out.println("Before InsertionSort the Array");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();

		insertionSort(arr);

		System.out.println("After InsertionSort the Array");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
/*
OUTPUT
Before InsertionSort the Array
0 12 45 7 2 9 6 3
After InsertionSort the Array
0 2 3 6 7 9 12 45
*/