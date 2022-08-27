package Tables;

public class Company {
    public static void main(String[] args) {
        Pracownicy[] pracownik = new Pracownicy[20];
        pracownik[0] = new Pracownicy("Jan", "Nowak", 3500);
        pracownik[1] = new Pracownicy("Marta", "Zieba", 3700);
        pracownik[2] = new Pracownicy("Karol", "Wojak", 4500);
        int employeeindex = 2;
        System.out.println(pracownik[employeeindex - 1].getFirstName() + "" + pracownik[employeeindex - 1].getLastName()
                + "" + pracownik[employeeindex - 1].getSalary() + "zl");
        int pracownikSize = pracownik.length;
        System.out.println("dlugosc"+pracownikSize);
    }

}
