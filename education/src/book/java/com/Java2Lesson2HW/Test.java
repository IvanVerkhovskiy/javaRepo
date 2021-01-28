package book.java.com.Java2Lesson2HW;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        String text = "0";
        int value;
        checkString(text);
    }

    public static void checkString(String string) {
        try {
            Integer.parseInt(string);
            System.out.println("Отлично!");
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}