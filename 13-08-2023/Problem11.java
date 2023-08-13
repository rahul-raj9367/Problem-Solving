/*
Number of Possible Combination Created from a set of Numbers
n=5,r=3
FORMULA : nCr=n!/(r!*(n-r)!)
          nCr=5!/(3!*(5-3)!)
          ncr=10
*/
class Problem11{
	static int factorial(int n){
		if(n==0||n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
	static int nCr(int n, int r){
		return factorial(n) / (factorial(r) * factorial(n - r));
	}
	public static void main(String[] args) {
		int n=5;
		int r=3;

		int combination=nCr(n,r);
		System.out.println("Number of combination "+combination);
	}
}
/*
OUTPUT
Number of combination 10
*/