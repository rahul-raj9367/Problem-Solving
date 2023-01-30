//Day-55
//Array Program
//Java Program to find Second Largest Number in an Array
class ArrayProgram18{
	static int getSecondLargest(int a[],int total){
		int temp;
		for(int i=0;i<total;i++){
			for(int j=i+1;j<total;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}
	public static void main(String[] args) {
		int a[]={1,2,3,5,6,7};
		int b[]={11,23,45,67,89,90,100};
		System.out.println("2rd Largest Number :"+getSecondLargest(a,a.length));
		System.out.println("2rd Largest Number :"+getSecondLargest(b,b.length));
	}
}
/*
OUTPUT
2rd Largest Number :6
2rd Largest Number :90
*/