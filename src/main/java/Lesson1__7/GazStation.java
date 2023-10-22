package Lesson1__7;

public class GazStation {
    private String stationName;
    private int available; //свободный обьем который он может запрвить
   // private boolean isFull;

    public GazStation(int available, String stationName) {
        this.available = available;
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public int getAvailable() {
        return available;
    }

    /**
     *
     * @param amount - заправить определенное кол-во бензина
     */
    public void refill(int amount) {
        this.available -= amount;
    }

    /**
     * переопределяет toString чтобы он возвращал не строку адресов обьектов а строку с оставшимся обьемом бензина
     * на заправке
     * @return
     */
    @Override
    public String toString() {
        return "GazStation{" +
                "available=" + available +
                '}';
    }

    public void info(){
        System.out.println(this);
    }
}
