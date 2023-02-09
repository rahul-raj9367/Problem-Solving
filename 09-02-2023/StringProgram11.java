//Day-65
//String Program
//Java Program to remove all the white spaces from a string
class StringProgram11{
	public static void main(String[] args) {
		String str="zoho corporation ";
		//Removes the white spaces using regex    
        str=str.replaceAll("\\s+", "");
        System.out.println("String after removing all the white spaces : "+str);
	}
}
/*
OUTPUT
String after removing all the white spaces : zohocorporation
*/