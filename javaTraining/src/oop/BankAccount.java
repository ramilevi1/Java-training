package oop;

public class BankAccount {
	String accountNumber;
	String routingNumber;
	String name;
	String ssn;
	String accountType;
	
	//constractor definitions 
	//1. used to define or setup or initialize properties of an object.
	//2. are implicitly called upon institiation. 
	//3. the same name as the class iself 
	//4. constractor have no return type at all. 
	BankAccount() {
		System.out.println("new account created");
	}
	
	//overloading call same method name with different argument
	
	BankAccount (String accountType) {
		System.out.println("Account type is "+ accountType);

	}
	
	BankAccount (String accountType, double initDeposit) {
		System.out.println("Account type is "+ accountType + "Initial Deposit of " +initDeposit);

	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() { 
		
	}
	
	void getStatus() {
		
	}
	
	
}
