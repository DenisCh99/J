package Lesson1__3;

public class StringApp {
    public static void main(String[] args) {
        //LIFO -> lust in - first out -> последний зашел - первый вышел. Относится к стэку
        /*
        рекурсия -> ошибка, при которой метод вызывает самого себя -> переполняется стэк и появляется ошибка -> stack
        overflow
        все примитивные переменные, созданные при вызове метода, хранятся в стэке
         */

        String str1 = "new str";

        String str2 = new String("new str");

        System.out.println(str1);
        System.out.println(str2);

        str1.equals(str2); //сравнение обьектов(т е того что расположено если перейти по ссылкам) а не сравнение самих
        //ссылок
        if (str1.equals(str2)) {
            System.out.println("true");
        }

        boolean eq = str1 == str2; //сравнение самих ссылок на обьекты
        System.out.println(eq);

    }
}
