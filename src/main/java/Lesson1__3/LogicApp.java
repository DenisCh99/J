package Lesson1__3;

public class LogicApp {
    public static void main(String[] args) {
        int number1 = 14;
        int number2 = 0;

        if (isPositive(number2) && !isZero(number2)) {
            System.out.println("positive and is not zero");
        } else if (isPositive(number2) && isZero(number2)) {
            System.out.println("is zero");
        }

    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }
}
