package AssignmentD.question4;

import java.util.ArrayList;
import java.util.Iterator;

public class Question4 {

	public static void main(String[] args) {
                 ArrayList<StudentDetails> arr=new ArrayList<>();
                 arr.add(new StudentDetails("Shrasti", "CSE", 2024));
                 arr.add(new StudentDetails("Amit", "Civil", 2024));

                 arr.add(new StudentDetails("Shree", "Civil", 2024));
                 arr.add(new StudentDetails("Ram", "CSE", 2021));
                 arr.add(new StudentDetails("Kishan", "EC", 2201));
               Iterator<StudentDetails> it=arr.iterator();
               while(it.hasNext())
               {
            	   StudentDetails student=it.next();
            	   if(student.yearOfPassing==2024 &&  student.branch.equalsIgnoreCase("Civil"))
            	   {
            		   it.remove();
            	   }
               }
  System.out.println("Remaining student");
  for(StudentDetails s:arr)
  {
	  System.out.println(s.name+" "+" "+s.branch+" "+s.yearOfPassing);
  }
	}

}
