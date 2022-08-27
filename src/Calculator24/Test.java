package Calculator24;


import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) throws UnknownOperatorException {
        Numbers numbers = new Numbers();
        boolean error = true;

        do {
            try {
                numbers.setNum();
                error = false;

            } catch (InputMismatchException ex) {
                System.err.println("podaj prawidlowa liczbe");


            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage() + " inna niz 0");

            } catch (UnknownOperatorException ex) {
                System.err.println("prawidlowe znaki to: +,-,*,/ " + ex.getMessage());

            }

        } while (error);
    }
}
