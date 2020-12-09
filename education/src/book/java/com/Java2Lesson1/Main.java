package book.java.com.Java2Lesson1;

import book.java.com.Java2Lesson1.obstruction.RunningTrack;
import book.java.com.Java2Lesson1.person.Cat;
import book.java.com.Java2Lesson1.person.People;

public class Main {
    public static void main(String[] args){

        boolean check = false;

        RunningTrack runningTrack = new RunningTrack(50);

        Object[] objects = {
                new People("Петя", 100),
                new People("Барсик", 90),
                new Cat("Кекс", 90)
        };

        Object[] objects1 = {
                new RunningTrack(100),
        };

        for (int i = 0; i < objects.length; i++){
            if (objects[i] instanceof People){
                check = ((People)objects[i]).run(objects1[0]);
            } else if (objects[i] instanceof Cat){
                check = ((Cat)objects[i]).run(objects1[0]);
            }
        }
    }
}
