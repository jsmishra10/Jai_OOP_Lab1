package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddress(Employee employee) {
		
		String emailAddress = employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartment() + ".greatlearning.com";
		
		return emailAddress;
	}

	@Override
	public String generatePassword() {
		
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String largeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialChars = "@|/-$%*&";
		
		Random random = new Random();
		
		char char1 = smallChars.charAt(random.nextInt(smallChars.length()));
		char char2 = smallChars.charAt(random.nextInt(smallChars.length()));
		char CHAR1 = largeChars.charAt(random.nextInt(largeChars.length()));
		char CHAR2 = largeChars.charAt(random.nextInt(largeChars.length()));
		int num1 = random.nextInt(10);
		int num2 = random.nextInt(10);
		int num3 = random.nextInt(10);		
		char spec = specialChars.charAt(random.nextInt(specialChars.length()));
		
		String password = String.valueOf(CHAR1) + String.valueOf(CHAR2) + String.valueOf(char1) + String.valueOf(char2)
		                  + String.valueOf(spec) + String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3);
		
		
		
		
		return password;
	}

	@Override
	public void showCredentials(Employee employee) {
		
		System.out.println("Dear " + employee.getFirstName() + " your credentails are as follows");
		System.out.println("Email ---->  " + generateEmailAddress(employee));
		System.out.println("Password -----> " + generatePassword());
		
		
	}
	
	
	
	
	

}
