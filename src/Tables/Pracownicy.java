package Tables;

class Pracownicy {
  private String firstName;
  private String lastName;
  private double salary;

    public Pracownicy(String firstName, String lastName, double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}


