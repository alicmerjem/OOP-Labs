package week4;

public class getterssetters {
    public class Person {
        private String name;
        private int age;

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
