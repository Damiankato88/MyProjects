package Fruits19;

public class Fruit {
    public String weight;
    public String type;

    public Fruit(String weight, String type) {
        this.weight = weight;
        this.type = type;

    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight='" + weight + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}




