package Multitables;


import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        double[][] tab = new double[3][3];
        tab[0][0] = 1.0;
        tab[1][0] = 1.5;
        tab[2][0] = 2.0;
        for (int i = 1; i < tab.length; i++) {
            tab[0][i] = tab[0][i - 1] + 0.5;
            tab[1][i] = tab[0][i] + 0.5;
            tab[2][i] = tab[2][0] + (i * 0.5);
        }
        double sum = 0;
        double sumTwo = 0;
        for (int i = 0; i < tab.length; i++)
             {
                sum = sum + tab[i][i];
                sumTwo=sumTwo+tab[2-i][2-i];
            }
        double multiplicationSum = 0;
        double multiplicationTwo = 0;
        for (int k = 0; k < tab.length; k++) {
            multiplicationSum = multiplicationSum + tab[1][k];
            multiplicationTwo = multiplicationTwo + tab[k][1];
        }
        double pktTwo = multiplicationTwo * multiplicationSum;
        double allSum = 0;
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab.length; j++) {
                allSum += tab[i][j];
            }

        System.out.println("sum=" + sum);
        System.out.println(sumTwo);
        System.out.println("iloczyn="+sum*sumTwo);
        System.out.println("multiplication=" + pktTwo);
        System.out.println(allSum - tab[1][1]);
        System.out.print(tab[0][0] + "  ");
        System.out.print(tab[0][1] + "  ");
        System.out.println(tab[0][2] + "  ");
        System.out.print(tab[1][0] + "  ");
        System.out.print(tab[1][1] + "  ");
        System.out.println(tab[1][2] + "  ");
        System.out.print(tab[2][0] + "  ");
        System.out.print(tab[2][1] + "  ");
        System.out.print(tab[2][2] + "  ");


        System.out.println("\n\n\n\n");

        System.out.println("\n\n\n\n");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] +" ");
            }
            System.out.println();

        }
    }
}
