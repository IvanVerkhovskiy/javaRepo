package book.java.com.Java2Lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("Васька");
        Cat cat2 = new Cat("Петька");
        cat.setAge(-10);
        cat2.setAge(4);
        cat.getInformationForCat();
        cat2.getInformationForCat();
    }
}