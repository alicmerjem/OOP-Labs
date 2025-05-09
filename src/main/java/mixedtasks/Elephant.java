package mixedtasks;

public class Elephant extends Animal implements Comparable<Elephant> {
  public Elephant(String name, int age) {
    super(name, age);
  }

  @Override 
  public void speak() {
    System.out.println(name + " the elephant says: Trumpet!");
  }

  @Override 
  public int compareTo(Elephant other) {
    return Integer.compare(this.age, other.age);
  }
}
