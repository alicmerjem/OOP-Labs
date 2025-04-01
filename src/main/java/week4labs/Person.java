package week4labs;

// The Person class should be outside of the task1 class
public class Person {
    // a. Attributes
    private String name;
    private int age;

    // b. Constructor 1: Initializes name, sets age to 0
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor 2: Initializes name and age
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Using setter to prevent invalid age
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters with validation
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    // Increments age by 1
    public void increaseAge() {
        age++;
    }

    // Checks if the person is an adult
    public boolean isAdult() {
        return age >= 18;
    }

    // Overrides toString() for better printing
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Person {
    public static void main(String[] args) {
        // Creating persons using both constructors
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 20);
        Person person3 = new Person("Charlie", 17);

        // Displaying initial details
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        // Check if any of them are adults
        System.out.println(person1.getName() + " is adult? " + person1.isAdult()); // false
        System.out.println(person2.getName() + " is adult? " + person2.isAdult()); // true
        System.out.println(person3.getName() + " is adult? " + person3.isAdult()); // false

        // Increase age and check again
        person3.increaseAge();
        System.out.println(person3.getName() + " is adult now? " + person3.isAdult()); // true
    }
}
