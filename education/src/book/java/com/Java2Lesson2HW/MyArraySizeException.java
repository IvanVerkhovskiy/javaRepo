package book.java.com.Java2Lesson2HW;

public class MyArraySizeException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Массив не равен размеру 4х4!");
    }
}