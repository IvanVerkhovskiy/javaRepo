package com.codewars.ru;

public class Main {
    public static void main(String[] args) {
        /*
            Определите функцию, которая принимает один целочисленный
            аргумент и возвращает логическое значение true или false
            в зависимости от того, является ли целое число простым.
         */
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(73));
        System.out.println(isPrime(75));
        System.out.println(isPrime(-1));

        System.out.println("");

        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
        System.out.println(isPrime(41));
        System.out.println(isPrime(5099));

        System.out.println("");

        System.out.println(isPrime(4));
        System.out.println(isPrime(6));
        System.out.println(isPrime(8));
        System.out.println(isPrime(9));
        System.out.println(isPrime(45));
        System.out.println(isPrime(-5));
        System.out.println(isPrime(-8));
        System.out.println(isPrime(-41));
        System.out.println(isPrime(77));

        System.out.println(Math.sqrt(75));

//        System.out.println(isPrime(157));
    }

    public static boolean isPrime(int num) {
        int count = 0;
        int value = (int) (Math.ceil(Math.sqrt(num)));
        if (num == 1 || num <= 0){
            return false;
        } else {
            if (num == 2){
                return true;
            } else{
                for (int i = 2; i <= value; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
            }
        }
        if (count == 0){
            return true;
        }
        return false;
    }
}


/*
public class Prime {
  public static boolean isPrime(int num) {
            int count = 0;
        for (int i = 1; i <= num; i++){
            if ((num % i) == 0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }
        return false;
  }
}
 */