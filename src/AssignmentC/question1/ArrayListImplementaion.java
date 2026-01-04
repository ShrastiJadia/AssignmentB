package AssignmentC.question1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListImplementaion {

    public static void main(String[] args) {

        // CONSTRUCTORS
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Default Constructor: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>(6);
        System.out.println("Constructor with capacity: " + list2);

        ArrayList<Integer> list3 = new ArrayList<>(list1);
        System.out.println("Constructor using collection: " + list3);

        // METHODS
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        System.out.println("1. add(): " + list1);

        System.out.println("2. get(0): " + list1.get(0));

        list1.set(2, 8);
        System.out.println("3. set(2,8): " + list1);

        list1.remove(3);
        System.out.println("4. remove(index): " + list1);

        System.out.println("5. size(): " + list1.size());

        System.out.println("6. isEmpty(): " + list1.isEmpty());

        System.out.println("6. contains(2): " + list1.contains(2));

        System.out.println("7. indexOf(8): " + list1.indexOf(8));

        list1.add(7);
        System.out.println("8. lastIndexOf(7): " + list1.lastIndexOf(7));

        ArrayList<Integer> cloneArrayList = (ArrayList<Integer>) list1.clone();
        System.out.println("9. clone(): " + cloneArrayList);

        Object[] arr = list1.toArray();
        System.out.println("10. toArray(): " + Arrays.toString(arr));

        list1.ensureCapacity(37);
        System.out.println("11. ensureCapacity() executed");

        list1.clear();
        System.out.println("12. clear(): " + list1);
        
        list1.addFirst(19);
        System.out.println("13. addFirst()"+list1);
        
        list1.addLast(10);
        System.out.println("14. addlast()"+ list1);
        list1.reversed();
        System.out.println("15. reverse()"+list1);
    }
}
