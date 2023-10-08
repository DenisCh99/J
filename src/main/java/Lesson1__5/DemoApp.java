package Lesson1__5;

import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
        Car car = new Car("Ford Mystang", 1983, true); // создали обьект на основе класса Car
        Car car2 = new Car("Tesla model S", 2020, false); // создали обьект на основе класса Car
        Car car3 = car; //создали ссылку на обьект саr. но никакой обьект при этом не создавали

        car.setYear(1983);
        car.setModel("Ford Mystang");
        car.wheelsNumber = 4;
        System.out.println("Year = " + car.getYear() + ". Model = " + car.getModel() + ". Was crashed? = " + car.isWasCrashed()
                + ". Wheels Number = " + car.wheelsNumber);

        car2.setYear(1983);
        car2.setModel("Ford Mystang");
        car2.setWasCrashed(true);
       // car2.wheelsNumber = 6;
        System.out.println("Year = " + car2.getYear() + ". Model = " + car2.getModel() + ". Was crashed? = " + car2.isWasCrashed()
                + ". Wheels Number = " + car2.wheelsNumber);

        //Создадим массив из ссылок на наши обьекты
        Car[] cars = new Car[]{car,car2};
        //System.out.println(Arrays.toString(cars[0]));

        int wheelsNumber = Car.wheelsNumber;
        System.out.println(wheelsNumber);

        //вызов функции через обьект
        car2.info();
        car2.info();
        car2.info();
        car2.info();
        car.printModel();


        car2.setModel("Huesla");
        String modelOfCar = car2.getModel();
        System.out.println(modelOfCar);


    }
}
