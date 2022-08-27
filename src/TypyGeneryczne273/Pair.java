package TypyGeneryczne273;

public class Pair <T,V>{
    private T infoOne;
    private V infoTwo;

    public Pair(T infoOne, V infoTwo) {
        this.infoOne = infoOne;
        this.infoTwo = infoTwo;
    }

    public T getInfoOne() {
        return infoOne;
    }

    public void setInfoOne(T infoOne) {
        this.infoOne = infoOne;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "infoOne=" + infoOne +
                ", infoTwo=" + infoTwo +
                '}';
    }

    public V getInfoTwo() {
        return infoTwo;
    }

    public void setInfoTwo(V infoTwo) {
        this.infoTwo = infoTwo;
    }
}
