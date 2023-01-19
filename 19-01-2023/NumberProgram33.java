//Day-45
//Number Program
// Display Odd Numbers From 1 to 100 using for Loop
class NumberProgram33{
	static void method(int n){
		for(int i=1;i<=n;i++){
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		System.out.print("List of Odd numbers: ");
		int num =100;
		method(num);
	}
}
/*
OUTPUT
List of Odd numbers: 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
*/