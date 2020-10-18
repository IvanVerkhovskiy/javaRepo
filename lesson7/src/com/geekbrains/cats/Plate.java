package com.geekbrains.cats;

import java.util.Scanner;

public class Plate {

    static Scanner scanner = new Scanner(System.in);

    private int food;

    //    Конструктор
    public Plate(int food) {
        this.food = food;
    }

    //    Сокращаем еду, когда кот её ест
    public void decreaseFood(int n) {
        if ((food - n) >= 0) {
            food = food - n;
        } else {
            System.out.println("Еда почти закончилась! Необходимо добавить еды.");
        }
    }

    //    Добавляем порцию
    public static int addNewFood(int value, Cat[] cats) {
        int newFood = 0;
        if (value == 0) {
            for (int i = 0; i < cats.length; i++) {
                if (cats[i].getSatiety() == false) {
                    newFood = newFood + cats[i].getAppetite();
                }
            }
            return newFood;
        } else {
            System.out.println("Введите количество еды:");
            newFood = scanner.nextInt();
            return newFood;
        }
    }

    //    Информация по еде
    public void info() {
        System.out.println("Сейчас в тарелке: " + food);
    }

    //    Доступ к тарелке
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}