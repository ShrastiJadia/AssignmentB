package AssignmentD.question4;

public class StudentDetails {
    String name;
    String branch;
    int yearOfPassing;
    public StudentDetails( String name,String branch,int yearOfPassing) {
    	this.name=name;
    	this.branch=branch;
    	this.yearOfPassing=yearOfPassing;
    	
	}
    public String toString()
    {
		return name+" "+ branch+" "+yearOfPassing;
    	
    }
    
	
}
