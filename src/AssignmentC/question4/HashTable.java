package AssignmentC.question4;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
public class HashTable 
{
	    public static void main(String[] args) {

	        // Constructors  
	        Hashtable<Integer, String> ht1 = new Hashtable<>();
	        System.out.println("1.default constructor");
           Hashtable<Integer, String> ht2 = new Hashtable<>(10);
          System.out.println("2. Constructor with initial capacity"+ht2);
          
	        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
	        System.out.println(" Constructor with initial capacity & load factor"+ht3);

	        Hashtable<Integer, String> tempMap = new Hashtable<>();
	        tempMap.put(1, "Java");
	        tempMap.put(2, "Python");
	        System.out.println("4. Constructor using another Map"+tempMap);
	        //methods
	        Hashtable<Integer, String> ht4 = new Hashtable<>(tempMap);
	        ht1.put(101, "Apple");
	        ht1.put(102, "Banana");
	        ht1.put(103, "Cherry");
            System.out.println("1. add()"+ht4);
	        System.out.println("2. Size() " + ht1.size());
	        System.out.println("3. Empty()" + ht1.isEmpty());
	        System.out.println("4. get() " + ht1.get(102));
	        System.out.println("5. containskey() " + ht1.containsKey(101));
	        System.out.println("6. containsValue() " + ht1.containsValue("Banana"));
	        ht1.remove(103);
	        System.out.println("7. remove() " + ht1);
	        ht1.replace(102, "Blueberry");
	        System.out.println("8. replace() " + ht1);
	        ht1.putIfAbsent(104, "Date");
	        System.out.println("9. putIfAbsent: " + ht1);
	        Set<Integer> keys = ht1.keySet();
	        System.out.println("10. Keys() " + keys);
	        Collection<String> values = ht1.values();
	        System.out.println("11. values() " + values);
	        Set<Map.Entry<Integer, String>> entries = ht1.entrySet();
	        System.out.println("12. Entrie set" + entries);
	        ht2.put(1, "A");
	        ht2.put(2, "B");
	        ht2.clear();
	        System.out.println("13. replace() " + ht2);
	        Hashtable<Integer, String> cloned = (Hashtable<Integer, String>) ht1.clone();
	        System.out.println("14. clone() " + cloned);
	        System.out.println("15. equals()" + ht1.equals(cloned));

	       
	    }
	}


