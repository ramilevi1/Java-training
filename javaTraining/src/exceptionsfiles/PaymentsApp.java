package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {
//take a payment from user
	public static void main(String[] args) {
		boolean positivePayment = true;
		double payment = 0;
		
		do {
		//1. ask user for input
		System.out.print ("Enter the payment amount: ");
		//2. get the amount and test the value
		Scanner in = new Scanner(System.in);
		//3. handle exception appropriately 

		try {
		payment = in.nextDouble();
		if (payment<0) {
			throw new NegativePaymentException(payment);
		}
		else positivePayment = true; 
		}
		catch (NegativePaymentException e) {
			System.out.println(e.toString());
			positivePayment = false; 
		}
	
	} while (!positivePayment);

		//4.print confirmation. 
		System.out.println("Thank you for your payment of $ "+payment);
	
	}
}
