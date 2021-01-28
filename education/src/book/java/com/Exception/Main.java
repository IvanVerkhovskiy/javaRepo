package book.java.com.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        try {
            if (b == 0){
                throw new MyException();
            } else {
                c = a / b;
                System.out.println("a / b = " + c);
            }
        } catch (MyException e){
            e.printStackTrace();
        }
    }
}
