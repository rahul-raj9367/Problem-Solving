/*
Get input for a array from the user.Reverse the each element of the Array and then print the elements in descending order
INPUT:[45, 87,871,52,19]
OUTPUT:[178,91,78,54,25]
*/
class Problem1{
	static int reverse(int n){
		int sum=0,rev;
		while(n>0){
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int temp;
		int arr[]={45,87,871,52,19};
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		};
		System.out.println();
		System.out.println("Reverse the Array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=reverse(arr[i]);
		};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		};
		System.out.println();
		System.out.println("descending order:");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		};
	}
}
/*
OUTPUT
Original Array:
45 87 871 52 19
Reverse the Array:
54 78 178 25 91
descending order:
178 91 78 54 25
*/