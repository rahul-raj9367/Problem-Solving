//Day-56
//Array Program
//Java Program to find Third Largest Number in an Array
class ArrayProgram17{
	static int getThirdLargest(int a[],int total){
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
		return a[total-3];
	}
	public static void main(String[] args) {
		int a[]={1,2,3,5,6,7};
		int b[]={11,23,45,67,89,90,100};
		System.out.println("3rd Largest Number :"+getThirdLargest(a,a.length));
		System.out.println("3rd Largest Number :"+getThirdLargest(b,b.length));

	}
}
/*
OUTPUT
3rd Largest Number :5
3rd Largest Number :89
*/
