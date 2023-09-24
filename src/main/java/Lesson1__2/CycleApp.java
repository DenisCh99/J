package Lesson1__2;

public class CycleApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; //пропускаем данную итерацию(четное число) и переходим к следующей
            }
            if (i > 6) {
                break; //Выход из цикла(полностью) если i больше 6
            }
            PrintUtil.printFormatted("str " + i);
        }


        System.out.println(getDividedByThree());

//        for (;;){
//            //бесконечный цикл
//        }  //ctrl+/

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println();
        }

    }

    public static int getDividedByThree() {
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                return i; //возвращает значение и сразу выходит из данного цикла в методе getDividedByThree ( как break)
            }
        }
        return 0;
        /*
        если цикл ничего не вернул, то по дефолту мы должны вернуть 0, ибо без ретерна нельзя
         */
    }

}
