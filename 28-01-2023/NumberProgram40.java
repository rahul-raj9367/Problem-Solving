//Day-54
//Find Leap Year using Inheritance Concept
import java.util.Scanner;
class Rahul{
	int year;
	void getdata(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year :");
		year = sc.nextInt();
	}
}
class Saimon extends Rahul{
	void calculate(){
		if((year%400==0) ||(year%4==0)){
			System.out.println(year+" is a Leap Year");
		}
		else{
			System.out.println(year+"Not Leap Year");
		}
	}
}
class NumberProgram40 extends Saimon {
	public static void main(String[] args) {
		Saimon5 obj = new Saimon5();
		obj.getdata();
		obj.calculate();
	}
}
/*
Enter the Year :2024
2024 is a Leap Year
*/