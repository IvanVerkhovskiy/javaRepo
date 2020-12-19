package book.java.com.Java2Lesson2.Exception;

public class Main {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int c = 0;
        int [] numberArr = {0, 1, 2, 3, 4, 5};

        try{
            for (int i = 1; i < numberArr[10]; i ++){
                c = a / i;
            }
        } catch (ArithmeticException e){
            System.out.println("Деление на 0 запрещено!");
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Вышли за предел массива");
            e.printStackTrace();
        }
    }
}