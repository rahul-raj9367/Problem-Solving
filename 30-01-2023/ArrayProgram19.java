//Day-55
//Array Program
//Java Program to find Largest Number in an Array
class ArrayProgram19{
	static int getLargest(int a[],int total){
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
		return a[total-1];
	}
	public static void main(String[] args) {
		int a[]={11,23,45,67,89,90,100,101};
		int b[]={111,213,415,167,189,910,1100,1101};
		System.out.println("1rd Largest Number :"+getLargest(a,a.length));
		System.out.println("1rd Largest Number :"+getLargest(b,b.length));
	}
}
/*
OUTPUT
1rd Largest Number :101
1rd Largest Number :1101
*/