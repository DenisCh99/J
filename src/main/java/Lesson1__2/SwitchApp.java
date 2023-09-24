package Lesson1__2;

public class SwitchApp {
    //1:43
    public static void main(String[] args) {

        //checkOrderStatus("ACCEPTED");
        checkOrderStatus2("ACCEPTED");

        String month = "FEB";
        switch (month) {
            case "DEC":
            case "JAN":
            case "FEB":
                System.out.println("Winter");
        }


    }

    public static void checkOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED")) {
            System.out.println("Доставлен");
        } else System.out.println("неизвестный статус заказа");
    }

    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED":
                System.out.println("Принят");
                break;
            case "DELIVERED":
                System.out.println("Доставлен");
                break;
            default: {
                System.out.println("неизвестный статус заказа");
                break;
            }
        }
    }

}
