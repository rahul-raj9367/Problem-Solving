//Day-55
//Array Program
//Java Program to sort the elements of an array in ascending order
class ArrayProgram13{
	public static void main(String[] args) {
		int arr[] = new int[]{5,1,3,2,4};
		int temp =0;
		System.out.println("Elements of original array: ");    
        for(int i=0;i<arr.length;i++){     
            System.out.print(arr[i] + " ");    
        }

        for(int i=0;i<arr.length;i++){
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[i]>arr[j]){
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");      
        for(int i=0;i<arr.length;i++){     
            System.out.print(arr[i] + " ");    
        }
	}
}
/*
OUTPUT
Elements of original array:
10 9 6 7 4 8 3 1 2
Elements of array sorted in ascending order:
1 2 3 4 6 7 8 9 10


Elements of original array:
5 1 3 2 4
Elements of array sorted in ascending order:
1 2 3 4 5
*/
