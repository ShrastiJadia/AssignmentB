package AssignmentB.question3;

import java.util.*;

public class StudentImplement implements StudentService {

    List<Student> list = new ArrayList<>();
    Vector<Student> vector = new Vector<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        try {
            System.out.println("Enter rollnumber");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name");
            String name = sc.nextLine().trim();

            if (!name.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Name must contain alphabets only");
            }

            System.out.println("Enter age");
            int age = sc.nextInt();

            Student student = new Student(roll, name, age);
            list.add(student);
            vector.add(student);

            System.out.println("Student data added successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void displayStudent() {
        if (list.isEmpty()) {
            System.out.println("No student record found");
            return;
        }

        System.out.println("Student Records:");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void removeStudent(int rollNo) {
        boolean found = false;

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student student = it.next();

            if (student.getRollNo() == rollNo) {   // ✅ FIX
                it.remove();
                vector.remove(student);
                found = true;
                System.out.println("Student removed successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }

    @Override
    public void searchStudent(int rollNo) {
        boolean found = false;

        for (Student student : list) {
            if (student.getRollNo() == rollNo) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }
}
