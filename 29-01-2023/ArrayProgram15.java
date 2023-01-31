//Day-55
//Array Program
//Java Program to sort the elements of an array in descending order
class ArrayProgram15{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		int temp =0;
		System.out.println("Elements of original array: ");    
        for(int i=0;i<arr.length;i++){     
            System.out.print(arr[i] + " ");    
        }

        for(int i=0;i<arr.length;i++){
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[i]<arr[j]){
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order: ");      
        for(int i=0;i<arr.length;i++){     
            System.out.print(arr[i] + " ");    
        }
	}
}
/*
OUTPUT
Elements of original array:
5 10 19 14 13 11 5 7 8 22 1 3 2 4
Elements of array sorted in descending order:
22 19 14 13 11 10 8 7 5 5 4 3 2 1

Elements of original array:
1 2 3 4 5 6 7 8 9 10
Elements of array sorted in descending order:
10 9 8 7 6 5 4 3 2 1
*/
