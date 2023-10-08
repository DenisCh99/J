package Lesson1__5;

public class Car {

    //fields поля
    //public - всем кто подсоединен к этому пакету
    //protected- данному классу и его наследникам
    //defolt - доступ по всему пакету
    //private доступ внутри  класса


    public static int wheelsNumber = 0;

    private String model;
    private int year; //год выпуска
    private boolean wasCrashed; //была ли в авварии?

    // constructor->
    public Car(String model, int year, boolean wasCrashed){
        this.model = model;
        this.year = year;
        this.wasCrashed =wasCrashed;
        //????this(model, year, wasCrashed);
    }


    /**
     * Этот метод выводит на экран инфу о машине
     */
    public void info(){
        System.out.println("Year = " + year + ". Model = " + model + ". Was crashed? = " + wasCrashed + ". Wheels number = " +
                " " + wheelsNumber);
    }

    public void printModel(){
        System.out.println("Model = " + model);
    }

    //геттеры
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isWasCrashed() {
        return wasCrashed;
    }



    //setters


    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }

    public void crash(){
        System.out.println("car is crashed!!!");
        setWasCrashed(true);
    }

    public void repair(){
        if (isWasCrashed()){
            System.out.println("Машина отремонтирована");
            setWasCrashed(false);
        }else System.out.println("Машина не нуждается в ремонте");
    }
}
