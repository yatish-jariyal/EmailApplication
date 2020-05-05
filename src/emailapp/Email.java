package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int emailBoxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	//Constructor to receive first and last name.
	
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " +this.firstName +" " +this.lastName);
		
		//Call a method asking for department -> return department.
		this.department = setDepartment();
		System.out.println("Department: " +this.department);
		
		//Call a method that return a random password.
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " +this.password);
		
		//Combine elements to generate email.
		
	}
	
	//Ask for department.
	private String setDepartment()
	{
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
		
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1)
		{
			return "sales";
		}
		else if(depChoice == 2)
		{
			return "dev";
		}
		else if(depChoice == 3)
		{
			return "acct";
		}
		else
		{
			return "";
		}
	}
	//Generate random password.
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++)
		{
			int rand = (int)(Math.random() * passwordSet.length()); //generate a random number and set it to rand.
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	//Set mailbox capacity.
	
	//Set alternate email.
	
	//Change password.
}	
