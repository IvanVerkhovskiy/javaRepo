package com.geekbrains.lesson6;

public abstract class Animals {
//    Поля
    String name; // Имя
    String color; // Цвет
    int age; // Возраст

    boolean action = true;

    //    Действия
    double lengthRun; // Длина бега
    double lengthSwim; // Длина плавания
    double height; // Высота

//    Ограничения
    double limitLengthRun;
    double limitLengthSwim;
    double limitHeightJump;

//    Конструктор
    Animals(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

//    Метод бежать
    void toRun(double lengthRun, double limitLengthRun){
        if (lengthRun <= limitLengthRun){
            System.out.println("Бег: " + name + " " + lengthRun + " м." + " - " + action);
        } else {
            action = false;
            System.out.println("Бег: " + name + " " + lengthRun + " м." + " - " + action);
        }
    }
//    Метод - прыжок
    void toJump(double height, double limitHeightJump){
        if (height <= limitHeightJump){
            System.out.println("Прыжок: " + name + " " + height + " м." + " - " + action);
        } else {
            action = false;
            System.out.println("Прыжок: " + name + " " + height + " м." + " - " + action);
        }
    }
//    Метод - плыть
    abstract void toSwim(double length, double limitLengthSwim);
}