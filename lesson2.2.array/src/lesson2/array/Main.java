package lesson2.array;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
      /*
        Требуется написать метод, принимающий на вход размеры двумерного массива
        и выводящий массив в виде инкременированной цепочки чисел, идущих по спирали
        против часовой стрелки.
        1 6
        2 5
        3 4
      */
        System.out.println("Введите размер двумерного массива:\n" +
                "Введите i:");
        checkNumber();
        int i = scanner.nextInt();
        System.out.println("Введите j:");
        checkNumber();
        int j = scanner.nextInt();
        int [][] array = new int[i][j];
    }

//    Метод для проврки, что пользователь ввёл именно число
    public static void checkNumber(){
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Введено не число!");
        }
    }

//    Метод - заполняем массив значениями спиралью
    public static void completionArray(int [][] array){
        
    }
}