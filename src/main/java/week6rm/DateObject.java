package week6rm;

public class DateObject {
    class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        // getters
        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        // method to compare dates
        // returns true if the current date is earlier than the compared date
        public boolean earlier(MyDate compared) {
            if(this.year < compared.getYear()) {
                return true;
            } if (this.year == compared.getYear() && this.month < compared.getMonth()) {
                return true;
            } if (this.year == compared.getYear() && this.month == compared.getMonth() && this.day < compared.getDay()) {
                return true;
            }
            return false;
        }

        // main method for testing
        public void main(String[] args) {
            MyDate date1 = new MyDate(10, 5, 2022);
            MyDate date2 = new MyDate(15, 5, 2023);

            if (date1.earlier(date2)) {
                System.out.println("Date 1 is earlier than Date 2");
            } else {
                System.out.println("Date 1 is not earlier than Date 2");
            }
        }
    }
}
