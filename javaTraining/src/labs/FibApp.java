package labs;

public class FibApp {
	public static void main (String[] args) {
		//fibonnaci number is defined by the sum of 2 previous fibonnaci numbers
		//fib(0) = 1
		//fib (1) = 1
		//fib (2) = fib(1) + fib(2)
		//fib (3)= fib(2)+fib(1)
		int n=3; 
		System.out.println ("the finbonaci number of "+n+ " is "+ fib(n));
	}

	public static int fib(int n) {
		if (n==0) {
			return 1;
		}
		else if (n==1) {
			return 1; 
		}
		else return (fib(n-1)+ fib(n-2));
	}		
	
}
