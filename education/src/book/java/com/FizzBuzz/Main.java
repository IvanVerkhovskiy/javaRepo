package book.java.com.FizzBuzz;

public class Main {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if (!check(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean check(int i){
        if (i % 15 == 0){
            System.out.println("FizzBuzz");
            return true;
        } else if (i % 5 == 0){
            System.out.println("Buzz");
            return true;
        } else if (i % 3 == 0){
            System.out.println("Fizz");
            return true;
        }
        return false;
    }
}