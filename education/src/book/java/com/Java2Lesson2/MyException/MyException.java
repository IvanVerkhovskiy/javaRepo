package book.java.com.Java2Lesson2.MyException;

public class MyException extends ArithmeticException{
    @Override
    public void printStackTrace() {
        System.out.println("ОШИБКА!");
    }
}