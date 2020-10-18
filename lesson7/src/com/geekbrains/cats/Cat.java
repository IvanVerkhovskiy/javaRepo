package com.geekbrains.cats;

import java.util.Scanner;

public class Cat {

    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerLine = new Scanner(System.in);

    private String name; // Имя
    private int appetite; // Аппетит
    private boolean satiety; // Сытость

    //    Конструктор №1 для котика
    public Cat() {

    }

    //    Конструктор №2 для котика
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    //    Метод автоматического заполнения данных Котов
    public static void generateCats(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].setName("Котик " + (i + 1));
            cats[i].setAppetite((int) (Math.random() * 50));
            cats[i].setSatiety(false);
        }
    }

    //    Метод ручного заполнения данных Котов
    public static void dataCats(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            System.out.println("Введите имя котика № " + (i + 1) + ": ");
            cats[i].setName(scannerLine.nextLine());
            System.out.println("Введите аппетит котика " + cats[i].getName() + ":");
            cats[i].setAppetite(scanner.nextInt());
            cats[i].setSatiety(false);
        }
    }

    //    Метод - вывод информации по котикам
    public static void getInformationForCats(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Имя котика: " + cats[i].getName() + "\n" +
                    "Аппетит котика: " + cats[i].getAppetite() + "\n" +
                    "Котик наелся: " + cats[i].getSatiety());
            System.out.println();
        }
    }

    //    Кошка кушает
    public static void eat(Plate plate, Cat[] cats) {
        int count = 0; // счётчик
        int newFood;
        while (count != cats.length) {
            System.out.println("Котикам пора кушать.");
            System.out.println();
            for (int i = 0; i < cats.length; i++) {
                if ((cats[i].getSatiety() == false) && ((plate.getFood() - cats[i].getAppetite()) >= 0)) {
                    System.out.println("Кушает " + cats[i].getName());
                    plate.decreaseFood(cats[i].getAppetite());
                    cats[i].setSatiety(true);
                    System.out.println(cats[i].getName() + " поел/а.");
                    System.out.println();
                }
                count++;
            }
        }
        if (getHungryCat(cats) > 0) {
            for (int i = 0; i < cats.length; i++) {
                if (cats[i].getSatiety() == false) {
                    System.out.println("У вас есть голодные/ая кошки/а: " + cats[i].getName());
                }
            }
            plate.info();
            System.out.println("Нужно добавить еду:\n" +
                    "1. Добавить автоматическую порцию (порция будет подобрана так, что бы все голодные котики поели.)\n" +
                    "2. Добавить вручную");
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    newFood = Plate.addNewFood(0, cats);
                    break;
                case 2:
                    newFood = Plate.addNewFood(1, cats);
                    break;
                default:
                    System.out.println("Выбрано автоматическое добавление еды!");
                    newFood = Plate.addNewFood(0, cats);
            }
            plate.setFood(newFood);
            eat(plate, cats);
        }
    }

    //    Находим голодную кошку
    public static int getHungryCat(Cat[] cats) {
        int count = 0; // счётчик
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getSatiety() == false) {
                count++;
            }
        }
        return count;
    }

    //    Получаем данные по сытости кошки
    public boolean getSatiety() {
        return satiety;
    }

    //    Получаем данные по аппетиту
    public int getAppetite() {
        return appetite;
    }

    //    Получаем имя
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}