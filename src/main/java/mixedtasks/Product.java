package mixedtasks;

public class Product<T extends Comparable<T>> {
  private String name;
  private T price;

  // constructor
  public Product(String name, T price) {
    this.name = name;
    this.price = price;
  }

  // only getters this time
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // method for comparing price
  public String comparePrice(Product<T> other) {
    int result = this.price.compareTo(other.price);

    if(result > 0) {
      return "mixedtasks.Product " + this.name + " is more expensive than " + other.name;
    } else if (result < 0) {
      return "mixedtasks.Product " + this.name + " is chepaer than " + other.name;
    } else {
      return "mixedtasks.Product " + this.name + " and " + other.name + " have the same price.";
    }
}
