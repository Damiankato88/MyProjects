package PizzeriaShop;


enum Pizza {


    MARGHERITA("sos pomidorowy", "ser"), CAPRICIOSA("sos pomidorowy", "ser", "pieczarki");

    private final String one;
    private final String two;
    private String three;


    Pizza(String one, String two) {
        this.one = one;
        this.two = two;
    }

    Pizza(String one, String two, String three) {
        this.one = one;
        this.two = two;
        this.three = three;


    }


    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        three = three;

    }


    @Override
    public String toString() {
        if (three == null) {
            return (ordinal() + 1) + name() + "Pizza{" +
                    "1='" + one + '\'' +
                    ", 2='" + two+'\''+'}';


        } else return (ordinal() + 1) + name() + "Pizza{" +
                "1='" + one + '\'' +
                ", 2='" + two + '\'' +
                ", 3='" + three + '\'' +
                '}';

    }
}







