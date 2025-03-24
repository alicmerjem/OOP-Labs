package week2;

public class Task2 {
    public static void main(String[] args) {
        int number = 987;
        while(number > 10) {
            number = sumDigits(number);
        }

        System.out.println("Result " + number);
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
