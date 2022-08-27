package task2;

public class Employee {
    String name;
    String surname;
    int yearOfBirth;
    int seniority;


    public Employee() {
    }

    public Employee(String name, String surname, int yearOfBirth, int seniority) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", seniority=" + seniority +
                '}';
    }
}
