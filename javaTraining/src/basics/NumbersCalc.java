package basics;

public class NumbersCalc {
	public static void main (String[] args) {
		printName();
		int numA=10;
		int numB=20;
				System.out.println((addNumbers (numA, numB)));
				System.out.println((mutipleNumbers (numA, numB)));
	int product = mutipleNumbers (numA, numB);
	System.out.println ("the product of " + numA + " and "+ numB + " is equal to " + product);
	
	}
	
	
	static void printName() {
		System.out.println("My name is Tim");
	}
		
	static int addNumbers(int numA, int numB) {
		int sum;
		sum =numA+numB;
		return sum;
		
	}
	static int mutipleNumbers(int a, int b) {
		int sum = addNumbers (a,b);
		System.out.println("the sum of " + a + "and " +b +"is equal to "+ sum);
		int product = a*b;
		return product;
		
		
	}
	
}
