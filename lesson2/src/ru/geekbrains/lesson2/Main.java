package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        Задание 1 - задать целочисленный массив
        System.out.println("Задание №1");
        int[] a = new int[10];
        a[0] = 1;
        a[1] = 1;
        a[2] = 0;
        a[3] = 0;
        a[4] = 1;
        a[5] = 0;
        a[6] = 1;
        a[7] = 1;
        a[8] = 0;
        a[9] = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == 1){
                a[i] = 0;
            } else {
                a[i] = 1;
            }
            // Результат
            System.out.print(a[i] + " ");
        }

//        Отступ
        System.out.println("");

//        Задание 2 - задать пустой целочисленный массив
        System.out.println("Задание №2");
        int [] b = new int[8];
        for (int i = 0; i < b.length; i++){
            b[i] = i * 3;
            System.out.print(b[i] + " ");
        }

//        Отступ
        System.out.println("");

//        Задание 3 - Задать массив, числа меньше 6 умножить на 2
        System.out.println("Задание №3");
        int [] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i ++){
            if (c[i] < 6){
                c[i] = c[i] * 2;
            }
            System.out.print(c[i] + " ");
        }

//        Отступ
        System.out.println("");
    }
}
