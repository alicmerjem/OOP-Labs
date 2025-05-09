package mixedtasks;

public class MainAnimals {
  public static void main(String[] args) {
    AnimalCage<Lion> lionCage = new AnimalCage<>();

    lioncage.addAnimal(new Lion("Simba", 5));
    lioncage.addAnimal(new Lion("Nala", 3));
    lioncage.addAnimal(new Lion("Mufasa", 8));

    lionCage.sortAnimals();
    lionCage.printAnimals();

    System.out.println();

    AnimalCage<Elephant> elephantCage = new AnimalCage<>();
    elephantCage.addAnimal(new Elephant("Dumbo", 6));
    elephantCage.addAnimal(new Elephant("Ella", 4));

    elephantCage.sortAnimals();
    elephantCage.printAnimals();
  }
}
