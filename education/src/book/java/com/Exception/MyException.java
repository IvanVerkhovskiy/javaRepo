package book.java.com.Exception;

public class MyException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Деление на 0 запрещено! Исправьте данные!");
    }
}