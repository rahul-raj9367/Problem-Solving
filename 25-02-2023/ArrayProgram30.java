//Day 82
//Array Program
//Move All Zeroes to find the Array
class ArrayProgram30{
	public static void main(String[] args) {
		int arr[]={1,0,2,0,3,0};
		int len=arr.length;
		int count=0;

		for(int i=0;i<len;i++){
			if(arr[i]!=0){
				arr[count++]=arr[i];
			}
		}
		
		while(count<len){
			arr[count++]=0;
		}

		for(int j=0;j<len;j++){
			System.out.print(arr[j]+" ");
		}
	}
}
/*
OUTPUT
1 2 3 0 0 0
*/