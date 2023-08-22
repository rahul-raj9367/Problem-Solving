/*
Finding the maximum and minimum elements in a Array
*/
class MaximumandMinimum{
	static int findmax(int arr[]){
		int max=arr[0];
		for(int value:arr){
			if(value>max){
				max=value;
			}
		}
		return max;
	}
	static int findmin(int arr[]){
		int min=arr[0];
		for(int value:arr){
			if(value<min){
				min=value;
			}
		}
		return min;

	}
	public static void main(String[] args) {
		int arr[]={11,92,4,8,56,76,23,90,1,2};

		int max=findmax(arr);
		int min=findmin(arr);
		System.out.println(max+" MAX");
		System.out.println(min+" MIN");

	}
}