package Lesson1__6;

import java.util.Arrays;

public class RentApp {
    public static void main(String[] args) {
        Car car = new Car("toyota", 2012);
        System.out.println();
        Car van = new Van("Jeep", 2018, 6);
        //System.out.println(van.model+van.year);
        System.out.println();
        Car cabrio = new Cabrio("lexuxs", 2013, true);

        System.out.println();

        Car[] cars ={car, van, cabrio};

        for (Car c: cars ) {
            System.out.println(c.getModel());
        }

        System.out.println("Only vans");
        /**
         * instanceof - узнаем изначальный класс обьекта и если это van  то печатаем его
         */
        for (Car c: cars) {
            if (c instanceof Van){
                Van v = (Van) c; // явно превращаем найденную минивэн в класс машина и присваиваем в v
                System.out.println("This is a Van " + c.model + " " + " Seats: " + v.getSeats());
            }
        }

        System.out.println("-3=5-0=93=-4=20495=3058=0348=5028058=240852=0475=01832=97193-19efhj1-ehfu0sdhf8w-492");

        System.out.println(car instanceof Van); //вернет false потому что car это не случай Van, а наоборотю (*instsnceof
        // - cлучай чего либо).
        System.out.println(car instanceof Car);
        System.out.println(van instanceof Car);

        Transport[] transports = {car, van, cabrio};
        for (Transport t: transports) {
           // t.printName();
            //System.out.println(t);
            System.out.println(t);
        }

        System.out.println();

        System.out.println(Arrays.toString(transports));
    }
}
