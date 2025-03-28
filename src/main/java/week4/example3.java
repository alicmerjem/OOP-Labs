package week4;
import java.util.*;

public class example3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);

        System.out.println("The numbers in the beginning: ");
        print(numbers);

        remove(numbers, 1);
        remove(numbers, 7);

        System.out.println("The numbers after removal: ");
        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public static void remove(ArrayList<Integer> numbers, int removed) {
        while (numbers.contains(Integer.valueOf(removed))) {
            numbers.remove(Integer.valueOf((removed)));
        }
    }
}
