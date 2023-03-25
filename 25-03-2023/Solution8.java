//Day-104
//HackerRank (Basic Program)
//Remove Duplicate Words
import java.util.Scanner;
class Solution8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="rahul raj ZOHO rahul raj ";
		String sp[] = str.split(" ");
		System.out.println("After Remove Duplicate ");
		for(int i=0;i<sp.length;i++){
			for(int j=i+1;j<sp.length;j++){
				if(sp[i].equals(sp[j])){
					sp[j]="0";
				}
			}
			if(sp[i]!="0"){
				System.out.print(sp[i]+" ");
			}
		}
	}
}
/*
OUTPUT
After Remove Duplicate
rahul raj ZOHO 
*/