//Day-56
//Array Program
//Reverse the each elemnt of the array and then print the elemnt in descending order
class ArrayProgram24{
	static int getreverse(int num){
		int sum=0,rev;
		while(num>0){
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= new int[]{12,34,56,78,91};
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			arr[i]=getreverse(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse the each elemnt of the array :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Desconding order :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
Original Array:
12 34 56 78 91
Reverse the each elemnt of the array :
21 43 65 87 19
Desconding order :
87 65 43 21 19
*/