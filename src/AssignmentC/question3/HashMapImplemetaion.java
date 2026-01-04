package AssignmentC.question3;
import java.util.HashMap;
import java.util.Map;
public class HashMapImplemetaion 
{
	  public static void main(String[] args) 
	  {
       HashMap<Integer, String> map1 = new HashMap<>();
	        map1.put(1, "Java");
	        map1.put(2, "Python");
         System.out.println("Default constructor"+map1);
	        HashMap<Integer, String> map2 = new HashMap<>(10);
	        map2.put(3, "C");
	        map2.put(4, "C++");
        System.out.println("Constructor with initial capacity"+map2);
	        HashMap<Integer, String> map3 = new HashMap<>(5, 0.75f);
	        map3.put(5, "HTML");
	        map3.put(6, "CSS");
	        System.out.println("Constructor with initial capacity and load factor"+map3);
	        HashMap<Integer, String> map4 = new HashMap<>(map1);
	        System.out.println("Map4 (created using another map): " + map4);
           //METHODS
	        map1.put(3, "JavaScript");
	        System.out.println("1. put()"+map1);
	        map1.putIfAbsent(2, "Ruby");
	        System.out.println("2. putIfAbsent()"+map1);
	        System.out.println("3. get() " + map1.get(1));
	        map1.remove(3);
	        System.out.println(" 4. remove()"+map1);
	        
	        System.out.println(" 5. containsKey() " + map1.containsKey(2));
	        System.out.println("6. containsValue() " + map1.containsValue("Java"));
           
	        System.out.println(" 7. size() " + map1.size());
           
	        System.out.println("8. isEmpty()" + map1.isEmpty());
           
	        System.out.println("9. keySet()" + map1.keySet());
	        System.out.println("10. values()" + map1.values());
	        System.out.println("11. entrySet()");
	        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }
	        map1.replace(2, "Spring");
	        System.out.println("12. replace()");
	      
	        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) map1.clone();
	        System.out.println("13. clone()" + clonedMap);
	        map1.forEach((k, v) -> System.out.println("14. forEach()"+k + " -> " + v));
	        map1.clear();
	        System.out.println(" 15.clear(): " + map1);
	    }
	  
	}


