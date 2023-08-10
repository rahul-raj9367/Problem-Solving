/*
To get user input for an array in Java
*/
import java.util.Scanner;
class Problem5{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=in.nextInt();

		int array[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element"+(i+1)+":");
            array[i] = in.nextInt();
		}

		System.out.println("Print The Array Elements");
		for(int value:array){
			System.out.println(value);
		}

	}
}
/*
Enter the Array Size
5
Enter element1:10
Enter element2:20
Enter element3:30
Enter element4:40
Enter element5:50
Print The Array Elements
10
20
30
40
50
*/