package Lesson1__6;
//закончил смотреть 1.00
public class Car extends Transport {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("this is a Car constructor");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    void printName(){
        System.out.println("Car");
    }

    @Override
    public void wroomWroom() {
        System.out.println("wroooooooooom");
    }

    @Override
    public String toString() {
        return model + " " + year;
    }

    void info(){
        System.out.println(this);
    }


}
