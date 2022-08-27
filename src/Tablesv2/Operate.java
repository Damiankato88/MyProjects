package Tablesv2;

import java.util.Arrays;

public class Operate {
    public void action(int getTableOne[], int getTableTwo[]) {
        int[] tableThree = {getTableOne[0] + getTableTwo[0], getTableOne[1] + getTableTwo[1], getTableOne[2] + getTableTwo[2]};
        System.out.println(Arrays.toString(tableThree));
        System.out.println(getTableOne[0] + getTableTwo[0] + getTableOne[1] + getTableTwo[1] + getTableOne[2] + getTableTwo[2]);
        int sum = 0;
        String tableText = "";        for (int i = 0; i < getTableOne.length; i++) {
            tableThree[i] = getTableOne[i] + getTableTwo[i];
            tableText = tableText + tableThree[i] + " ";
            sum = sum + tableThree[i];
        }
        System.out.println("["+tableText + "]");
               System.out.println(sum);
    }


}
