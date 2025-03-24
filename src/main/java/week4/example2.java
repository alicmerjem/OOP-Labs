package week4;
import java.util.*;

public class example2 {
    public static void removeFirst(ArrayList<Integer> list) {
        list.remove(0); // removes the number from index 0
    }

    public static void listOperations() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);

        System.out.println(numbers); // prints [4, 3, 7 ,3]

        removeFirst(numbers);

        System.out.println(numbers); // prints [3, 7, 3]
    }
}
