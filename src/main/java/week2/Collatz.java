package week2;

public class Collatz {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n + " ");

        while (n!=1) {
            if (n%2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.println(n + " ");
        }
    }
}
