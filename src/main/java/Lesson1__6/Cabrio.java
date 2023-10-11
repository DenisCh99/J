package Lesson1__6;

public class Cabrio extends Car {

    boolean hasHardTop;

    public Cabrio(String model, int year, boolean hasHardTop) {
        super(model, year);
        this.hasHardTop = hasHardTop;
        System.out.println("this is a Cabrio constructor");
    }

    public boolean isHasHardTop() {
        return hasHardTop;
    }

    public void setHasHardTop(boolean hasHardTop) {
        this.hasHardTop = hasHardTop;
    }

    @Override
    void printName() {
        super.printName();
    }

    @Override
    public String toString() {
        return model + " " + year;
    }
}
