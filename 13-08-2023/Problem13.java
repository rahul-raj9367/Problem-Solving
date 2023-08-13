/*
If the given Set of Number is 1,2,3,4,5 and the entered input is 3 ,then the Output will be 4 5 1 2 3
LEFT ROTATE
*/
class Problem13{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=3;

		System.out.print("Original Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		for(int i=0;i<n;i++){
			int j,first;
			first=arr[0];
			for(j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[4]=first;
		}

		System.out.println();
		System.out.print("After Rotate : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT
Original Array: 1 2 3 4 5
After Rotate : 4 5 1 2 3
*/