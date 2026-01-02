package AssignmentB.question4;

public class EmployeeDetails 
{
   String name;
   int empId;
   int age;
   String jobRoleEmp;
   public EmployeeDetails(String name,int empId,int age,String jobRoleEmp) 
   {
	   this.name=name;
	   this.empId=empId;
	   this.age=age;
	   this.jobRoleEmp=jobRoleEmp;
}
   public int getEmpId()
   {
	   return empId;
   }
   public String toString() {
       return "EmpId=" + empId +
              ", Name=" + name +
              ", Age=" + age +
              ", JobRole=" + jobRoleEmp;
   }
   
}
