package Lesson1__7;

public class App {
    public static void main(String[] args) {
        Car car = new Car(60); //есть машина с обьемом бака 60
        Car car2 = new Car(100); //есть машина с обьемом бака 60
        GazStation gazStation = new GazStation(1000, "G"); // есть станция в которой есть 1000 литров бенза
        car.takeGasoline(gazStation);
        gazStation.info();
        car2.takeGasoline(gazStation);
        gazStation.info();

        GazStation gazStation1 = new GazStation(0, "G1");
        GazStation gazStation2 = new GazStation(40, "G2");
        GazStation gazStation3 = new GazStation(200, "G3");

        GazStation[] gazStations = {gazStation, gazStation1, gazStation2, gazStation3};

        car.findGasoline(gazStations);

    }
}
