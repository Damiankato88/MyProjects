package HospitalManagment20;

public class Doctor extends Person {
    public String bonus;

    public Doctor(String firstName, String lastName, String salary, String bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;

    }




    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "bonus='" + bonus + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

