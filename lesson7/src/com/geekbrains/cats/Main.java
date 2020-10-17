package com.geekbrains.cats;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in); // Ввод данных для цифр
    static int value = 0; // Выбор
    static int valueCat = 0; // Количество котов
    static int valueFood = 0; // Количество еды
    static int count = 0; // Счётчик

    public static void main(String[] args) {
//        Создаём наших котиков
        System.out.println("Сколько у вас котов?");
        checkValue(); // Проверка на число
        valueCat = scanner.nextInt(); // Вводим количество котов
//        Создаём котиков
        Cat[] cats = new Cat[valueCat];
//        Заполняем данными
        System.out.println("Пожалуйста, заполните данные котиков:\n" +
                "1. Заполнить автоматически\n" +
                "2. Заполнить самому");
        checkValue(); // Проверка на число
        value = scanner.nextInt();
        switch (value) {
            case 1:
                // Метод автоматического заполнения данных котов
                Cat.generateCats(cats);
                break;
            case 2:
                // Метод для ручного ввода данных
                Cat.dataCats(cats);
                break;
            default:
                System.out.println("Вы не выбрали команду, данные будут сгенерированы автоматически!");
                Cat.generateCats(cats);
        }
//        Выводим информацию по котикам
        Cat.getInformationForCats(cats);
//        Создаём тарелку с едой
        System.out.println("Сколько корма вы хотите насыпать?");
        checkValue(); // Проверка на число
        valueFood = scanner.nextInt();
        Plate plate = new Plate(valueFood);
//        Выводим информацию по тарелке
        plate.info();
        System.out.println();
//        Кошки начинают кушать
        Cat.eat(plate, cats);
    }

    //    Метод для проверки, что пользователь ввёл число
    public static void checkValue() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Вы ввели не число!");
        }
    }
}