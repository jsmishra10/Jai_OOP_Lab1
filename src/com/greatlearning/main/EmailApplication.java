package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

public class EmailApplication {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Jai", "Mishra");	
		Scanner scan = new Scanner(System.in);
		
		displayMenu(employee, scan);			
				
		CredentialService cs = new CredentialService();
		cs.showCredentials(employee);		
		scan.close();
		

	}
	
	public static void displayMenu(Employee employee, Scanner scan) {
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");	
		int choice;
		String dept;	
		
		if (scan.hasNextInt())
		    choice = scan.nextInt();
		else
			choice = 0;
		//scan.close();
		
		switch (choice) {

		case 1:
			dept = "tech";
			employee.setDepartment(dept);
			break;
		case 2:
			dept = "admin";
			employee.setDepartment(dept);
			break;
		case 3:
			dept = "hr";
			employee.setDepartment(dept);
			break;
		case 4:
			dept = "legal";
			employee.setDepartment(dept);
			break;
		default:
			System.out.println("Invalid Department Choice.");
			displayMenu(employee, scan);
			break;
			
		}
		
		
	}

}
