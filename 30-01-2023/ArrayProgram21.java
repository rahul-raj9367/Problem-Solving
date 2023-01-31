//Day-56
//Array Program
//Java Program to find Smallest Number in an Array
class ArrayProgram21{
	static int getSmallest(int a[],int total){
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
		return a[0];
	}
	public static void main(String[] args) {
		int a[]={1,2,3,5,6,7};
		int b[]={11,23,45,67,89,90,100};
		System.out.println(" Smallest Number  :"+getSmallest(a,a.length));
		System.out.println(" Smallest Number :"+getSmallest(b,b.length));
	}
}
/*
OUTPUT
 Smallest Number :1
 Smallest Number :11
*/
