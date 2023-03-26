//Day-105
//HackerRank (Basic Program)
//Remove Duplicate Character
import java.util.Scanner;
class Solution9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="rahulra ";
		char sp[] = str.toCharArray();
		System.out.println("After Remove Duplicate ");
		for(int i=0;i<sp.length;i++){
			for(int j=i+1;j<sp.length;j++){
				if(sp[i]==sp[j]){
					sp[j]='0';
				}
			}
			if(sp[i]!='0'){
				System.out.print(sp[i]+" ");
			}
		}
	}
}
/*
OUTPUT
r a h u l
*/