package week6rm;

public class MethodOverload {
    class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public void main(String[] args) {
            Calculator calc = new Calculator();

            int sum1 = calc.add(5, 10);
            double sum2 = calc.add(5.5, 10.5);
            int sum3 = calc.add(3, 7, 2);

            System.out.println("Sum1: " + sum1);
            System.out.println("Sum2: " + sum2);
            System.out.println("Sum3: " + sum3);
        }
    }
}
