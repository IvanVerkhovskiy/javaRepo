package com.codewars.ru;

public class Main {
    public static void main(String[] args) {
        /*
            Определите функцию, которая принимает один целочисленный
            аргумент и возвращает логическое значение true или false
            в зависимости от того, является ли целое число простым.
         */
        System.out.println("Task 1");
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));

        /*
            Возвращает количество (количество) гласных в заданной строке.
            Мы будем рассматривать a, e, i, o, u как гласные для этого ката (но не y).
            Входная строка будет состоять только из строчных букв и / или пробелов.
         */
        System.out.println("Task 2");
        System.out.println(checkVowels("abracadabra"));

        /*
            В приведенных ниже примерах показано, как написать функцию накопителя:
            Примеры:
            аккумулятор ("abcd") -> "A-Bb-Ccc-Dddd"
            аккумулятор ("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
            аккумулятор ("cwAt") -> "C-Ww-Aaa-Tttt"
            Параметр аккумулятора - это строка, которая включает только
            буквы от a..z и A..Z.
         */
        System.out.println("Task 3");
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("NyffsGeyylB"));
        System.out.println(accum("MjtkuBovqrU"));
        System.out.println(accum("EvidjUnokmM"));
        System.out.println(accum("HbideVbxncC"));
//        System.out.println("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
    }
//    Функция накопителя
    public static String accum(String s){
        char[] textArray = s.toCharArray(); // Передаём слово в массив
        char text;
        String newText = "";
        for (int i = 0; i < textArray.length; i++){
            for (int j = 0; j <= i; j++){
                if (j < 1){
                    text = Character.toUpperCase(textArray[i]);
                    newText = newText + text;
                } else {
                    if (Character.isUpperCase(textArray[i])){
                        text = Character.toLowerCase(textArray[i]);
                        newText = newText + text;
                    } else {
                        newText = newText + textArray[i];
                    }
                }
            }
            if (i < textArray.length - 1){
                newText = newText + "-";
            }
        }
        return newText;
    }

//    Подсчёт количества гласных букв
    public static int checkVowels(String text){
        int vowelsCount = 0;
        char[] arrayText = text.toCharArray();
        char[] vowels = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        for (int i = 0; i < arrayText.length; i++){
            for (int j = 0; j < vowels.length; j++){
                if (vowels[j] == arrayText[i]){
                    vowelsCount ++;
                }
            }
        }
        return vowelsCount;
    }

//    Нахождение простого или составного числа
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