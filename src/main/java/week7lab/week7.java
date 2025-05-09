package week7lab;

// ABSTRACT CLASS: mixedtasks.week7lab.Animal
abstract class Animal {
    protected String name; // Field: name of the animal

    public Animal(String name) { // Constructor to initialize name
        this.name = name;
    }

    public abstract void makeSound(); // Abstract method to be implemented by subclasses

    public String getName() { // Concrete method that returns the animal's name
        return this.name;
    }
}

// SUBCLASS: week7lab.Dog
class Dog extends mixedtasks.Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

// SUBCLASS: week7lab.Cat
class Cat extends mixedtasks.Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void purr() {
        System.out.println(name + " is purring.");
    }
}

// INTERFACE: week7lab.Playable
interface Playable {
    void play(); // Method to be implemented
    String getBrand(); // Added brand method
}

// CLASS: week7lab.Guitar
class Guitar implements Playable {
    private String brand;

    public Guitar(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Strumming the guitar!");
    }

    public String getBrand() {
        return brand;
    }
}

// CLASS: week7lab.Piano
class Piano implements Playable {
    private String brand;

    public Piano(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Playing the piano!");
    }

    public String getBrand() {
        return brand;
    }
}

// CLASS: week7lab.Drum
class Drum implements Playable {
    private String brand;

    public Drum(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Beating the drums!");
    }

    public String getBrand() {
        return brand;
    }
}

// ABSTRACT CLASS: week7lab.Shape
abstract class Shape {
    protected String color; // Field: color of the shape

    public Shape(String color) { // Constructor to initialize color
        this.color = color;
    }

    public abstract double getArea(); // Abstract method for calculating area

    public String getColor() { // Concrete method to return color
        return color;
    }
}

// SUBCLASS: week7lab.Circle
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// SUBCLASS: week7lab.Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

// ABSTRACT CLASS: week7lab.Employee
abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus(); // Abstract method

    public String getDetails() { // Concrete method
        return "Name: " + name + ", Salary: " + salary;
    }
}

// INTERFACE: week7lab.Reportable
interface Reportable {
    String generateReport(); // Method to be implemented
}

// SUBCLASS: week7lab.Developer
class Developer extends Employee implements Reportable {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateBonus() {
        return salary * 0.2; // 20% bonus
    }

    public String generateReport() {
        return "week7lab.Developer Report - " + getDetails() + ", Language: " + programmingLanguage + ", Bonus: " + calculateBonus();
    }
}

// SUBCLASS: week7lab.Manager
class Manager extends Employee implements Reportable {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public double calculateBonus() {
        return salary * 0.3; // 30% bonus
    }

    public String generateReport() {
        return "week7lab.Manager Report - " + getDetails() + ", Team Size: " + teamSize + ", Bonus: " + calculateBonus();
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        // TASK: Working with mixedtasks.week7lab.Animal
        System.out.println("=== Animals ===");
        ArrayList<mixedtasks.Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Whiskers"));

        for (mixedtasks.Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            animal.makeSound();

            // instanceof to call specific methods
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).purr();
            }
        }

        // TASK: Working with week7lab.Playable interface
        System.out.println("\n=== Instruments ===");
        Playable[] instruments = {
            new Guitar("Fender"),
            new Piano("Yamaha"),
            new Drum("Pearl")
        };

        for (Playable instrument : instruments) {
            instrument.play();
            System.out.println("Brand: " + instrument.getBrand());
        }

        // TASK: Working with week7lab.Shape
        System.out.println("\n=== Shapes ===");
        Shape[] shapes = {
            new Circle("Red", 3),
            new Rectangle("Blue", 4, 5)
        };

        for (Shape shape : shapes) {
            System.out.println("Color: " + shape.getColor() + ", Area: " + shape.getArea());
        }

        // TASK: Working with week7lab.Employee and week7lab.Reportable
        System.out.println("\n=== Employees ===");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Alice", 5000, "Java"));
        employees.add(new Manager("Bob", 6000, 5));

        for (Employee emp : employees) {
            System.out.println(((Reportable) emp).generateReport());
            System.out.println("Bonus: " + emp.calculateBonus());
        }
    }
}
