package AssignmentB.question4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeMethods implements EmployeService 
{
  TreeMap<Integer,EmployeeDetails  > treeMap=new TreeMap<>();
  HashMap<Integer, EmployeeDetails> hashMap=new HashMap<>();
  Hashtable<Integer, EmployeeDetails> hashtable=new Hashtable<>();
  Scanner scanner=new Scanner(System.in);
  
	@Override
	public void addEmployee() 
	{
      try 
      {
    	  System.out.println("Enter employee Id");
    	  int id=scanner.nextInt();
    	  scanner.nextLine();
    	  System.out.println("Enter employee name");
    	  String name=scanner.nextLine().trim();
    	  if(!name.matches("[A-Za-z]+"))
    	  {
    		  throw new IllegalArgumentException("Name must contain alphabet only");
    	  }
    	  
    	  System.out.println("Enter employee age");
    	  int age=scanner.nextInt();
    	  scanner.nextLine();
    	  System.out.println("Enter employe job role");
    	  String jobRole=scanner.nextLine().trim();
    	  EmployeeDetails emp=new EmployeeDetails(name, id, age, jobRole);
    	  hashMap.put(id, emp);
    	  hashtable.put(id, emp);
       treeMap.put(id, emp);
       System.out.println("Employee data added successfully");
      } catch (Exception e) {
         System.out.println("error"+e.getMessage());
      }
	}

	public void displayAllEmployee() 
	{
     if(hashMap.isEmpty())
     {
    	 System.out.println("no employee record is found");
    	 return;
     }
     System.out.println("Display records by using hashmap");
     System.out.println(hashMap);
     System.out.println("Display records by using hashtable");
     System.out.println(hashtable);
     System.out.println("Display records by using treemap");
     System.out.println(treeMap);
	}


	
	@Override
	public void searchEmployeById(int empId) 
	{
		EmployeeDetails emp= hashMap.get(empId);
		if(emp!=null)
		{
			System.out.println("Employe is found"+emp);
		}
		else {
			System.out.println("not found");
		}
	}

	@Override
	public void removeEmployeeById(int empId) 
	{
		if(hashMap.containsKey(empId))
		{
			 hashMap.remove(empId);
	            hashtable.remove(empId);
	            treeMap.remove(empId);
	            System.out.println("Employee removed successfully");
	        } else {
	            System.out.println("Employee not found");
	        }
		}
	

	@Override
	public void demonstrateNullSupport()
	{
		System.out.println("null support demonstration");
		hashMap.put(null, null);
		System.out.println("hashMap can contain null");
	try {
		hashtable.put(null, null);
		
	}catch(Exception e){
		System.out.println("Hashtable can not contain null value/key");
		
		
	}
	try {
		treeMap.put(null, null);
		
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Treemap can not contain null key");
	}
	}
}
