package education.lesson2;

import java.util.Random;

public class NewArray {

//    Размер массива
    int x = 5;
    int y = 5;
//    Для генерации рандомных значений
    Random random = new Random();

//    Метод
    public void checkArray() {

        int sum = 0;
        String arr[][] = new String[x][y];

        if (x != 4 || y != 4) {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.err.println("Массив не равен размеру 4 на 4\n" +
                        "Размер входящего массива равен " + x + " на " + y);
            }
        }

//        Заполняем массив + делаем проверку
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int randomValue = random.nextInt(9);
                String newRandomValue = String.valueOf(randomValue); // Переводим int в String
                arr[i][j] = newRandomValue;
                arr[1][2] = "Д";
                System.out.print(arr[i][j]);
                System.out.print(" ");
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.err.println("Входные значения не верны! Ячейка с координатами " + (i + 1) + " " + (j + 1) + " содержит не верное значение - " + arr[i][j]);
                    System.out.println();
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}