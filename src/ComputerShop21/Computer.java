package ComputerShop21;

public class Computer {
    public String producer;
    public int model;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", model=" + model +
                '}';
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getModel() == computer.getModel() && getProducer().equals(computer.getProducer());
    }


}
