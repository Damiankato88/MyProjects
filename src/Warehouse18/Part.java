package Warehouse18;

public class Part {
    private String number;
    public String producer;
    public String model;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Part(String number, String producer, String model) {
        this.number = number;
        this.producer = producer;
        this.model = model;

    }
}
