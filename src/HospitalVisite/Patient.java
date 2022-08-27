package HospitalVisite;

public class Patient {
    private String firstName;
    private String lastName;
    private String Pesel;

    public Patient(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        Pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    @Override
    public String toString() {
        return  "firstName " + firstName  +
                ", lastName " + lastName  +
                ", Pesel " + Pesel;
    }
}
