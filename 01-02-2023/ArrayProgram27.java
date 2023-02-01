//Day-58
//Array Program
//Remove Duplicate Element in Array using Temporary Array
class ArrayProgram27{
	public static void main(String[] args) {
		int arr[]={10,20,20,30,30,40,40,50,50};
		System.out.println("Original Array :");  
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[i]==arr[j]){
        			arr[i]=-2;
        		}
        	}
        }
        System.out.println();
        System.out.println("Duplicate Array Removed :");
        for(int i=0;i<arr.length;i++){
        	if(arr[i]!=-2)
        		System.out.print(arr[i]+" ");
        }
	}
}
/*
OUTPUT
Original Array :
10 20 20 30 30 40 40 50 50
Duplicate Array Removed :
10 20 30 40 50
*/