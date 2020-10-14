package com.geekbrains.lesson6;

public class Cat extends Animals {
    Cat(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    void toSwim(double lengthSwim, double limitLengthSwim) {
        action = false;
        System.out.println("Плавание: " + name + " " + lengthSwim + " м." + " - " + action + "\n" +
                name + " - кошка, кошка не умеет плавать");
    }
}