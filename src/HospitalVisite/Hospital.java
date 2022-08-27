package HospitalVisite;

public class Hospital {
    Patient patients[] = new Patient[10];
    int cout = 0;

    public void addPatient(Patient patient) {

        if (cout < 10) {
            patients[cout] = patient;
            System.out.println("pacjent dodany do kolejki pod numerem " + (cout+1));
        } else {
            System.out.println("limit zostal wyczerpany");
        }
        cout++;
    }

    public void viewPatient() {
        for (int i = 0; i < cout; i++) {
            System.out.println(patients[i]);
        }
    }
}

