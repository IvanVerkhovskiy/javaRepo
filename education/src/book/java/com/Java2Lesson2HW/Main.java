package book.java.com.Java2Lesson2HW;

import java.util.Scanner;

public class Main {
    final static int SIZE_ARRAY = 4;
    static int sum = 0;
    public static void main(String[] args){
//        Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
//        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте размер двумерного массива:\n" +
                "a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        Object [][] array = new Object[a][b];
        valueArray(array); // Запускаем проверку
    }

//    Метод для отрисовки массива
    public static void printArray(Object [][] array){
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i][0]);
            for (int j = 0; j < array.length - 1; j++){
                System.out.print(" ");
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

//    Метод для проверки массива, что размер равен 4x4
//    заполнения массива данными
    public static void valueArray(Object[][] array){
        Scanner scanner = new Scanner(System.in);
        int random = 0; // отвечает за хранение рандомного значения
        int value = 0; // значение выбора пользователя
        String text;
        int number = 0; // число полученное из массива во время парсинга
        int [][] newArray = new int[SIZE_ARRAY][SIZE_ARRAY];
        char[] wordArray = {'A','B','C','D','E','F','G','H','M','N','X','Q', 'I', 'S', 'Z', 'P'};

        try {
            if (array.length != SIZE_ARRAY){
                throw new MyArraySizeException();
            }
            System.out.println("Как заполнить данные?\n" +
                    "1. Только числа\n" +
                    "2. Только буквы\n" +
                    "3. Числа и буквы");
            value = scanner.nextInt();
            switch (value){
                case 1:
                    for (int i = 0; i < array.length; i++){
                        random = (int)(Math.random() * 10);
                        array[i][i] = random;
                        for (int j = 0; j < array.length - 1; j++){
                            random = (int)(Math.random() * 10);
                            array[i][j] = random;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++){
                        random = (int)(Math.random() * wordArray.length);
                        array[i][i] = wordArray[random];
                        for (int j = 0; j < array.length - 1; j++){
                            random = (int)(Math.random() * wordArray.length);
                            array[i][j] = wordArray[random];
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < array.length; i++){
                        for (int j = 0; j < array.length - 1; j++){
                            random = (int)(Math.random() * 2);
                            if (random == 0){
                                random = (int)(Math.random() * 10);
                                array[i][j] = random;
                            } else {
                                random = (int)(Math.random() * wordArray.length);
                                array[i][j] = wordArray[random];
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Команда не выбрана!");
                    System.exit(-1);
            }
            printArray(array); // Отображаем массив

            // Посчитать сумму
            for (int i = 0; i < array.length; i ++){
                sum = sum + (Integer) array[i][0];
                for (int j = 0; j < array.length - 1; j ++){
                    sum = sum + (Integer) array[i][j];
                }
            }
            System.out.println("Сумма чисел = " + sum);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }
}