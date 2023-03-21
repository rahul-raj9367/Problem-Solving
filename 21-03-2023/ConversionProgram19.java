//Day-98
//Java Date to Timestamp Example
import java.sql.Timestamp;    
import java.util.Date;
class ConversionProgram19{
	public static void main(String[] args) {
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        System.out.println(ts);  
	}
}
/*
OUTPUT
2023-03-19 21:58:31.734
*/