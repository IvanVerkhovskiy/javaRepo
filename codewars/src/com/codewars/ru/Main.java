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
        System.out.println();

        /*
            Возвращает количество (количество) гласных в заданной строке.
            Мы будем рассматривать a, e, i, o, u как гласные для этого ката (но не y).
            Входная строка будет состоять только из строчных букв и / или пробелов.
         */
        System.out.println("Task 2");
        System.out.println(checkVowels("abracadabra"));
        System.out.println();

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
        System.out.println();
//        System.out.println("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");


        /*
            Вам дадут слово. Ваша задача - вернуть средний символ слова.
            Если длина слова нечетная, верните средний символ.
            Если длина слова четная, вернуть 2 средних символа.
            #Примеры:
            Kata.getMiddle ("test") должен вернуть "es"
            Kata.getMiddle ("тестирование") должен вернуть "t"
            Kata.getMiddle ("средний") должен вернуть "дд"
            Kata.getMiddle ("A") должен вернуть "A"
         */
        System.out.println("Task 4");
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("A"));
        System.out.println(getMiddle("java"));
        System.out.println();

        /*
            В этом небольшом задании вам дается строка чисел, разделенных пробелами,
            и вы должны возвращать наибольшее и наименьшее числа.

            Пример:
            highAndLow ("1 2 3 4 5") // возвращаем "5 1"
            highAndLow ("1 2 -3 4 5") // возвращаем "5 -3"
            highAndLow ("1 9 3 4-5") // возвращаем "9-5"

            Заметки:
            Все числа действительны в формате Int32, их не нужно проверять.
            Во входной строке всегда будет хотя бы одно число.
            Строка вывода должна состоять из двух чисел, разделенных одним пробелом, при этом наибольшее число должно быть первым.
         */
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

//    Поиск минимального и максимального значения
    public static String highAndLow(String numbers){
        char [] textArray = numbers.toCharArray();
        String result;
        int number;
        int min = 0;
        int max = 0;
        int [] value = new int [textArray.length];
//        Перекладываем значения из символьного типа в числовой тип
        for (int i = 0; i < textArray.length; i++){
            number = Character.getNumericValue(textArray[i]);
            value[i] = number;
        }
        for (int i = 0; i < value.length; i++){
            if (min <= value[i]){
                max = value[i];
            } else {
                min = value[i];
            }
        }
        result = max + " " + min;
        return result;
    }

//    Поиск среднего символа в тексте
    public static String getMiddle(String word){
        char [] textArray = word.toCharArray(); // массив с буквами
        String newText = ""; // результат
        int value = textArray.length / 2;
        value = (int)(Math.ceil(value));
        if (textArray.length == 1){
            newText = newText + textArray[0];
        } else {
            if ((textArray.length%2 == 0)){
                newText = newText + textArray[value-1];
                newText = newText + textArray[value];
            } else {
                newText = newText + textArray[value];
            }
        }
        return newText;
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