package exceptionsfiles;

public class NegativePaymentException extends Exception {
double payment ;
	

	//1.constructor that take the vlaue that would throw the exception
	//2.assign value of local variable class variable
	public NegativePaymentException(double payment) {
	//	System.out.println ("Error : negative payment");
		this.payment = payment;
	}
	//3. overide the tostring method
	public String toString() {
		return "Error: Can not take negative payment " + payment;
	}
}
