import java.util.*;

public class AnimalCage<T extends Animal & Comparable<T>> {
  private List<T> animals = new ArrayList<>();

  public void addAnimal(T animal) {
    animals.add(animal);
  }

  public void sortAnimals() {
    Collections.sort(animals);
  }

  public void printAnimlas() {
    for (T animal : animals) {
      System.out.println(animal.getName() + animal.getAge());
      animal.speak();
    }
  }
}
