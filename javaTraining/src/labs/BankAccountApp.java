package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		customer newCustomer = new customer("Rami", "34234234");
		BankAccount acc1 = new BankAccount(newCustomer, 5000);
		//acc1.SetName("Rami");
			
		
	//	System.out.println("Account holder name : " + acc1.getName());
		//acc1.getAccountNumber();
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.withdraw(10000);
		acc1.accure();
		acc1.showBalance();
		System.out.println(acc1.toString(newCustomer));
	}
}

 class customer {
	String name;
//	String account;
	String ssn;
	public customer (String name , String ssn)
	{
		this.ssn = ssn;
		this.name = name;
		System.out.println("customer name : "+ name);
	}
	
	public String getName() {
		return name; 
	}
	
	public String getssn() {
		return ssn; 
	}
}


class BankAccount implements IInterest {
//properties 
	private static int id = 1000; 				// internal branch id
	private String accountNumber;  				//id+random 2 digit number + 2 first SSN
	private static final String rountingNumber = "006594093";
//	private String name;
	private String ssn;
	private double balance;

	//constructor
	public BankAccount(customer newCustomer ,double initDeposit) {
		balance = initDeposit;
		this.ssn = newCustomer.ssn;
//		this.name = newCustomer.name;
		System.out.println("new account created with initial balance of : " + balance + " " + newCustomer.ssn);
				//	System.out.println(ssn);
		id++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
				accountNumber = id + "" + random + ssn.substring(0,2); 
				System.out.println("your account number : " +accountNumber);
	}
	
//	public String getName() {
//		return name;
//	}

	
//	public getname(newCustomer) {
//		this.name = name;
//	}
	
	public void withdraw(int amount) {
		balance = balance - amount;	
		System.out.println( "withdraw of " + amount);
		showBalance ();
	}
	
	public void makeDeposit (double amount) {
		balance = balance + amount;
		System.out.println( "making deposit of of " + amount);
		showBalance ();

	}
	
	public void showBalance () {
		
		System.out.println("your current balance " +  Math.floor(balance));
	}
	

	public void getAccountNumber() {
		System.out.println("account number "+accountNumber);
	}
	
	
	public void accure() {
		
		if (Lab4.balance >0) {
			
		}
		balance = balance * (1+ positiveRate/100);
		System.out.println ("adding interest rate of " + positiveRate);
		
	}

	@Override 
	public String toString(customer newCustomer ) {
		return "******************************\n"+ 
	"[Name: " + newCustomer.name + " ]\n"+ 
	"[Account number : " + accountNumber + "]\n" +
	"[rounting number : "+rountingNumber +"]\n" + 
	"[balance " + Math.floor(balance) + "]\n" 
	+"******************************\n" ;
	}
	
}