package AssignmentB;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Question2 
{
	public static boolean mobileValidation(String mobile)
	{
		return Pattern.matches("^[6-9]\\d{9}$",mobile);
	}
	public static boolean emailValidation(String email)
	{
		return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email);
	}
	public static boolean userNameValidation(String userName)
	{
		return Pattern.matches("^[a-zA-Z0-9]{5,15}$", userName);
	}
	public static boolean  passWordValidation(String password)
	{
		return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$", password);
	}
	
	
     public static void main(String[] args) throws InvalidInputException
     {
      Scanner scanner=new Scanner(System.in);
      int choice;
     
      while(true)
      {
    	  System.out.println("Regex validation");
    	  System.out.println("1. Enter Mobile Number");
    	  System.out.println("2.Enter Email Id");
    	  System.out.println("3.Enter UserName");
    	  System.out.println("4.Enter password");
    	  System.out.println("5.Exit");
    	  System.out.println("Enter choice");
    	   choice=scanner.nextInt();
    	      scanner.nextLine();

    	   switch (choice) {
		case 1:
			System.out.println("Enter Mobile Number");
		 String mobile=scanner.nextLine();
			if(mobileValidation(mobile))
			{
				System.out.println("mobile number is valid");
			}
			else {
				System.out.println("invalid mobile number");
			}
			break;
		case 2:
			System.out.println("Enter Eamil Id");
		 String email=scanner.nextLine();
			if(emailValidation(email))
			{
				System.out.println("email is valid");
			}
			else {
				System.out.println("invalid email");
			}
			break;
		case 3:
			System.out.println("Enter  Username");
		 String username=scanner.nextLine();
			if(userNameValidation(username))
			{
				System.out.println("username is valid");
			}
			else {
				System.out.println("invalid username");
			}
			break;
		case 4:
			System.out.println("Enter password");
		 String pass=scanner.nextLine();
			if(passWordValidation(pass))
			{
				System.out.println("password is valid");
			}
			else {
				System.out.println("invalid password");
			}
			break;
		case 5:
			System.out.println("Exit");
		System.exit(0);
	
       
		default:
			System.out.println("invalid choice");
		}
    	  
      }
	}

}
class InvalidInputException extends Exception
{
	public InvalidInputException(String message) 
	{
		super(message);
	}
}
