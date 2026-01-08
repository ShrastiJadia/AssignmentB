package AssignmentD.question3;

import java.util.ArrayList;


public class Question3 {
    public static void main(String[] args) {

        ArrayList<StudentsDetails> students = new ArrayList<>();

        students.add(new StudentsDetails("Amit", "CSE", 75));
        students.add(new StudentsDetails("Shrasti", "CSE", 80));
        students.add(new StudentsDetails("Tiya", "CSE", 75));
        students.add(new StudentsDetails("Ram", "EC", 95));

        System.out.println("Before Increase");
        for (StudentsDetails s : students) {
            s.display();
        }

        for (StudentsDetails s : students) {
            s.increasePercentageForCSE();
        }

        System.out.println("\nAfter Increase");
        for (StudentsDetails s : students) {
            s.display();
        }
    }
}
