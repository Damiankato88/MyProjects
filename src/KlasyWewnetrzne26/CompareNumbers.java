package KlasyWewnetrzne26;

public class CompareNumbers {
    public static void main(String[] args) {


        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("argument cannot be null");
                if (tab.length == 0)
                    throw new IllegalArgumentException("array has to have at leats");

                for (int i = 0; i < tab.length - 1; i++){
                    for (int j = 0; j < tab.length - 1; j++){
                        if(tab[j] > tab[j + 1]){
                            int temp = tab[j];
                            tab[j] = tab[j + 1];
                            tab[j + 1] = temp;
                        }


                    }


                }
                for (int i = 0; i < tab.length; i++)
                    System.out.println(tab[i]);
            }

        };
        int[] tab = new int[]{10, 9, 15, 987, 12, 3};
        sorter.sort(tab);
    }
}

