//Day-53
//Student Attendance Percentage Calculate 
import java.util.Scanner;
class NumberProgram39{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int regno,totaldays,presentdays;
		System.out.print("Enter the name of the student :");
		name = sc.nextLine();
		System.out.print("Enter the Register number :");
		regno = sc.nextInt();
		System.out.print("Enter the Total days in the semester :");
		totaldays = sc.nextInt();
		System.out.print("Enter the presentdays in the semester :");
		presentdays = sc.nextInt();
		double attendance_per=(100.0*presentdays)/totaldays;
		int mark;
		if(attendance_per>=90){
			mark=5;
		}
		else if(attendance_per>=80){
			mark=4;
		}
		else if(attendance_per>=75){
			mark=3;
		}
		else{
			mark=0;
		}
		System.out.println("Name:"+name );
		System.out.println("Register number:"+regno);
		System.out.println("Number days Present"+presentdays);
		System.out.println("Attendance percentage:"+attendance_per);
		System.out.println("Marks:"+mark);
	}
}
/*
OUTPUT
Enter the name of the student :Rahul Raj
Enter the Register number :1234
Enter the Total days in the semester :154
Enter the presentdays in the semester :130
Name:Rahul Raj
Register number:1234
Number days Present130
Attendance percentage:84.41558441558442
Marks:4

*/