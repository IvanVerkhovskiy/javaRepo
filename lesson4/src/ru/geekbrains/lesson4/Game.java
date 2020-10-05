package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static char [][] map; // Переменная отвечает за игровое поле
    public static final int SIZE = 3; // Переменная отвечает за размер игрового поля
    public static final int DOTS_TO_WIN = 3; // Количество строк для победы

    public static final char DOT_EMPTY = '*'; // Для пустой ячейки
    public static final char DOT_X = 'X'; // Для первого игрока
    public static final char DOT_O = 'O'; // Для второго игрока

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args){
        System.out.println("Игра Крестики-нолики с компьютером.");
//        Инициализируем игровое поле
        initMap();
//        Отрисовка поля
        printMap();
//        Начало игры
        while (true){
            // Ход первого игрока
            humanTurn();
            // Проверка на победу
            if (checkWin(DOT_X)){
                System.out.println("Вы победили!");
                break;
            }
            // Проверка на ничью
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            // Ход компьютера
            aiTurn();
            // Проверка на победу
            if (checkWin(DOT_O)){
                System.out.println("Победил компьютер!");
                break;
            }
            // Проверка на ничью
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
        }
    }

//    Метод для инициализации игрового поля
    public static void initMap(){
//        Создаём двумерный массив
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

//    Метод для отрисовки игрового поля
    public static void printMap(){
//        Создаём шапку
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
//        Отрисовка самого поля
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

//    Метод - игрок 1 начинает свой ход
    public static void humanTurn(){
        int x; // Координата x
        int y; // Координата y
        do {
            System.out.println("Введите координаты вида X Y\n" +
                    "Введите координату X:");
            checkNumber();
            x = scanner.nextInt() - 1;
            System.out.println("Введите координату Y:");
            checkNumber();
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
        printMap();
    }

//    Метод - компьютер начинает свой ход
    public static void aiTurn(){
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
        System.out.println("Компьютер совершил ход в точку с коорднатами: " + (x + 1) + " и " + (y + 1));
        printMap();
    }

//    Метод для проверки, что место не занято и не выходит за пределы поля
    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

//    Метод - проверка на ничью
    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

//    Метод - определение победителя
    public static boolean checkWin(char symb){
//        Проверка по строчкам и столбцам
        for (int i = 0; i < SIZE; i++){
            int count_DOT = 0; // для строки
            int count_DOT_O = 0; // для столбца
            int j = 0;
            for (; j < SIZE; j++){
                if (map[i][j] == symb){
                    count_DOT ++;
                }
                if (map[j][i] == symb){
                    count_DOT_O ++;
                }
            }
            if (count_DOT == DOTS_TO_WIN){
                return true;
            }
            if (count_DOT_O == DOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

//    Метод для проверки, что пользователь ввёл именно число
    public static void checkNumber(){
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Вы ввели не число!");
        }
    }
}
