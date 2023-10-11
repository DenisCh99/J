package Lesson1__6;

public class Van extends Car {

    int seats;

    public Van(String model, int year, int seats) {
        super(model, year);
        this.seats = seats;
        System.out.println("this is a Van constructor");
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    void printName(){
        System.out.println("Van");
    }
}
