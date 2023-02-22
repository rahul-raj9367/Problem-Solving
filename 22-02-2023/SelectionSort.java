//Day 78
//Selection Sort Program
class SelectionSort{
	static void selectionsort(int arr[]){
		for(int i=0;i<arr.length;i++){
			int index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[index])
					index=j;
			}
			int smnum=arr[index];
			arr[index]=arr[i];
			arr[i]=smnum;
		}
	}

	public static void main(String[] args) {
		int arr[]={89,8,76,5,45,2,34,9};
		System.out.println("Before SelectionSort Array");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();

		selectionsort(arr);

		System.out.println("After SelectionSort Array");
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}
/*
OUTPUT
Before SelectionSort Array
89 8 76 5 45 2 34 9
After SelectionSort Array
2 5 8 9 34 45 76 89
*/