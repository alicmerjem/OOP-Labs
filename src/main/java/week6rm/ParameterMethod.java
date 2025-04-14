package week6rm;

public class ParameterMethod {
    class Car {
        private String model;
        private int year;

        // constructor to initialize the model and year of the car
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        // getter for the model
        public String getModel() {
            return model;
        }

        // getter for the year
        public int getYear() {
            return year;
        }

        // method to compare the year of the two cars
        public boolean isNewerThan(Car otherCar) {
            return this.year > otherCar.getYear();
        }

        public void main(String[] args) {
            // create the two car objects
            Car porsche = new Car("Porsche 718 Spyder", 2017);
            Car ford = new Car("Ford Mustang", 2020);

            // create the comparison
            if(porsche.isNewerThan(ford)) {
                System.out.println(porsche.getModel() + " is newer than " + ford.getModel());
            } else {
                System.out.println(ford.getModel() + " is newer than " + ford.getModel());
            }
        }
    }
}
