package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) throws IOException {
		// this will read a text file and retirev the phone number
		
		String filename = "C:\\SDET University\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		
	
		BufferedReader br = new BufferedReader(new FileReader(file));	
		String nextline = null;
		String phoneNum = br.readLine();
		while (phoneNum!=null) {
		
		//valid phone is 10 digit long
		//area code can not start with 0 or 9
		//can not be 911 in the phone
		try {
			if (phoneNum.length() !=10) {
				throw new TenDigitException(phoneNum);
			}
			if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0,1).equals("9"))) {
				throw new AreaCodeException(phoneNum);
			}
			if (phoneNum.contains("911")) {
				throw new EmergencyException(phoneNum);
			}
		System.out.println(phoneNum + " is a valid phone number");
			
		}	catch (TenDigitException e) {
			System.out.println("Error: phone number " + phoneNum + " is not 10 digit number");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("phone number " + phoneNum +" has invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("phone number " + phoneNum + " contains 911 is not valid");
			System.out.println(e.toString());
		}
		
		phoneNum = br.readLine();

	} 
	}
}

class TenDigitException extends Exception {
	String num;
	TenDigitException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("Ten Digit Exception, phone has " + num.length() + " numbers");
	}
	
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("Area code exception " + num);
	}
}

class EmergencyException extends Exception {
	String num;
	EmergencyException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("911 exception " + num);
	}
	}





