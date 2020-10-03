package ru.geekbrains.lesson3;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int value = 1;

    public static void main(String[] args){
        // Вызов метод, если значение равно 1
        while (value == 1){
            playGame();
        }
        // Если значение равно 0, то выходим
        System.out.println("До свидания!");
    }

    // Метод, который вызывает игру
    public static void playGame(){
        System.out.println("Ваша задача угадать число.\n" +
                "Пожалуйста, введите задуманное число:");
        int step = 3; // уровень
        // Задумываем число от 0 до 9
        int random = (int)(Math.random() * 9);
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
                    System.out.println("Увы, но вы проиграли!");
                }
        }
        while(true){
            System.out.println("Вы хотите попробовать ещё раз?\n" +
                    "1 - Да\n" +
                    "0 - Нет");
            if (scanner.hasNextInt()){
                value = scanner.nextInt();
                if (value == 1 || value == 0){
                    break;
                } else {
                    System.out.println("Вы ввели не ту команду!");
                }
            } else {
                System.out.println("Вы ввели не число!");
                break;
            }
        }
    }
}