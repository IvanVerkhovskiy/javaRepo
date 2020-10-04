package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Game {
    // Константа
    public static char [][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    // Константы символа
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    //
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args){
        initMap();
        printMap();
        while (true){
            System.out.println("Ход игрока...");
            humanTurn();
            if (checkWin(DOT_X)){
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            System.out.println("Ход компьютера...");
            aiTurn();
            if (checkWin(DOT_O)){
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
        }
    }

//    Инициализация игрового поля
    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

//    Вывод игрового поля
    public static void printMap(){
        // Рисуем координатную плоскость
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

//    Ход игрока
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y.");
            System.out.println("Введите координату X:");
            x = scanner.nextInt() - 1;
            System.out.println("Введите координату Y:");
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
        printMap();
    }

//    Ход компьютера
    public static void aiTurn(){
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
        printMap();
    }

//    Координата содержит значение?
    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

//    Проверка победы
    public static boolean checkWin(char symb){
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) return true;
        return false;
    }

//    Проверка на ничью
    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
