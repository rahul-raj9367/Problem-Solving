//Day-52
//ElectricityBill 
import java.util.*;
import java.io.*;
class ElectricityBill{
	double bills;
	double domesticbillCalc(int units){
		if(units<100){
			bills=units*1;
		}
		else if(units<=200){
			bills=100*1+(units-100)*2.50;
		}
		else if(units<=500){
			bills=100*1+200*2.50+(units-200)*4;
		}
		else{
			bills=100*1+200*2.50+500*4+(units-500)*6;
		}
		return bills;
	}
	double commercialbillCalc(int units){
		if(units<100){
			bills=units*2;
		}
		else if(units<=200){
			bills=100*1+(units-100)*4.50;
		}
		else if(units<=500){
			bills=100*1+200*4.50+(units-200)*6;
		}
		else{
			bills=100*1+200*4.50+500*6+(units-500)*7;
		}
		return bills;
	}
	void show(String ptype,String consno,String consname,int pmr,int cmr,int units){
		System.out.println("Type of Connection: "+ptype);
		System.out.println("Consumer Number: "+consno);
		System.out.println("Consumer Name : "+consname);
		System.out.println("Previous Month Reading: "+pmr);
		System.out.println("Current Month Reading : "+cmr);
		System.out.println("Units Consumed: "+units);
	}
}
class Ebill{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Type of Connection :");
		String ptype=sc.nextLine();
		System.out.println("Enter the Consumer Number :");
		String consno=sc.nextLine();
		System.out.println("Enter the Consumer Name ::");
		String consname=sc.nextLine();
		System.out.println("Enter the  Previous Month Reading:");
		int pmr=sc.nextInt();
		System.out.println("Enter the  Current Month Reading:");
		int cmr=sc.nextInt();
		int units =cmr-pmr;
		ElectricityBill obj = new ElectricityBill();
		if(ptype.equalsIgnoreCase("DOMESTIC")){
			obj.show(ptype,consno,consname,pmr,cmr,units);
			obj.domesticbillCalc(units);
			System.out.println("Bill is "+obj.bills);
		}
		else if(ptype.equalsIgnoreCase("COMMERCIAL")){
			obj.show(ptype,consno,consname,pmr,cmr,units);
			obj.commercialbillCalc(units);
			System.out.println("Bill is "+obj.bills);
		}
	}
}