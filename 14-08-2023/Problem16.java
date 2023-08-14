/*
Tautonym
*/
class Problem16{
	public static void main(String[] args) {
		int a=100;
		int b=50;
		int c=20;
		int d=10;
		if(a>b && b>c && c>d && d<a){
			System.out.println("Is a Tautonym");
		}
		else{
			System.out.println("Is not a Tautonym");
		}
	}
}
/*
OUTPUT
Is a Tautonym
*/