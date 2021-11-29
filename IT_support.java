package admin.services;

import java.util.Random;

import admin.model.New_employee;

public class IT_support {
	
	static New_employee emp = new New_employee();
	
	public String generatePassword() {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi" 
						+"jklmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(8);
		for (int i = 0; i < 8; i++) {
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		}
			
		return sb.toString();
	}
	
	public String generateEmailAddress(String userSelect) {
//		firstNamelastName@department.company.com
		
		return (emp.firstName.toLowerCase()+ emp.lastName.toLowerCase()+"@" + userSelect.toLowerCase() + ".company" + ".com");
	}
	
	public void showCredentials(String userSelect) {
		System.out.println("EMAIL ADDRESS ------>" + generateEmailAddress(userSelect));
		System.out.println("PASSWORD ------>" + generatePassword());
	}
}
