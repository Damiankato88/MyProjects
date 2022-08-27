package Static16;



public class University {
    public static void main(String[] args) {
        Student[]students=new Student[10];
        students[0]=new Student("Tom", "Han","4321");
        students[1]= new Student("Adam","Lech", "5674");
        students[2]=new Student("Jan", "Kowal", "7865");
        students[3]=new Student("Karol", "Kran", "6533");
        students[4]=new Student("Jozef","Klein","7865");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }
        System.out.println("Liczba studentow to "+Student.numbers);
        }

    }



