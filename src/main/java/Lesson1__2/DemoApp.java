package Lesson1__2;

/**
 * создать поле 6*6 и заполнить его
 */
public class DemoApp {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();


        /**
         * правую половину заполнить нулями
         */


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j > 2){
                    System.out.print(" 0 ");
                }else System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println();
        /**
         * нижнюю половину заполнить нулями
         */

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 2){
                    System.out.print(" 0 ");
                }else System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println();
        /**
         * закрвшенная диагоняль 0 слева сверху -> вправо вниз
         */


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j){
                    System.out.print(" 0 ");
                }else System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();

        /**
         * диагональ пустая, снизу от нее 0, сверху от нее *
         */

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j){
                    System.out.print("  ");
                }else if (i>j){
                    System.out.print(" 0 ");
                } else if (i < j) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }

}
