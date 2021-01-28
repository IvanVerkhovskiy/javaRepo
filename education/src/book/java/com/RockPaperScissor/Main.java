package book.java.com.RockPaperScissor;

import java.util.Scanner;

public class Main {
    // Начать игру?
    public static int value;
    // Начинаем игру?
    public static boolean startGame = true;
    // Считываем данные
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Chip chip = new Chip();
        System.out.println("Вы готовы начать игру?\n" +
                "1 - Да\n" +
                "2 - Нет (или любое другое значение)");
        value = scanner.nextInt();
        if (value == 1){
            while(startGame){
                System.out.println("Сейчас ваш ход!");
                System.out.println("Пожалуйста, выберите фишку:");
                chip.visibilityGameChip();
                chip.setPeopleChip(choiceChip());

                System.out.println("Сейчас ходит компьютер!");
                int random = (int)(Math.random() * (chip.getGameChipLength())); // генерирует число в рамках массива с фишками
                chip.setComputerChip(random);
                startGame = chip.whoWin(chip.getPeopleChip(), chip.getComputerChip());
            }
        } else {
            System.out.println("До свидания!");
        }
    }

    // Выбор фишки
    public static int choiceChip(){
        int a;
        a = scanner.nextInt() - 1;
        return a;
    }
}