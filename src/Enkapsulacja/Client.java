package Enkapsulacja;

public class Client {


    private String firstName;
    private String lastName;
    private boolean premium;

    public Client(String firstName, String lastName, boolean premium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;
    }

    Client(String firstName, boolean premium) {
        this.firstName = firstName;
        this.premium = premium;



    }


    public String getFirstName() {
        return firstName;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}


