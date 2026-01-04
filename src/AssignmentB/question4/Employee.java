package AssignmentB.question4;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) 
	{
      EmployeService refEmployeeMethods=new EmployeeMethods();
      Scanner sc=new Scanner(System.in);
      int choice;
      while(true)
      {
    	  System.out.println("Employee Management");
    	  System.out.println("1. Add employee records");
    	  System.out.println("2. Display all employee records");
	  System.out.println("3. Search employee by employeeID");
      System.out.println("4. Remove employee by employeeID");
      System.out.println("5. Demonstrate null support");
      System.out.println("6. exit");
    System.out.println("Enter the the operation you want to perform");
    choice=sc.nextInt();
    switch (choice) {
	case 1:
		refEmployeeMethods.addEmployee();
		
		break;
	case 2:
		refEmployeeMethods.displayAllEmployee();
		break;
	case 3:
		System.out.println("Enter employe id");
		int id=sc.nextInt();
		refEmployeeMethods.searchEmployeById(id);
		break;
	case 4:
		System.out.println("Enter employee id");
		int id1=sc.nextInt();
		refEmployeeMethods.removeEmployeeById(id1);
		break;
	case 5:
		refEmployeeMethods.demonstrateNullSupport();
		break;
	case 6:
		System.out.println("Program terminate");
		System.exit(0);
	default:
      System.out.println("invalid choice");	
      }
      }  
	
	}

}
