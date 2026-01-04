package AssignmentB.question5;
//console-based University Student Management System 

import java.util.Scanner;

public class ConsoleManagement
{
	public static void main(String[] args) {
		
	
	StudentOperations ums = new StudentAllMethods();
    int choice;
    Scanner sc1=new Scanner(System.in);
    do {
        System.out.println("UNIVERSITY STUDENT MANAGEMENT ");
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Remove Student by ID");
        System.out.println("4. Search Student by ID");
        System.out.println("5. Sort Students by Marks");
      
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");

        choice = sc1.nextInt();

        switch (choice) {
            case 1 -> ums.addStudent();
            case 2 -> ums.displayStudents();
            case 3 -> ums.removeStudent();
            case 4 -> ums.searchStudent();
            case 5 -> ums.sortByMarks();
          
            case 6 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice!");
        }
    } while (choice != 6);
    sc1.close();
}

}

