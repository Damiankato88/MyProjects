package Stars;

public class Two {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print(" ");
            }
            for (int k = 0; k < (6 - i)*2; k++) {

                System.out.print("x");
                for (int j = 6; j < i; j++) {
                    System.out.print("x");
                }
            }

            System.out.println();

        }
    }
}



