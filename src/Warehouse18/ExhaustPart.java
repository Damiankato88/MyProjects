package Warehouse18;

public class ExhaustPart extends Part{
    public boolean EuropeanNorm;

    public boolean isEuropeanNorm() {
        return EuropeanNorm;
    }

    public void setEuropeanNorm(boolean europeanNorm) {
        EuropeanNorm = europeanNorm;
    }

    public ExhaustPart(String number, String producer, String model, boolean europeanNorm) {
        super(number, producer, model);
        EuropeanNorm = europeanNorm;

    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "EuropeanNorm=" + EuropeanNorm +
                ", number='" + getNumber() + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
