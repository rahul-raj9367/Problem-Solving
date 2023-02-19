//Day 76
//Bubble Sort in Java
class BubbleSort{
	static void bubblesort(int arr[]){
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]={2,8,34,89,67,12,34,56,9};

		System.out.println("Array Before Bubble Sort");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		bubblesort(arr); 
		System.out.println();
		System.out.println("Array After Bubble Sort");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		} 
	}
}
/*
OUTPUT
2 8 34 89 67 12 34 56 9
Array After Bubble Sort
2 8 9 12 34 34 56 67 89
*/