package ru.geekbrains.lesson1;

import java.util.Scanner;

public class Main {
    //    Задание 1
    public static void main(String [] args){
//        Задание 2 (создать переменные всех пройденных типов данных)
//        Целочисленные
        byte numberByte = 1;
        short numberShort = 11;
        int numberInt = 14;
        long numberLong = 761534L;
//        С плавающей точкой
        float numberFloat = 10.1F;
        double numberDouble = 10.9992;
//        Символьные
        char textChar = 'G';
//        Логические
        boolean myCat = false;

        // Создадим scanner, для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Задание 3
        System.out.println("Задание номер 3.\n" +
                "Найдем результат выражения a * (b + (c / d)):");
        System.out.println("Введите значение a: ");
        double a = scanner.nextInt();
        System.out.println("Введите значение b: ");
        double b = scanner.nextInt();
        System.out.println("Введите значение c: ");
        double c = scanner.nextInt();
        System.out.println("Введите значение d: ");
        double d = scanner.nextInt();
//        Условие, при котором мы вызываем наш метод
        if (d != 0){
            System.out.println("Результат выражения = " + searchExpression(a, b, c, d));
        } else {
            System.out.println("Деление на 0 запрещено!");
        }

//      Отступ
        System.out.println("");

//        Задание 4
        System.out.println("Задание номер 4.\n" +
                "Проверить, что сумма двух чисел лежит в пределах от 10 до 20 (включительно)");
        System.out.println("Пожалуйста, введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число: ");
        int numberTwo = scanner.nextInt();
        System.out.println(checkSum(numberOne, numberTwo));

//      Отступ
        System.out.println("");

//        Задание 5
        System.out.println("Задание номер 5.\n" +
                "Пожалуйста, введите любое целое число:");
        int number = scanner.nextInt();
        checkNumber(number);

//      Отступ
        System.out.println("");

//        Задание 6
        System.out.println("Задание номер 6.\n" +
                "Пожалуйста, введите любое целое число:");
        number = scanner.nextInt();
        System.out.println(checkNegativeNumber(number));


//      Отступ
        System.out.println("");

//        Задание 7
        System.out.println("Задание номер 7.\n" +
                "Пожалуйста, введите своё имя:");
        Scanner scannerLine = new Scanner(System.in);
        String name = scannerLine.nextLine();
        sayHello(name);

//      Отступ
        System.out.println("");

//        Задание 8
        System.out.println("Введите год, мы сможем определить високосный он или нет");
        int year = scanner.nextInt();

        years(year);
        scanner.close();
        scannerLine.close();
    }

    //    Задание 3
    static double searchExpression(double a, double b, double c, double d){
        double result = 0;
        result = a * (b + (c / d));
        return result;
    }

    //    Задание 4
    static boolean checkSum(int a, int b){
        int sum = 0;
        sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
    }

    //    Задание 5
    static void checkNumber(int a){
        if (a >= 0){
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    //    Задание 6
    static boolean checkNegativeNumber(int a){
        if (a >= 0){
            return false;
        } else {
            return true;
        }
    }

    //    Задание 7
    static void sayHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    //    Задание 8
    static void years(int a){
        if (a % 4 == 0) {
            if (a % 100 == 0){
                if (a % 400 == 0){
                    System.out.println("Год високосный!");
                } else {
                    System.out.println("Год обычный!");
                }
            } else {
                System.out.println("Год високосный!");
            }
        } else {
            System.out.println("Год обычный!");
        }
    }
}