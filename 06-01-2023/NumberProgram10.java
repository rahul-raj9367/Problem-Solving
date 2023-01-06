//Day-32
//Number Program
//Fascinating Number num=192=>,n2=num*2,n3=num*3=>192 384 576 .To check equal[1,2,3,4,5,6,7,8,9]
//If the given number is a 3 or more than three-digit
//If the value getting after concatenation contains all digits from 1 to 9,
import java.util.Scanner;
class NumberProgram10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		int n2,n3;
		n2=num*2;
		n3=num*3;
		//concatenation num,n2,3 
		String con=num+""+n2+n3;
		boolean found=true;
		for(char c='1';c<='9';c++){
			int count=0;
			for(int i=0;i<con.length();i++){
				char ch=con.charAt(i);
				if(ch==c)
					count++;
			}
			if(count>1||count==0){
				found=false;
				break;
			}
		}
		if(found){
			System.out.println("is a Fascinating Number");
		}
		else{
			System.out.println("is not a Fascinating Number");
		}
	}
}
/*
OUTPUT
Enter the Number :192
is a Fascinating Number

Enter the Number :139
is not a Fascinating Number
*/