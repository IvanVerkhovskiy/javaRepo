package book.java.com.Java2Lesson1.person;

import book.java.com.Java2Lesson1.activity.Action;
import book.java.com.Java2Lesson1.obstruction.RunningTrack;

public class Android implements Action {
    private String name;
    private int length;

    public Android(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String getName(){
        return name;
    }

    public int getLength(){
        return length;
    }

    //    Метод прыгать
    public boolean jump(Object object){
        System.out.println(name + " прыгнул!");
        return true;
    }

    //    Метод бежать
    public boolean run(Object object){
        if (length >= ((RunningTrack)object).getLength()){
            System.out.println(name + " смог пробежать!");
            return true;
        } else {
            System.out.println(name + " не смог пробежать!");
            return false;
        }
    }
}