//Day-56
//Array Program
//Java Program to find Second Smallest Number in an Array
class ArrayProgram20{
	static int getSecondSmallest(int a[],int total){
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
		return a[1]; //2nd element because index starts from 0  
	}
	public static void main(String[] args) {
		int a[]={11,23,45,67,89,90,100,101};
		int b[]={111,213,415,167,189,910,1100,1101};
		System.out.println("Second Smallest Number:"+getSecondSmallest(a,a.length));
		System.out.println("Second Smallest Number:"+getSecondSmallest(b,b.length));
	}
}
/*
OUTPUT
Second Smallest Number:23
Second Smallest Number:167
*/
