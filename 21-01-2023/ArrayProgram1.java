//Day-47
//Array Program
//copy all elements of one array into another array
class ArrayProgram1{
	public static void main(String[] args) {
		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = new int[arr1.length];

		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];//Copying all elements of one array into another    
		}
		//Displaying elements of array arr1 
		System.out.println("Elements of original array :");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();

		//Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}
/*
OUTPUT
Elements of original array :
1 2 3 4 5
Elements of new array:
1 2 3 4 5



*/