package Lesson1__4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CrossesZeroesApp {
    public static char[][] map; //массив символов(поле) являющийся полем
    //размер поля
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;//сколько точек в ряд нуно собрать чтобы выиграть
    public static final char DOT_EMPTY = '*'; //незаполненная клеточка(точка)
    public static final char DOT_X = 'X'; //крестик
    public static final char DOT_0 = '0'; //нолик
    public static boolean changeCrossesZeroes; //отвечает за выбор игрока: крестик или нолик
    public static boolean exitGame = false;

    /**
     * метод который инициализирует поле
     */
    public static void initMap() {
        if (exitGame) {
            System.out.println("Exit...");
        } else {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + "  ");
                }
                System.out.println();
            }
            startPlayCrosses();
        }

    }

    public static void enterCoordinateMap(int a, int b) {
        if (changeCrossesZeroes) {
            map[a][b] = DOT_X;

            int dots = 0;

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (Objects.equals(map[i][j], DOT_X)) {
                        dots++;
                        if (dots >= DOTS_TO_WIN) {
                            System.out.println("Победа крестиков, выход из игры");
                            exitGame = true;
                            initMap();
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
                            System.out.println("Победа крестиков, выход из игры");
                            exitGame = true;
                            initMap();
                        }
                    }

                }
                dots = 0;

            }

            for (int i = 0, j = 0; i < SIZE; i++, j++) {
                if (Objects.equals(map[i][j], DOT_X)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        System.out.println("Победа крестиков, выход из игры");
                        exitGame = true;
                        initMap();
                    }
                }
            }
            dots = 0;


            for (int i = 2, j = 0; i < SIZE && i >= 0; i--, j++) {
                if (Objects.equals(map[i][j], DOT_X)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        System.out.println("Победа крестиков, выход из игры");
                        exitGame = true;
                        initMap();
                    }
                }
            }
            dots = 0;




        } else if (!changeCrossesZeroes) {
            map[a][b] = DOT_0;

            int dots = 0;

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (Objects.equals(map[i][j], DOT_0)) {
                        dots++;
                        if (dots >= DOTS_TO_WIN) {
                            System.out.println("Победа ноликов, выход из игры");
                            exitGame = true;
                            initMap();
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
                            System.out.println("Победа ноликов, выход из игры");
                            exitGame = true;
                            initMap();
                        }
                    }

                }
                dots = 0;
            }

            for (int i = 0, j = 0; i < SIZE; i++, j++) {
                if (Objects.equals(map[i][j], DOT_X)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        System.out.println("Победа ноликов, выход из игры");
                        exitGame = true;
                        initMap();
                    }
                }
            }
            dots = 0;

            for (int i = 2, j = 0; i < SIZE && i >= 0; i--, j++) {
                if (Objects.equals(map[i][j], DOT_X)) {
                    dots++;
                    if (dots >= DOTS_TO_WIN) {
                        System.out.println("Победа ноликов, выход из игры");
                        exitGame = true;
                        initMap();
                    }
                }
            }
            dots = 0;

        }

    }

    public static void startPlayCrosses() {
        Scanner scanner = new Scanner(System.in);

        int row = 0, cols = 0;

        changeCrossesZeroes = true;
        System.out.println("Очередь крестиков, введите координаты:");
        row = scanner.nextInt();
        cols = scanner.nextInt();
        row -= 1;
        cols -= 1;
        while (Objects.equals(map[row][cols], DOT_X) || Objects.equals(map[row][cols], DOT_0)) {
            System.out.println("Введите координаты заново, веденные вами координаты заняты");
            row = scanner.nextInt();
            cols = scanner.nextInt();
            row -= 1;
            cols -= 1;
        }
        enterCoordinateMap(row, cols);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

        if (exitGame) {

        } else startPlayZeroes();

    }


    public static void startPlayZeroes() {
        Scanner scanner = new Scanner(System.in);

        int row = 0, cols = 0;

        changeCrossesZeroes = false;
        System.out.println("Очередь ноликов, введите координаты:");
        row = scanner.nextInt();
        cols = scanner.nextInt();
        row -= 1;
        cols -= 1;
        while (Objects.equals(map[row][cols], DOT_X) || Objects.equals(map[row][cols], DOT_0)) {
            System.out.println("Введите координаты заново, веденные вами координаты заняты");
            row = scanner.nextInt();
            cols = scanner.nextInt();
            row -= 1;
            cols -= 1;
        }
        enterCoordinateMap(row, cols);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

        if (exitGame) {

        } else startPlayCrosses();
    }




    public static void main(String[] args) {
        initMap();

    }
}
