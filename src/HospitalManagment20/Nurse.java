package HospitalManagment20;

public class Nurse extends Person {
    public String overtime;

    public Nurse(String firstName, String lastName, String salary, String overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;


    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "overtime='" + overtime + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

