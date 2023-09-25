package Lesson1__3;

import java.util.Arrays;

public class TwoDimArrayApp {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        System.out.println(Arrays.toString(array)); //выведет только сслыки на массивы
        /**
         * Чтобы вывести не ссылки на массивы а сами массивы нужно написать следующее
         * В первом for мы обращаемся к длине первого массива, кторорый содержит в себе
         * ссылки на другие массивы, его мы указываем без []
         * Во втором for обращаемся ко второму массиву, поэтому указываем [i]
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Array [" + i + "]" + "[" + j + "] = ");
                System.out.println(Arrays.toString(array[i]));
            }
            System.out.println();
        }


        /**
         * Присвоение элементов одного массива другому массиву
         */
        int[] arr2 = array[2];
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println();


        /**
         *Что лежит по ссылкам в двумерном массиве без присвоения элементов и без обьявления подмассивов
         */
        int[][] arrayArr = new int[5][];
        System.out.println("Ссылки на подмассивы: " + Arrays.toString(arrayArr)); //увидим ссылки на подмассивы
        System.out.println("Что лежит в нулевом подмассиве: " + Arrays.toString(arrayArr[0]));
        arrayArr[0] = new int[]{1, 2, 4, 5, 6}; //в нулевой подмассив присвоим значения
        System.out.println("Что теперь лежит в нулевом подмассиве: " + Arrays.toString(arrayArr[0])); //увидим ????
        System.out.println();


        /**
         * Как сразу указать элементы двумерного массива ??????????????????????????????????
         */
        int[][] arrayArr2 = {{1, 5}, {2, 7}};

        for (int i = 0; i < arrayArr2.length; i++) {
            for (int j = 0; j < arrayArr2[i].length; j++) {
                System.out.print("Array [" + i + "]" + "[" + j + "] = ");
                System.out.println(Arrays.toString(arrayArr2[i]));
            }
            System.out.println();
        }


        /**
         * Как вернуть символ из строкипо номеру элемента(символа в строке)?
         * Представить строку как набор(массив) из символов
         */
        char[] chars = "Java".toCharArray();
        System.out.println(chars[1]);//выведет букву а

    }
}
