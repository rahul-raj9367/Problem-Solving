/*
Merge 2 Arrays While Merging Eliminate all duplicate elements
*/
class Problem6{
	public static void main(String[] args) {
		int arr1[]={1,5,2,5,6};
		int arr2[]={8,4,3,3};

		int length1=arr1.length;
		int length2=arr2.length;

		int mergerdArray[] = new int[length1+length2];

		System.arraycopy(arr1,0,mergerdArray,0,length1);

		System.arraycopy(arr2,0,mergerdArray,length1,length2);

		System.out.println("Two Arrays are mergerd");
		for(int i=0;i<mergerdArray.length;i++){
			System.out.print(mergerdArray[i]+" ");
		}
		System.out.println();
		for(int i=0;i<mergerdArray.length;i++){
			for(int j=i+1;j<mergerdArray.length;j++){
				if(mergerdArray[i]==mergerdArray[j]){
					mergerdArray[j]=-1;
				}
			}
		}
		System.out.println("After Remove the Duplicate Elements");
		for(int i=0;i<mergerdArray.length;i++){
			if(mergerdArray[i]!=-1){
				System.out.print(mergerdArray[i]+" ");
			}
		}
	}
}

/*
OUTPUT
Two Arrays are mergerd
1 5 2 5 6 8 4 3 3
After Remove the Duplicate Elements
1 5 2 6 8 4 3
*/