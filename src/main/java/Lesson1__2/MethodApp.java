package Lesson1__2;

public class MethodApp {

    public static final String TEMPLATE = "int = %d, String = %s\n";

    public static void main(String args[]) {

        //53.10 min sec
        int tp = 100;
        int totalPrice = 100;
        int v1 = multiplication(5, 5);
        int v2 = multiplication(3, 3);
        double v3 = 10.5;
        int v4 = multiplication(v1, (int) v3);
        System.out.println(v4);

        PrintUtil.printFormatted("I am a stroka and I young");
        System.out.println(PrintUtil.getFormatted("str"));
        PrintUtil.getStr("Yahoo");
        System.out.println("\n");

        System.out.printf(TEMPLATE, 19, "Danny");


    }

    public static int multiplication(int num1, int num2) {

        int result = num1 * num2;
        return result;

    }

}
