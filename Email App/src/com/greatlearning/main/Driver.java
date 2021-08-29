package com.greatlearning.main;

import java.util.Scanner;

import com.greatelearning.service.CredentialService;
import com.greatlearning.model.*;

public class Driver {
	private static final Scanner sc = new Scanner(System.in);
	
public static void main(String[] args)
{   
	System.out.println("FirstName:");
	String firstName= sc.next();
	
	System.out.println("Lastname:");
	String lastName= sc.next();
	
	System.out.println("1.Please enter your dept");
	System.out.println("2.Technical");
	System.out.println("3.Admin");
	System.out.println("4.HR");
	System.out.println("5.Legal");
	
	int choice = sc.nextInt();
	
	Employee emp;
	
	switch(choice)
	{
	case 1:
		emp = new Employee(firstName,lastName,"Tech");
		break;
		
	case 2:
		emp = new Employee(firstName,lastName,"Admin");
		break;
	case 3:
		emp = new Employee(firstName,lastName,"HR");
		break;
		
	case 4:
		emp = new Employee(firstName,lastName,"Legal");
		break;
		
	default:
		System.out.println( "Incorrect choice" );
	
		return;
		
	}
	
	// generate email
	CredentialService cs = new CredentialService();
	String email = cs.generateEmailAddress(emp);

	
	String password = cs.generatePassword();
	
	
     cs.showCredentials(emp, email, password);

	
}

}
