//Day-45
//Number Program
// Display Even Numbers From 1 to 100 using for Loop
class NumberProgram32{
	static void method(int n){
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		System.out.print("List of even numbers: ");
		int num =100;
		method(num);
	}
}
/*
OUTPUT
List of even numbers: 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100
*/