package Lesson1__7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));//сделали из строки массив символов и вывели
        String str2 = new String(str.toCharArray());//сделали из массива симоволов строку
        System.out.println(str2);
        System.out.println(str.toUpperCase(Locale.ROOT)); //перевод всех букв в больште буквы
        System.out.println(str.contains("ing"));//проверяет вхождение подстроки в данную строку
        System.out.println(str.equalsIgnoreCase("StrINg")); //сравнивает с учетом букв из разных регистров

        StringBuilder stringBuilder = new StringBuilder("566"); // построитель строки, cуть та же что и у sout
        //он не создает строку каждый раз, он сразу модифицирует изначальный
        //являетс\ более производительным чем sout
        stringBuilder.append("+"); //добавляет элемент в строку
        stringBuilder.append("Рлво++_"); //добавляет элемент в строку
        System.out.println(stringBuilder);


        //второй вариант написания:
        stringBuilder.append(" grtkgotbo5y__").append(" fvgvrgvrtgbvrgtvtgvtgbvtbgb").append('t');
        System.out.println(stringBuilder);

        System.out.println();
        String stringS = stringBuilder.toString();
        System.out.println(stringS);
    }
}
