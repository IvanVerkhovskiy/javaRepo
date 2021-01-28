package book.java.com.Java2Lesson2HW;

public class MyArrayDataException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("В ячейках обноружены символы!");
    }
}
