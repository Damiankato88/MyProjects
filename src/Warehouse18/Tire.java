package Warehouse18;

public class Tire extends Part{
    public String size;
    public String width;

    public Tire(String number, String producer, String model, String size, String width) {
        super(number, producer, model);
        this.size = size;
        this.width = width;
    }

    public String getSize() {
        return size;

    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;

    }

    @Override
    public String toString() {
        return "Tire{" +
                "size='" + size + '\'' +
                ", width='" + width + '\'' +
                ", number='" + getNumber() + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
