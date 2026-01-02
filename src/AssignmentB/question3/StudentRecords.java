package AssignmentB.question3;

import java.util.Scanner;

public class StudentRecords {

	public static void main(String[] args) 
	{
    StudentService st=new StudentImplement();
    Scanner sc=new Scanner(System.in);
    int choice;
    try {
    while(true)
    {
		System.out.println("STUDENT RECORD MANAGEMENT");
		System.out.println("1. add student records ");
		System.out.println("2. remove student by their roll number");
		System.out.println("3. search student by their roll number");
		System.out.println("4. Display records of student");
		System.out.println("5. Terminate the program");
		System.out.println("enter the operation you want to done");
		choice=sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("add student records");
			st.addStudent();
			break;
		}
		case 2:
		{
			System.out.println(" remove student by their roll number");
			int removeroll=sc.nextInt();
			st.removeStudent(removeroll);
			break;
		}
		case 3:
		{
			System.out.println("search student by their roll number");
			int search=sc.nextInt();
			st.searchStudent(search);
			break;
		}
		case 4:
		{
			System.out.println("display student records");
			st.displayStudent();
			break;
			
		}
		case 5:
		{
			System.exit(0);
			break;
		}
		default:
			System.out.println("invalid choice");
		}
    }
    }catch (Exception e) {
  System.out.println("error is "+e.getMessage());
    }
    }
	}


