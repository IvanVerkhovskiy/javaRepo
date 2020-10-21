package com.seabattle.ru;

import java.util.Scanner;

public class Main {

    // Игровое поле
    public static char[][] gameFillOne; // Игровое поле 1
    public static char[][] gameFillTwo; // Игровое поле 1
    public static final int SIZE = 10; // Размер игрового поля

    public static Scanner scanner = new Scanner(System.in);

    // Символы
    public static final char DOT_EMPTY = '-';
    public static final char SHIP = 129; // Символ для обозначения коробля
    public static final char BROKEN_SHIP = 'X'; // Символ для обозначения подбитого коробля

    // Корабли
    public static final int BOAT = 4; // Катер (1 клетка)
    public static final int DESTROYER = 3; // Эсминец (2 клетки)
    public static final int BATTLESHIP = 2; // Линкор (3 клетки)
    public static final int CRUISER = 1; // Крейсер (1 клетка)

    public static void main(String[] args) {
        System.out.println("Вас приветсвует игра 'Морской бой!'");
        System.out.println();
//        Инициализация поля
        initMap();
//        Отрисовка поля
        printMapOne();
        placementOfShips();
    }

//    Расстановка кораблей игрока 1
    public static void placementOfShips(){
        System.out.println("Расставьте корабли, используя координаты X и Y.");
        int step = 1;
        int x; // координата x
        int y; // координата y
        // Катер
        for (int i = 0; i < BOAT; i++){
            do {
                System.out.println("Укажите координату X катера № " + step);
                x = scanner.nextInt() - 1;
                System.out.println("Укажите координату Y катера № " + step);
                y = scanner.nextInt() - 1;
            } while (!checkMap(x, y));
            gameFillOne[y][x] = SHIP;
            step++;
            printMapOne();
        }
        step = 1;
        // Эсминец
        for (int i = 0; i < DESTROYER; i++){
            do {
                System.out.println("Укажите начало координаты X эсминца № " + step);
                x = scanner.nextInt() - 1;
                System.out.println("Укажите начало координаты Y эсминца № " + step);
                y = scanner.nextInt() - 1;
            } while (!checkMap(x, y));
            gameFillOne[y][x] = SHIP;
            step++;
            printMapOne();
        }
    }

//    Проверка на то, что поле не занято
    public static boolean checkMap(int x, int y){
        if (x > SIZE || y > SIZE){
            return false;
        }
        if (gameFillOne[y][x] == DOT_EMPTY){
            return true;
        }
        return false;
    }

    //    Инициализация игрового поля
    public static void initMap() {
        gameFillOne = new char[SIZE][SIZE];
        gameFillTwo = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameFillOne[i][j] = DOT_EMPTY; // Поле первого игрока
                gameFillTwo[i][j] = DOT_EMPTY; // Поле второго игрока
            }
        }
    }

//    Отрисовка поля первого игрока
    public static void printMapOne() {
        System.out.println("Игровое поле игрока № 1\n" +
                "");
        System.out.print(" ");
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            if (i != SIZE - 1) {
                System.out.print(" ");
            }
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(gameFillOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

//    Отрисовка поля второго игрока
    public static void printMapTwo(){
        System.out.println("Игровое поле игрока № 2\n" +
                "");
        System.out.print(" ");
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            if (i != SIZE - 1){
                System.out.print(" ");
            }
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(gameFillTwo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}