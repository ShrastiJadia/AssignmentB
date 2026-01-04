package AssignmentB.question5;

public class StudentDetails 
{
    String name;
    int id;
    String course;
    double marks;
     public StudentDetails(String name,int id,String course,double marks) 
     {
    	 this.name=name;
    	 this.course=course;
    	 this.id=id;
    	 this.marks=marks;
    	 
	 }
     public int getId()
     {
   	 return id;
     }
     public String toString()
     {
    	 return "id"+ id+"name"+name+"course"+course+"marks"+marks;
     }
    
}
