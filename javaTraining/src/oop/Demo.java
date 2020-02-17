package oop;

class person {
	
String name;
String email;
String phone;

	void walk () {
		System.out.println(name + "is walking");
	}
	
	void eat() {
		System.out.println(name + "is eating");

	}

	void sleep() {
		System.out.println(name + "is sleeping");

	}

}

public class Demo {
	public static void main (String[] args) {
		person person1 = new person();
		person1.name = "joe";
		person1.email = "test@email.com";
		person1.phone = "45645645674";
		person1.walk();
		
	
	}
}
