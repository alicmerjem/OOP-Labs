public class Lion extends Animal implements Comparable<Lion> {
  public Lion(String name, int age) {
    super(name, age);
  }

  @Override
  public void speak() {
    System.out.println(name + " the Lion says: Roar!");
  }

  @Override 
  public int compareTo(Lion other) {
    return Integer.compare(this.age, other.age);
  }
}
