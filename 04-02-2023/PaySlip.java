//Day-61
//Employeee Pay Slip Generation
import java.util.*;
import java.io.*;
class Employee {
	int empid;
	long mobile;
	String name,address,mailid;
	Scanner sc = new Scanner(System.in);
	void getdata(){
		System.out.println("Enter name of the Employee :");
		name=sc.nextLine();
		System.out.println("Enter mail id :");
		mailid=sc.nextLine();
		System.out.println("Enter Address of the Employee:");
		address=sc.nextLine();
		System.out.println("Enter Employee id :");
		empid=sc.nextInt();
		System.out.println("Enter the mobile NUmber :");
		mobile=sc.nextLong();
	}
	void display(){
		System.out.println("Employee Name"+name);
		System.out.println("Employee id"+empid);
		System.out.println("Mail id"+mailid);
		System.out.println("Address"+address);
		System.out.println("Mobile Number "+mobile);
	}
}
class Programmer extends Employee {
	double salary,bp,da,hra,pf,club,net,gross;
	void getprogrammer(){
		System.out.println("Enter Basic pay :");
		bp=sc.nextDouble();
	}
	void calculatepro(){
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("*************");
		System.out.println("PAY SLIP FOR PROGRAMMER ");
		System.out.println("********************");
		System.out.println("Basic pay "+bp);
		System.out.println("DA:Rs"+da);
		System.out.println("HRA:Rs"+hra);
		System.out.println("PE:Rs"+pf);
		System.out.println("CLUB:Rs"+club);
		System.out.println("GROSS PAY:Rs "+ gross);
		System.out.println("NET PAY Rs:"+net);
	}
} 
class AsstProfessor extends Employee {
	double salary,bp,da,hra,pf,club,net,gross;
	void getAsst(){
		System.out.println("Enter Basic pay :");
		bp=sc.nextDouble();
	}
	void calculateAsst(){
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("*************");
		System.out.println("PAY SLIP FOR PROGRAMMER ");
		System.out.println("********************");
		System.out.println("Basic pay "+bp);
		System.out.println("DA:Rs"+da);
		System.out.println("HRA:Rs"+hra);
		System.out.println("PE:Rs"+pf);
		System.out.println("CLUB:Rs"+club);
		System.out.println("GROSS PAY:Rs "+ gross);
		System.out.println("NET PAY Rs:"+net);
	}
} 
class AssociateProfessor extends Employee {
	double salary,bp,da,hra,pf,club,net,gross;
	void getAssociate(){
		System.out.println("Enter Basic pay :");
		bp=sc.nextDouble();
	}
	void calculateAssociate(){
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("*************");
		System.out.println("PAY SLIP FOR PROGRAMMER ");
		System.out.println("********************");
		System.out.println("Basic pay "+bp);
		System.out.println("DA:Rs"+da);
		System.out.println("HRA:Rs"+hra);
		System.out.println("PE:Rs"+pf);
		System.out.println("CLUB:Rs"+club);
		System.out.println("GROSS PAY:Rs "+ gross);
		System.out.println("NET PAY Rs:"+net);
	}
} 
class Professor extends Employee {
	double salary,bp,da,hra,pf,club,net,gross;
	void getprof(){
		System.out.println("Enter Basic pay :");
		bp=sc.nextDouble();
	}
	void calculateprof(){
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("*************");
		System.out.println("PAY SLIP FOR PROGRAMMER ");
		System.out.println("********************");
		System.out.println("Basic pay "+bp);
		System.out.println("DA:Rs"+da);
		System.out.println("HRA:Rs"+hra);
		System.out.println("PE:Rs"+pf);
		System.out.println("CLUB:Rs"+club);
		System.out.println("GROSS PAY:Rs "+ gross);
		System.out.println("NET PAY Rs:"+net);
	}
}
class PaySlip{
	public static void main(String[] args) {
		int choice,cont;
		do{
			System.out.println("PAY SLIP ");
			System.out.println("1.PROGRAMMER \t2.AsstProfessor\t 3.AssociateProfessor\t4.Professor");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your choice ");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				Programmer obj= new Programmer();
				obj.getdata();
				obj.getprogrammer();
				obj.display();
				obj.calculatepro();
				break;
			case 2:
				AsstProfessor asst = new AsstProfessor();
				asst.getdata();
				asst.getAsst();
				asst.display();
				asst.calculateAsst();
				break;
			case 3:
				AssociateProfessor asst1 = new AssociateProfessor();
				asst1.getdata();
				asst1.getAssociate();
				asst1.display();
				asst1.calculateAssociate();
				break;
			case 4:
				Professor asst2 = new Professor();
				asst2.getdata();
				asst2.getprof();
				asst2.display();
				asst2.calculateprof();
				break;
			}
			System.out.println("please 0 to quit and 1 to continue");
			cont=sc.nextInt();
		}while(cont==1);
	}
}