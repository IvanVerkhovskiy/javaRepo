package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Задание 1 - задать целочисленный массив
        System.out.println("Задание №1");
        inArr();

//        Отступ
        System.out.println("");

//        Задание 2 - задать пустой целочисленный массив
        System.out.println("Задание №2");
        fillArr();

//        Отступ
        System.out.println("");

//        Задание 3 - Задать массив, числа меньше 6 умножить на 2
        System.out.println("Задание №3");
        changeArr();

//        Отступ
        System.out.println("");

//        Задание 4 - Создать квадратный двумерный массив и заполнить его диагональные элементы единицами
        System.out.println("Задание №4");
        arrDiagonal();

//        Отступ
        System.out.println("");

//        Задание 5 - Найти максимальный и минимальный элемент в массиве
        System.out.println("Задание №5");
        int [] arrMinAndMax = new int[6];
        arrMinAndMax[0] = 90;
        arrMinAndMax[1] = 23;
        arrMinAndMax[2] = 111;
        arrMinAndMax[3] = 33;
        arrMinAndMax[4] = 222;
        arrMinAndMax[5] = 111;
        searchMinAndMaxArray(arrMinAndMax);

//        Отступ
        System.out.println("");

//        Задание 6
        System.out.println("Задание №6");
        int [] arrSum = new int[8];
        arrSum[0] = 2;
        arrSum[1] = 2;
        arrSum[2] = 2;
        arrSum[3] = 1;
        arrSum[4] = 2;
        arrSum[5] = 2;
        arrSum[6] = 10;
        arrSum[7] = 1;
        System.out.println(checkBalance(arrSum));

//        Отступ
        System.out.println("");

//        Задание 7
        System.out.println("Задание №7");
        Scanner scanner = new Scanner(System.in);
        int [] offsetArr = {3, 5, 6, 1};
        System.out.println("Исходный массив - " + Arrays.toString(offsetArr));
        System.out.println("Число n - сместить все элементы массива на n позиций:");
        int n = scanner.nextInt();
        newArr(offsetArr, n);
        scanner.close();
    }

    /*Метод для задания 1*/
    static void inArr(){
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++){
            if (a[i] == 1){
                a[i] = 0;
            } else {
                a[i] = 1;
            }
            // Результат
            System.out.print(a[i] + " ");
        }
    }

    /*Метод для задания 2*/
    static void fillArr(){
        int [] b = new int[8];
        for (int i = 0; i < b.length; i++){
            b[i] = i * 3;
            System.out.print(b[i] + " ");
        }
    }

    /*Метод для задания 3*/
    static void changeArr(){
        int [] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i ++){
            if (c[i] < 6){
                c[i] = c[i] * 2;
            }
            System.out.print(c[i] + " ");
        }
    }

    /*Метод для задания 4*/
    static void arrDiagonal(){
        int [][] squareArray = new int[8][8];
        for (int i = 0; i < squareArray.length; i++){
            for (int j = 0; j < squareArray.length; j++){
                if (i == j){
                    squareArray[i][j] = 1;
                }
                System.out.print(squareArray[i][j]);
            }
            System.out.println();
        }
    }

    /*Метод (задание 5) для поиска минимального значения в массиве*/
    static void searchMinAndMaxArray(int [] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= min){
                min = arr[i];
            }
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
    }

    /*Метод (задание 6) для сравнения суммы правой и левой части*/
    static boolean checkBalance(int[] arr){
        int sumLeft = 0; // Сумма левой части
        int sumRight = 0; // Сумма правой части
        int step = 1; // Разделитель
        boolean answer = false; // Ответ

        /*Решение*/
        while (step != arr.length){
            /*Ограничить левую часть и посчитать сумму*/
            for (int i = 0; i < arr.length - step; i++){
                sumLeft = sumLeft + arr[i];
            }
            /*Ограничить правую часть и посчитать суммы*/
            for (int j = arr.length - step; j < arr.length; j++){
                sumRight = sumRight + arr[j];
            }
            /*Сравним левую часть и правую*/
            if (sumLeft == sumRight){
                answer = true;
                break;
            }
            /*Обнуляем значения*/
            sumLeft = 0;
            sumRight = 0;
            step ++;
        }
        return answer;
    }

    /*Метод (задача 7) - сместить все элементы массива на n позиций*/
    static void newArr(int [] arr, int a){
        int step = 0; // шаг
        int value;
        if (a < 0){
            a = Math.abs(a); // Число по модулю
        }
        /*Цикл*/
        while(step != a){
            for (int i = arr.length - 1; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++){
                    value = arr[j];
                    arr[j] = arr[i];
                    arr[i] = value;
                }
            }
            step++;
        }
        System.out.println("Новый массив - " + Arrays.toString(arr));
    }
}