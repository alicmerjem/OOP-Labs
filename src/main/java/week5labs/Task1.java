package week5labs;

public class Task1 {
    public static void main(String[] args) {

    }
}


// person class
class Person {
    // defined private attributes
    private String name;
    private String email;
    private int birthYear;

    // adding constructors that accepts all attributes
    public Person(String name, String email, int birthYear) {
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // implementing a method to calculate age
    public int getAge(int currentYear) {
        return currentYear - this.birthYear;
    }

    // getInfo method to return person info
    public String getInfo() {
        return "Name: " + name + ", Email: " + email + ", Age: " + getAge(2025);
    }

}

// student class
class Student extends Person {
    private String studentId;
    private String major;

    // adding constructors
    public Student(String name, String email, int birthYear, String studentId, String major) {
        super(name, email, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    // getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // override getInfo to include details specific to students
    @Override
    public String getInfo() {
        return super.getInfo() + ", Student ID: " + studentId + ", Major: " + major;
    }
}

// professor class
class Professor extends Person {
    // private attributes
    private String employeeId;
    private String department;

    // constructors
    public Professor(String name, String email, int birthYear, String employeeId, String department) {
        super(name, email, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    // getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // override getInfo again to include details specific to the professor
    @Override
    public String getInfo() {
        return super.getInfo() + ", Employee ID: " + employeeId + ", Department: " + department;
    }
}

