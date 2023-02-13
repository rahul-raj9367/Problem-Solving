//Day-70
//String Program
//Java Program to replace the spaces of a string with a specific character
class StringProgram14{
	public static void main(String[] args) {
		String name="I am a WebDeveloper";
		char ch='-';
		name=name.replace(' ',ch);
		System.out.println("String after replacing Spaces with given character :");
		System.out.println(name);
	}
}
/*
OUTPUT
I-am-a-WebDeveloper
*/