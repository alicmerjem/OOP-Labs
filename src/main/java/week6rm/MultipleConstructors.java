package week6rm;

public class MultipleConstructors {
    class Car {
        private String model;
        private int year;
        private String engineType;

        // constructor 1 - only model
        public Car(String model) {
            this.model = model;
            this.year = 2022;
        }

        // constructor 2 - model and year
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        // constructor 3 - model, year and engine type
        public Car(String model, int year, String engineType) {
            this.model = model;
            this.year = year;
            this.engineType = engineType;
        }

        // method to display info
        public void displayInfo() {
            System.out.println("Model: " + model + ", Year: " + year + ", Engine type: " + engineType);
        }

        public void main(String[] args) {
            Car car1 = new Car("Tesla");
            Car car2 = new Car("Tesla", 2023);
            Car car3 = new Car("Tesla", 2023, "Electric");

            car1.displayInfo();
            car2.displayInfo();
            car3.displayInfo();
        }
    }
}
