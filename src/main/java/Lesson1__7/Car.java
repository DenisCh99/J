package Lesson1__7;

public class Car {
        //1:37  закончил смотреть
    /**
     * volume - обьем бака
     */
    private int volume;

    public Car(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public void takeGasoline(GazStation gazStation){
        gazStation.refill(volume);
    }

    public void findGasoline(GazStation[] gasStations){
        for (GazStation station: gasStations) {
            if (station.getAvailable()<volume){
                continue;
            }
            station.refill(volume);
            System.out.println("Машина заправилась на заправке под названием " + station.getStationName());
            break;
        }
    }
}
