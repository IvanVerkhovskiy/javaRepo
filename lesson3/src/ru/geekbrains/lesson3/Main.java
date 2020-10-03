package ru.geekbrains.lesson3;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int value = 1;

    public static void main(String[] args){
        int level;
        // Вызов игры, если значение равно 1
        while (value == 1){
            System.out.println("Ваша задача угадать число.\nКакой уровень сложности вы хотите выбрать?\n" +
                    "1. От 0 до 9 (3 попытки)\n" +
                    "2. От 0 до 50 (5 попыток)\n" +
                    "3. От 0 до 100 (7 попыток)");

            checkNumber();

            level = scanner.nextInt();
            switch (level){
                case 1:
                    if (level == 1){
                        playGame(9, 3);
                    }
                    break;
                case 2:
                    if (level == 2){
                        playGame(50, 5);
                    }
                    break;
                case 3:
                    if (level == 3){
                        playGame(100, 7);
                    }
                    break;
                default:
                    playGame(9, 3);
            }
        }
        // Если значение равно 0, то выходим
        System.out.println("До свидания!");
    }

    // Метод, который вызывает игру
    public static void playGame(int level, int step){
        System.out.println("Пожалуйста, введите задуманное число от 0 до " + level + ":");
        // Задумываем число от 0 до 9, 50 или 100
        int random = (int)(Math.random() * level);

//        Проверка на ввод числа
        checkNumber();

//        Основная часть игры
        while (step != 0){
            int userNumber = scanner.nextInt(); // Пользователь вводит число
            if (userNumber == random){
                System.out.println("Вы угадали! Задуманное число:" + random);
                break;
            } else if (userNumber > random){
                System.out.println("Задуманное число меньше!");
            } else {
                System.out.println("Задуманное число больше!");
            }
            step--;
            System.out.println("У вас осталось " + step + " попытки");
            if (step == 0){
                System.out.println("Увы, но вы проиграли! Задуманное число: " + random);
            }
        }
        newGame(); // Метод, который спрашивает, продолжить игру?
    }

    public static void newGame(){
        System.out.println("Вы хотите попробовать ещё раз?\n" +
                "1 - Да\n" +
                "0 - Нет");

        checkNumber();

        while (true){
            value = scanner.nextInt();
            if (value == 1 || value == 0){
                break;
            } else {
                System.out.println("Вы ввели не ту команду!");
            }
        }
    }

//    Метод для проверки ввода чисел
    public static void checkNumber() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Вы ввели не число! Пожалуйста, попробуйте снова.");
        }
    }
}