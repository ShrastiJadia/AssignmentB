package AssignmentC.question2;

import java.util.Vector;

public class VectorImplementation
{

    public static void main(String[] args) 
    {
    	Vector<Integer> v1 = new Vector<>();
        System.out.println("1. Default Constructor: " + v1);
     Vector<Integer> v2 = new Vector<>(5);
        System.out.println("2. Constructor with capacity: " + v2);
        Vector<Integer> v3 = new Vector<>(3, 2);
        System.out.println("3. Constructor with capacity & increment: " + v3);

        Vector<Integer> v4 = new Vector<>(v1);
        System.out.println("4. Constructor using collection: " + v4);

        //  METHODS 

        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(10); 
        System.out.println("1. add(): " + v1);
         v1.addElement(40);
        System.out.println("2. addElement(): " + v1);
        System.out.println("3. get(1): " + v1.get(1));
         v1.set(2, 99);
        System.out.println("4. set(2,99): " + v1);
        v1.remove(3);
        System.out.println("5. remove(index): " + v1);
        v1.removeElement(10);
        System.out.println("6. removeElement(10): " + v1);
        System.out.println("7. size(): " + v1.size());
        System.out.println("8. capacity(): " + v1.capacity());
        System.out.println("9. isEmpty(): " + v1.isEmpty());
        System.out.println("10. contains(20): " + v1.contains(20));
        System.out.println("11. indexOf(99): " + v1.indexOf(99));
        v1.add(20);
        System.out.println("12. lastIndexOf(20): " + v1.lastIndexOf(20));
        System.out.println("13. firstElement(): " + v1.firstElement());
        System.out.println("14. lastElement(): " + v1.lastElement());
        v1.clear();
        System.out.println("15. clear(): " + v1);
        
    }

}
