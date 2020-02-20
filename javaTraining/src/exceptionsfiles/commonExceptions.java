package exceptionsfiles;

public class commonExceptions {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
	//1. indentify potential problem area
	//2. suround with try-catch block
		
		try {
		 int c=a/b;
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
			System.out.println(e.toString());
		}
	
		String[] state = {"CA", "TX", "FL", "NY"};
		for (int i=0; i<=state.length; i++) {
			try {
			System.out.println(state[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error index out of bound");
				System.out.println (e.toString());
			}
		}
		System.out.println("program is closing");
	}
	

	
	
}
