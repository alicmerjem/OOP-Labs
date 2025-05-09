public class Main {
  public static void main(String[] args) {
    Product<Double> p1 = new Product<>("Laptop", 1200.00);
    Product<Double> p2 = new Product<>("Tablet", 850.00);

    System.out.println(p1.compareTo(p2));
  }
}
