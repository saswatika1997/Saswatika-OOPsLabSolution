package com.greatelearning.service;

import java.util.Random;

import com.greatelearning.service.*;
import com.greatlearning.model.*;

public class CredentialService {
	
public String generateEmailAddress(Employee emp)
{


	return emp.getFirstName().toLowerCase() + emp.getLastName() +"." + emp.getDepartment().toLowerCase() + "@abc.com";

	
}

public String generatePassword() {
	Random random = new Random();
	
	// generate a random password of length 8 characters
	String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$*()?.=+^&*<>";
	
	char[] password = new char[8];
	
	for( int i = 0; i < 8; i++ ) {
		int idx = random.nextInt( allowedChars.length() ); // generates an integer between 0 - length of allowedChars string
		password[i] = allowedChars.charAt( idx );
	}
	
	return new String( password );
}


public void showCredentials(Employee emp,String email,String password)
{
	System.out.println( email );
	System.out.println( password );
	System.out.println( "Your Email is:"+email+" and your password is"+password);
}

}
