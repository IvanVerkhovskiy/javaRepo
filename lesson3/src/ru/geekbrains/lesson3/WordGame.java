package ru.geekbrains.lesson3;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        int wordsNumber = words.length - 1; // Получаем значение индекса
        int random = (int)(Math.random() * wordsNumber); // Получаем рандомное число
        String wordRandom = words[random]; // Полученное слово из массива передаём переменной
        String userAnswer = ""; // Переменная - ответ пользователя
        char userText; // Для посимвольного сравнения
        char randomText; // Для посимвольного сравнения

        // Игра
        while(!wordRandom.equals(userAnswer)){
            System.out.println("Введите задуманное слово:");
            userAnswer = scanner.nextLine();
            int userAnswerLength = userAnswer.length() - 1;
            int wordRandomLength = wordRandom.length() - 1;
            try {
                for (int i = 0; i <= wordRandomLength; i ++){
                    userText = userAnswer.charAt(i);
                    randomText = wordRandom.charAt(i);
                    if (userText == randomText){
                        System.out.print(userText);
                    } else {
                        System.out.print("*");
                    }
                }
            } catch (StringIndexOutOfBoundsException index){
                System.out.print("");
            }
            if (wordRandom.equals(userAnswer)){
                System.out.println("");
                System.out.println("Поздравляем! Вы угадали слово " + wordRandom + "!");
                break;
            } else {
                System.out.print("**********");
                System.out.println();
                System.out.println("Вы не угадали. Давайте попробуем ещё раз");
            }
        }
    }
}