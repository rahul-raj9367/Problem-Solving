//Day 90
//Conversion Program
//Java Date to Timestamp Example
import java.sql.Timestamp;    
import java.util.Date;  
class ConversionProgram15{
	public static void main(String[] args) {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
	}
}
/*
OUTPUT
2023-03-07 22:32:42.479
*/