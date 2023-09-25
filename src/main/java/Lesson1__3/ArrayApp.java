package Lesson1__3;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {

        int[] array = new int[5]; //обьявление массива с выделением памяти
        int[] array2; //обьявление массива без выделения памяти

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        printArray(array);
        System.out.println("");


        array2 = new int[]{1, 2, 5}; //init array
        printArray(array2);
        System.out.println();


        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = Integer.toString(i + 1);
        }
        printStringArray(strings);
        System.out.println("");
        System.out.println("");


        String[] strings2 = new String[6];
        System.out.println(Arrays.toString(strings2)); //вывод массива на экран, работает для всех типов данных

        Arrays.fill(strings, "a"); //заполняет все элементы массива на указанный нами элемент
        Arrays.toString(strings);
        printStringArray(strings);
        System.out.println("\n");
        System.out.println(Arrays.toString(strings));
        System.out.println();


        int integer = 100;
        method1(integer);
        System.out.println(integer + "\n");

        int[] integers = new int[]{1, 4, 6, 34, 46, 2};
        method2(integers);
        System.out.println(Arrays.toString(integers));

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }
    }

    public static void printStringArray(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

    public static void method1(int a) {
        a = a + 10;
    }

    public static void method2(int[] a) {
        a[2] = 2837;
    }

}
