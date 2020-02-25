package labs;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {
	 static double  balance = 0;

    public static void main(String[] args) {

        String csvFile = "C:\\SDET University\\Files\\creditCardStatement.txt";
        List<String[]> transactions = new ArrayList<String[]>();
        BufferedReader br = null;
        String cvsSplitBy = ",";
        String datarow;
        
        customerOfBank cust = new customerOfBank("rami", "levi", "rami@testmail.com", "653453453");  
        BankAccounting acc1 = new BankAccounting(cust, 1000);
 
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((datarow = br.readLine()) != null) {

                // use comma as separator
            	String[] line  = datarow.split(cvsSplitBy);
              // 	System.out.println(line[0]+" "+ line[1]+" "+line[2] + " "+ line[3]);
               	transactions.add(line);
                       }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }  
        System.out.println("*************************************");
        System.out.println("Automatic Credit card statement");
        System.out.println("*************************************");


        for (String[] transaction: transactions) {
        	//for (String field: transaction ) {
        	//	System.out.print(field+ " ");
        	String data = transaction[0];
        	String action = transaction[1];
        	String bizName = transaction[2];
        	Double amount = Double.parseDouble(transaction[3]);
        	System.out.print(data + " "+action+ " "+ bizName + " "+ amount+" : ");
        if (action.equalsIgnoreCase("credit")) {
        	creditAccount(amount);
        }
        	else if (action.equalsIgnoreCase("debit")) {
        	chargeAccount(amount);
        	}
				else if (action.equalsIgnoreCase("fee")) {
			applyFee(amount);
				}

        }
        
        acc1.makeDeposit(10);
        acc1.withdraw(200);
        acc1.transferMoney(100, "23423423");
        acc1.accure();
        System.out.println(acc1.toString(cust));
//       System.out.println(transactions.get(0)[0]);
 //      System.out.println(transactions.get(0)[1]);
 //       System.out.println(transactions.get(0)[2]);
 //       System.out.println(transactions.get(0)[3]);
 }

    public static void creditAccount(double amount) {
    	balance = balance + amount;
       	System.out.printf("current balance "+"%.2f",balance);
       	System.out.println();
    }    
        
    public static void chargeAccount(double amount) {
    	balance = balance - amount;
       	System.out.printf("current balance "+"%.2f",balance);
       	System.out.println();
   	
    }    

    public static void applyFee(double amount) {
    	balance = balance-((balance*amount)/100);
       	System.out.printf("current balance "+"%.2f",balance);
       	System.out.println();
    }
}
   
class customerOfBank {
	String name;
	String lastName;
	String email;
	String phone;
	public String ssn;

	public customerOfBank(String name, String lastName, String email, String ssn) {
    	this.name = name;
    	this.lastName = lastName;
    	this.email = email;
    	this.ssn = ssn;
    //	this.phone=phone;
    	System.out.println("new customer created " + name);
    }
}

class BankAccounting implements IInterest {
	//properties 
		private static int id = 1000; 				// internal branch id
		private String accountNumber;  				//id+random 2 digit number + 2 first SSN
		private static final String rountingNumber = "006594093";
//		private String name;
		private String ssn;
	


		//constructor
		public BankAccounting(customerOfBank newCustomer ,double initDeposit) {
			Lab4.balance = initDeposit;
			this.ssn = newCustomer.ssn;
//			this.name = newCustomer.name;
			System.out.printf("new account created with initial balance of : " +"%.2f",Lab4.balance);
			System.out.println();
					//	System.out.println(ssn);
			id++;
			setAccountNumber();
		}
		
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
					accountNumber = id + "" + random + ssn.substring(0,2); 
					System.out.println("your account number : " +accountNumber);
		}
		
//		public String getName() {
//			return name;
//		}

		
//		public getname(newCustomer) {
//			this.name = name;
//		}
		
		public void withdraw(int amount) {
			Lab4.balance = Lab4.balance - amount;	
			System.out.println( "withdraw from ATM of " + amount);
			showBalance ();
		}
		
		public void makeDeposit (double amount) {
			Lab4.balance = Lab4.balance + amount;
			System.out.println( "making cheque deposit of of " + amount);
			showBalance ();

		}
		
		public void transferMoney (double amount, String accountNum) {
			Lab4.balance = Lab4.balance - amount;
			System.out.println( "transfer to account number: "+accountNum+", $" + amount );
			showBalance ();

		}
		
		public void showBalance () {
			
			System.out.println("your current balance " +  Math.floor(Lab4.balance));
		}
		

		public void getAccountNumber() {
		System.out.println("account number "+accountNumber);
		}
		
		
		public void accure() {
			if (Lab4.balance <0) {
				Lab4.balance = Lab4.balance * (1+ negativeRate/100);
				System.out.println ("adding interest rate of " + negativeRate);
				showBalance();


			} else {
			Lab4.balance = Lab4.balance * (1+ positiveRate/100);
			System.out.println ("adding interest rate of " + positiveRate);
			showBalance();
			}
		}

		 
		public String toString(customerOfBank newCustomer ) {
			return "******************************\n"+ 
		"[Name: " + newCustomer.name + " ]\n"+ 
		"[Account number : " + accountNumber + "]\n" +
		"[rounting number : "+rountingNumber +"]\n" + 
		"[balance " + Math.floor(Lab4.balance) + "]\n" 
		+"******************************\n" ;
		}

		@Override
		public String toString(customer newCustomer) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}


