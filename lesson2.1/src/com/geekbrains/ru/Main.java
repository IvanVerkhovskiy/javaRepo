package com.geekbrains.ru;

import com.geekbrains.ru.Obstruction.Racetrack;
import com.geekbrains.ru.Obstruction.Wall;
import com.geekbrains.ru.activity.Jump;
import com.geekbrains.ru.activity.Run;
import com.geekbrains.ru.person.Android;
import com.geekbrains.ru.person.Cat;
import com.geekbrains.ru.person.People;

public class Main {
    public static void main(String[] args){
        Object [] objects = {
                new People("Васька", 100, 10),
                new Cat("Барсик", 3, 12),
                new Android("EVA", 500, 502)
        };

        Object [] objects1 = {
                new Racetrack(10),
                new Wall(10),
                new Racetrack(10),
                new Wall(10),
                new Racetrack(10),
                new Wall(10)
        };

        for (int i = 0; i < objects.length; i++){
            boolean checkout = false;
            for (int j = 0; j < objects1.length; j++){
                if (objects1[j] instanceof Racetrack){
                    checkout = ((Run) objects[i]).run(objects1[j]);
                } else {
                    checkout = ((Jump) objects[i]).jump(objects1[j]);
                }
                if (!checkout){
                    break;
                }
            }
            System.out.println();
        }
    }
}
