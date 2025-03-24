package week4;

public class example1 {
    public static void main(String[] args) {
        int number = 1;
        number = addThreeAndReturn(number);
        System.out.println(number);  // prints 4, because number has the return value
    }
    public static int addThreeAndReturn(int number) {
        number = number + 3;
        return number;
    }

}
