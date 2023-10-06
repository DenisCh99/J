package Lesson1__4;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class CrossesZeroesGame {

    public static char[][] map; //массив символов(поле) являющийся полем
    //размер поля
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;//сколько точек в ряд нуно собрать чтобы выиграть
    public static final char DOT_EMPTY = '*'; //незаполненная клеточка(точка)
    public static final char DOT_X = 'X'; //крестик
    public static final char DOT_0 = '0'; //нолик
    public static int change;

    public static final Scanner SCANNER = new Scanner(System.in); //обьект на основе класса сканер
    public static final Random RANDOM = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


    /**
     * Вывод игрового поля на экран
     */
    public static void printMap() {
        //нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        //пишем строки
        for (int i = 0; i < map.length; i++) {
            //выводим ногиер строки
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean isCorrectlyEnter(int change){
        if (change == 1 || change == 2){
            return true;
        }else return false;
    }

    public static void changePlayer(){
        System.out.println("Выберите игрока для себя. Клик 1 -выбор Х, клик 2 - выбор 0");
        do {
            change = SCANNER.nextInt();
        }while (!isCorrectlyEnter(change));
        if (change == 1){
            System.out.println("Вы выбрали себе игрока Х");
        }else System.out.println("Вы выбрали себе игрока 0");

    }

    /**
     * ход человека по игровому полю
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите коор-ты в формате х, у");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        if (change == 1){  //X player
            map[y][x] = DOT_X;
        }else map[y][x] = DOT_0; //0 player
    }

    /**
     * Ход робота ИИ
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        if (change == 1){  //X player
            map[y][x] = DOT_0;
        }else map[y][x] = DOT_X; //X player
        System.out.println("Робот сходил на координаты y = " + (y + 1) + " x = " + (x + 1));
    }

    /**
     * Проверка валидны ли значения поля
     *
     * @param x координата х
     * @param y координата у
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) {
            return false; //не валидно так как мы вышли за рамки
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    public static boolean checkWin(char symbol) {

        if (symbol == DOT_X) {
            int dots = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (Objects.equals(map[i][j], DOT_X)) {
                        dots++;
                        if (dots >= DOTS_TO_WIN) {
                            return true;
                        }
                    }
                }
                dots = 0;
            }

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (Objects.equals(map[j][i], DOT_X)) {
                        dots++;
                        if (dots >= DOTS_TO_WIN) {
                            return true;
                        }
                    }
                }
                dots = 0;
            }

            for (int i = 0, j = 0; i < SIZE; i++, j++) {
                if (Objects.equals(map[i][j], DOT_X)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
            dots = 0;

            for (int i = 2, j = 0; i < SIZE && i >= 0; i--, j++) {
                if (Objects.equals(map[i][j], DOT_X)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
            dots = 0;
            return false;
        } else if (symbol == DOT_0) {
            int dots = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (Objects.equals(map[i][j], DOT_0)) {
                        dots++;
                        if (dots >= DOTS_TO_WIN) {
                            return true;
                        }
                    }
                }
                dots = 0;
            }

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (Objects.equals(map[j][i], DOT_0)) {
                        dots++;
                        if (dots >= DOTS_TO_WIN) {
                            return true;
                        }
                    }
                }
                dots = 0;
            }

            for (int i = 0, j = 0; i < SIZE; i++, j++) {
                if (Objects.equals(map[i][j], DOT_0)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
            dots = 0;

            for (int i = 2, j = 0; i < SIZE && i >= 0; i--, j++) {
                if (Objects.equals(map[i][j], DOT_0)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
            dots = 0;
            return false;
        }

/*
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        return false; */
        return false;
    }



    /**
     * проверяет поле на наличие свободных ячеек
     *
     * @return true если в поле нет ни одной свободной ячейки
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != DOT_X && map[i][j] != DOT_0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        changePlayer();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (change == 1){
                if (checkWin(DOT_X)) {
                    System.out.println("Human win");
                    break;
                }
            }else {
                if (checkWin(DOT_0)) {
                    System.out.println("Human win");
                    break;
                }
            }

            if (isMapFull()) {
                System.out.println("No winner");
                break;
            }
            aiTurn();
            printMap();
            if (change == 1){
                if (checkWin(DOT_0)) {
                    System.out.println("AI win, human race is fall");
                    break;
                }
            }else {
                if (checkWin(DOT_X)) {
                    System.out.println("AI win, human race is fall");
                    break;
                }
            }
            if (isMapFull()) {
                System.out.println("No winner");
                break;
            }

        }
        System.out.println("<<<Game over>>>");

    }

}
