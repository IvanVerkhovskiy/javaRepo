package book.java.com.Java2Lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Барсик"), new Dog("Шарик", "Белый")};
//        Перебор массива
        for(Animal animal : animals){
            if (animal instanceof Dog){
                System.out.println(((Dog) animal).getAbc());
            }
        }

        Animal[] animals1 = {new Cat("Петя"), new Cat("Вася")};
        for (Animal animal : animals1){
            animals1[1].name = "1213";
        }

        Cat cat343 = new Cat("Пуся");
        System.out.print("\"Пуся\"");
        System.out.println(cat343 instanceof Cat);

        System.out.println(animals1[1].name);
    }
}