package week4;
import java.util.*;

public class constructor {
    public class Person {
        private String name;
        private int age;

        public Person(String nameAtStart) {
            this.age = 0;
            this.name = nameAtStart;
        }

        public void printPerson() {
            System.out.println(this.name + ", age: " + this.age + " years");
        }
    }
}
