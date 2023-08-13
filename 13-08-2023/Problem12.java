/*
If the given Set of Number is 1,2,3,4,5 and the entered input is 3 ,then the Output will be 3 4 5 1 2
RIGHT ROTATE 
*/
class Problem12{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=3;
		System.out.print("Original Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		for(int i=0;i<n;i++){
			int j,last;
			last=arr[arr.length-1];//Index 4
			for(j=arr.length-1;j>0;j--){
				arr[j]=arr[j-1];
			}
			arr[0]=last;
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
After Rotate : 3 4 5 1 2
*/