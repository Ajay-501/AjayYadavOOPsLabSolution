package admin.model;

import java.util.Scanner;

public class New_employee {
	public String firstName,lastName;
	
//	default constructor is created
	public New_employee() {
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter your First Name:");
		firstName = s.nextLine();
//		firstName = firstN;
//		lastName = lastN;
		System.out.print("Please Enter your Last Name:");
		lastName = s.nextLine();
	}
	
//	getter for both 
//	public String get_firstName() {
//		return this.firstName;
//	}
	
//	public String get_lastName() {
//		return this.lastName;
//	}
	
//setter method	for both
//	public void set_firstName(String firstName) {
//		this.firstName = firstName;
//	}
	
//	public void set_lastName(String firstName) {
//		this.firstName = firstName;
//	}
}
