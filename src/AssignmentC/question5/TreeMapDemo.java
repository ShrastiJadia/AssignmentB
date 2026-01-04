package AssignmentC.question5;
import java.util.*;

public class TreeMapDemo 
{
     public static void main(String[] args) {
    	 //Constructors 
	        TreeMap<Integer, String> tm1 = new TreeMap<>();
        System.out.println("Default Constructor"+tm1);
	        
	        TreeMap<Integer, String> tm2 =
	                new TreeMap<>(Collections.reverseOrder());
	        System.out.println("Constructor with Comparator (Descending order)"+tm2);
	        Map<Integer, String> map = new HashMap<>();
	        map.put(3, "C");
	        map.put(1, "A");
	        System.out.println("constructor"+map);
	        TreeMap<Integer, String> tm3 = new TreeMap<>(map);
            System.out.println(""+tm3);
	        SortedMap<Integer, String> sm = new TreeMap<>();
	        sm.put(10, "Ten");
	        sm.put(20, "Twenty");
	        System.out.println("constructor with sorted map"+sm);
	        TreeMap<Integer, String> tm4 = new TreeMap<>(sm);
	        tm1.put(101, "Apple");
	        tm1.put(103, "Cherry");
	        tm1.put(102, "Banana");
      System.out.println("1. put()"+tm4);
	        System.out.println("2. size()" + tm1.size());
	        System.out.println("3. isEmpty() " + tm1.isEmpty());
	        System.out.println("4. get() " + tm1.get(102));
	        System.out.println("5. containskey() " + tm1.containsKey(101));
            System.out.println("6. containsValue() " +
	                tm1.containsValue("Banana"));
	        tm1.remove(103);
	        System.out.println("7. remove() " + tm1);
	        tm1.replace(102, "Blueberry");
	        System.out.println("8. replace() " + tm1);
	        tm1.putIfAbsent(104, "Date");
	        System.out.println("9. putIfAbsent() " + tm1);
	        System.out.println(" 10. firstkey() " + tm1.firstKey());
	        System.out.println("11. lastkey() " + tm1.lastKey());
	        System.out.println("12. HeadMap() " +
	                tm1.headMap(102));
	        System.out.println("13. TailMap()" +
	                tm1.tailMap(102));
	        System.out.println("14. SubMap () " +
	                tm1.subMap(101, 104));
	        System.out.println("15. keyset() " + tm1.keySet());
	        
     
     }
	}

	

