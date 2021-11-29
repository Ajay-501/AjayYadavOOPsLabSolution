package admin.main;

import java.util.Scanner;

import admin.model.New_employee;
import admin.services.IT_support;

public class Driver {
	
	static IT_support it_service = new IT_support();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		New_employee employee = new New_employee();
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("Please select the department from the following");
			System.out.println("1:Technical");
			System.out.println("2:Admin");
			System.out.println("3:Human Resource");
			System.out.println("4:Legal");
			Scanner userOption = new Scanner(System.in);
			int userSelect = userOption.nextInt();
			
			if ((userSelect > 0) && (userSelect < 5)) {
				switch(userSelect) {
				case 1: 
					System.out.println("Dear " + employee.firstName + " " + employee.lastName+ " " + "your generated credentials are as follows:");
					it_service.showCredentials("Tech");
					break;
				case 2: 
					System.out.println("Dear " + employee.firstName + " " + employee.lastName + " " + "your generated credentials are as follows:");
					it_service.showCredentials("Admin");
					break;
				case 3: 
					System.out.println("Dear " + employee.firstName + " " + employee.lastName + " " + "your generated credentials are as follows:");
					it_service.showCredentials("HR");
					break;
				case 4: 
					System.out.println("Dear " + employee.firstName + " " + employee.lastName + " " + "your generated credentials are as follows:");
					it_service.showCredentials("Legel");
					break;
				}	
			}
			else {
				System.out.println("Select proper department ranging from 1-4");
			}
			
		}
	
	}

}
