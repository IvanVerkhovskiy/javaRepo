package book.java.com.Java2Lesson2.MyException;

public class Main {
    public static void main(String[] args){
        boolean a = false;
        try {
            if (!a){
                throw new MyException();
            }
            System.out.println("Всё хорошо!");
        } catch (MyException exception){
            exception.printStackTrace();
        }
    }
}