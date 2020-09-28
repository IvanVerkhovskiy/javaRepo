package ru.geekbrains.lesson2;

public class Main {
    public static void main(String[] args){
        // Задание 1 - задать целочисленный массив
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
            System.out.println(a[i]);
        }
    }
}
