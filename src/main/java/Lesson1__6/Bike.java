package Lesson1__6;

public final class Bike extends Transport {
    private int wheelsNumber;

    public Bike(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }


    @Override
    public void wroomWroom() {
        System.out.println("bzzzzzzzz");
    }

    @Override
    public void printInventionDate() {
        System.out.println("1950");
    }
}
