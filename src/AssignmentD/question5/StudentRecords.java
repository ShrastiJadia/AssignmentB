package AssignmentD.question5;

public class StudentRecords
{
     String name;
     int sem;
     String branch;
          public StudentRecords(String name,int sem,String branch) {
        	  this.name=name;
        	  this.sem=sem;
        	  this.branch=branch;
		}     
          public String toString()
          {
        	  return name+""+sem+""+branch;
          }
          
}
