package com.geekbrains.lesson6;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Шарик", "Белый", 3);
        dog.lengthRun = 500;
        dog.lengthSwim = 200;
        dog.height = 0.5;

        dog.limitLengthRun = 550;
        dog.limitLengthSwim = 200;
        dog.limitHeightJump = 1;

        Dog dog1 = new Dog("Бобик", "Коричневый", 3);
        dog1.lengthRun = 400;
        dog1.lengthSwim = 250;
        dog1.height = 1;

        dog1.limitLengthRun = 400;
        dog1.limitLengthSwim = 250;
        dog1.limitHeightJump = 1;

        Cat cat = new Cat("Дуся", "Серая", 4);
        cat.lengthRun = 95;
        cat.lengthSwim = 200;
        cat.height = 2;

        cat.limitLengthRun = 100;
        cat.limitLengthSwim = 200;
        cat.limitHeightJump = 3;

        Cat cat1 = new Cat("Мася", "Серая", 4);
        cat1.lengthRun = 100;
        cat1.lengthSwim = 200;
        cat1.height = 2;

        cat1.limitLengthRun = 100;
        cat1.limitLengthSwim = 200;
        cat1.limitHeightJump = 2;

        Animals [] animals = {dog, dog1, cat, cat1};
        for (int i = 0; i < animals.length; i ++){
            test(animals[i]);
        }
    }

//    Метод вызова
    public static void test(Animals animals){
        animals.toJump(animals.height, animals.limitHeightJump);
        animals.toRun(animals.lengthRun, animals.limitLengthRun);
        animals.toSwim(animals.lengthSwim, animals.limitLengthSwim);
        System.out.println();
    }
}