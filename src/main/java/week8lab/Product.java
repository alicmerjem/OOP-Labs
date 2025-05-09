package week8lab;

public class Product<T extends Comparable<T>>{
    private String name;
    private T price;

    // constructors
    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    // just the getters this time
    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    // add comparePrice method
    public String comparePrice(Product<T> other) {
        int result = this.price.compareTo(other.price);

        if(result > 0) {
            return "mixedtasks.Product " + this.name + " is more expensive than " + other.name;
        } else if (result < 0) {
            return "mixedtasks.Product " + this.name + " is cheaper than " + other.name;
        } else {
            return "mixedtasks.Product " + this.name + " and " + other.name + " have the same price.";
        }
    }
}
