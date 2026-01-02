package AssignmentB.question3;

import java.util.Scanner;

public class StudentRecords {

    public static void main(String[] args) {

        StudentService st = new StudentImplement();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("STUDENT RECORD MANAGEMENT");
            System.out.println("1. Add student records");
            System.out.println("2. Remove student by roll number");
            System.out.println("3. Search student by roll number");
            System.out.println("4. Display student records");
            System.out.println("5. Terminate the program");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    st.addStudent();
                    break;

                case 2:
                    System.out.print("Enter roll number to remove: ");
                    st.removeStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    st.searchStudent(sc.nextInt());
                    break;

                case 4:
                    st.displayStudent();
                    break;

                case 5:
                    System.out.println("Program terminated");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
