package week6rm;

public class ObjectReference {
    class Car {
        String model;
        int year;

        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public void upgradeYear() {
            this.year += 1;
        }

        @Override
        public String toString() {
            return model + " (" + year + ")";
        }

        public void main(String[] args) {
            Car myCar = new Car("Tesla", 2022);
            System.out.println("myCar: " + myCar);

            Car anotherCar = myCar;
            anotherCar.upgradeYear();

            System.out.println("myCar after upgrade: " + myCar);
            System.out.println("anotherCar after upgrade: " + anotherCar);

            myCar = new Car("Ford", 2020); // now myCar points to a NEW object

            System.out.println("myCar after reassignment: " + myCar);
            System.out.println("anotherCar still points to old Tesla: " + anotherCar);
        }
    }
}
