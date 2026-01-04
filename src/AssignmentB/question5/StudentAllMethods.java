package AssignmentB.question5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Pattern;

import AssignmentB.question3.Student;

public class StudentAllMethods implements StudentOperations 
{
	Scanner sc=new Scanner(System.in);
	   List<StudentDetails> studentList = new ArrayList<>();
	    Vector<StudentDetails> studentVector = new Vector<>();
	    Stack<Integer> removedIds = new Stack<>();
	    Map<Integer, StudentDetails> studentMap = new HashMap<>();
	    Hashtable<Integer, StudentDetails> studentTable = new Hashtable<>();
	    Set<String> courseSet = new HashSet<>();
	    static final Pattern name1 = Pattern.compile("^[A-Za-z ]+$");

	@Override
	public void addStudent() {
		  try {
	            System.out.print("Enter ID: ");
	            int id = sc.nextInt();

	            if (studentMap.containsKey(id)) {
	                throw new Exception("Duplicate Student ID not allowed");
	            }

	            sc.nextLine();
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            if (!name1.matcher(name).matches()) {
	                throw new Exception("Invalid name format");
	            }

	            System.out.print("Enter Course: ");
	            String course = sc.nextLine();

	            System.out.print("Enter Marks: ");
	            double marks = sc.nextDouble();

	            StudentDetails s = new StudentDetails(name, id, course, marks);

	            studentList.add(s);
	            studentVector.add(s);
	            studentMap.put(id, s);
	            studentTable.put(id, s);
	            courseSet.add(course);

	            System.out.println("Student added successfully");

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            sc.nextLine();
	        }
	    }
		
	

	


	@Override
	public void displayStudents() {
		  if (studentList.isEmpty()) {
	            System.out.println("No students available");
	            return;
	        }
	        studentList.forEach(System.out::println);		
	}



	@Override
	public void removeStudent() {
		  System.out.print("Enter ID to remove: ");
	        int id = sc.nextInt();

	        StudentDetails s = studentMap.remove(id);
	        if (s != null) {
	            studentList.remove(s);
	            studentVector.remove(s);
	            studentTable.remove(id);
	            removedIds.push(id);
	            System.out.println("Student removed");
	        } else {
	            System.out.println("Student not found");
	        }		
	}



	@Override
	public void sortByMarks() {
		studentList.sort(Comparator.comparingDouble(st -> st.marks));
        System.out.println("Students sorted by marks");
        displayStudents();
		
	}






	@Override
	public void searchStudent() {
		System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        StudentDetails s = studentMap.get(id);
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("Student not found");
        }		
	}

}
