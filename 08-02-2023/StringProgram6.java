//Day-65
//String Program
//Java Program to find all subsets of a string
class StringProgram6{
	public static void main(String[] args) {
		String str="FUN";
		int temp=0;
		int len=str.length();//3
		String arr[] = new String[len*(len+1)/2];//3*(4)/2= [6]
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				arr[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("All subsets of a string");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
/*
OUTPUT
All subsets of a string
F
FU
FUN
U
UN
N
*/