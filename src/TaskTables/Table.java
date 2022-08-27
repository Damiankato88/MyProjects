package TaskTables;

import java.util.Arrays;

public class Table {
    public static void main(String[] args) {


        int[] tableOne = {3, 5, 7};
        int[] tableTwo = {23, 1, 5};
        int[] tableThree = {tableOne[0] + tableTwo[0], tableOne[1] + tableTwo[1], tableOne[2] + tableTwo[2]};
        System.out.println(Arrays.toString(tableThree));
        System.out.println(tableOne[0] + tableTwo[0]+tableOne[1] + tableTwo[1]+tableOne[2] + tableTwo[2]);

    }



}
