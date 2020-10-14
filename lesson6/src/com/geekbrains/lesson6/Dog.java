package com.geekbrains.lesson6;

public class Dog extends Animals {

    Dog(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    void toSwim(double lengthSwim, double limitLengthSwim) {
        if (lengthSwim <= limitLengthSwim){
            System.out.println("Плавание: " + name + " " + lengthSwim + " м." + " - " + action);
        } else {
            action = false;
            System.out.println("Плавание: " + name + " " + lengthSwim + " м." + " - " + action);
        }
    }
}