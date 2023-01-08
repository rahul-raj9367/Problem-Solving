//Day-34
//Number Program
//Keith Number
import java.util.*;
class NumberProgram11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number:");
		int n =sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp =n,sum=0,start=0;
		while(temp>0){
			int rem=temp%10;
			arr.add(0,rem);
			temp=temp/10;
			sum=sum+rem;
		}
		while(sum<n){
			arr.add(sum);
			System.out.println(sum+" ");
			sum=sum+sum-arr.get(start);
			start++;
		}
		if(sum==n){
			System.out.println("yes is a Keith Number ");
		}
		else{
			System.out.println("no is not  a Keith Number ");
		}
	}
}
/*
OUTPUT
Enter The Number: 19
yes is a Keith Number
*/
