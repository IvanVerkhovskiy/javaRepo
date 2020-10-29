package com.geekbrains.ru.person;

import com.geekbrains.ru.Obstruction.Racetrack;
import com.geekbrains.ru.Obstruction.Wall;
import com.geekbrains.ru.activity.Jump;
import com.geekbrains.ru.activity.Run;

public class Cat implements Run, Jump {
    String name;
    int height;
    int length;

    public Cat(String name, int height, int length){
        this.name = name;
        this.height = height;
        this.length = length;
    }

    @Override
    public boolean jump(Object object) {
        if (height >= ((Wall) object).getHeight()){
            System.out.println("Котик " + name + " перепрыгнул стену!");
            return true;
        } else {
            System.out.println("Увы, стена слишком большая!");
            return false;
        }
    }

    @Override
    public boolean run(Object object) {
        if (length >= ((Racetrack) object).getLength()){
            System.out.println("Котик " + name + " смог пробежать такое расстояние!");
            return true;
        } else {
            System.out.println("Увы, расстояние слишком большое!");
            return false;
        }
    }
}
