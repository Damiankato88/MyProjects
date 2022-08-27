package Fruits19;

public class Apple extends Fruit {
    public static final String TYPE = "jablkowate";
    private String gender;

    public Apple(String weight, String gender) {
        super(weight, TYPE);
        this.gender = gender;


    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "gender='" + gender + '\'' +
                ", weight='" + weight + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}

