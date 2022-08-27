package task2;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee4 = new Employee("Adam", "Miałczyński", 1990, 25);
        Employee employee3 = new Employee();
        Employee employee5 = new Employee("Adam", "Miałczyński", 1990, 25);

        employee1.name = "Jon";
        employee1.surname = "donald";
        employee1.seniority = 4;
        employee1.yearOfBirth = 1976;


        employee2.name = "Trev";
        employee2.surname = "donald";
        employee2.seniority = 4;
        employee2.yearOfBirth = 1976;

        employee3.name = "Kevin";
        employee3.surname = "donald";
        employee3.seniority = 4;
        employee3.yearOfBirth = 1976;
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println(employee4);
    }
}