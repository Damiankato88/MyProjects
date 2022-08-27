package Firma27;

public class Employee extends Person{
    public String salary;

    public Employee(String firstName, String lastName, String salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
