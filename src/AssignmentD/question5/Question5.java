package AssignmentD.question5;

import java.util.ArrayList;
import java.util.Iterator;

public class Question5 {

	public static void main(String[] args) 
	{
           ArrayList<StudentRecords> arrayList=new ArrayList<>();
           arrayList.add(new StudentRecords("Arya", 7,"EC"));
           arrayList.add(new StudentRecords("Mohit", 2,"CSE"));
           arrayList.add(new StudentRecords("Arjun", 1,"EC"));
           arrayList.add(new StudentRecords("Akash", 7,"EC"));
           arrayList.add(new StudentRecords("rohit", 7,"EC"));
           arrayList.add(new StudentRecords("rishi", 5,"civil"));

           for(StudentRecords s:arrayList)
       {
    	   if(s.branch.equalsIgnoreCase("EC") && s.sem==7)
    	   {
        	   System.out.println(s.name+" "+s.sem+" "+s.branch);
    		   
    	   }
    	   
       }
       
	}

}
