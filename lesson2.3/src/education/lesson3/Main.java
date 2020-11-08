package education.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        2. Найти и вывести список уникальных слов, из которых состоит массив
        (дубликаты не считаем).
        3. Посчитать сколько раз встречается каждое слово.\
         */

        ArrayList<String> word = new ArrayList<>(); // исходный массив
        ArrayList<String> newWord = new ArrayList<>(); // новый массив
        int count = 0; // счётчик

        word.add("car");
        word.add("bread");
        word.add("car");
        word.add("beacon");
        word.add("left");
        word.add("машина");
        word.add("колонка");
        word.add("color");
        word.add("машина");
        word.add("green");
        word.add("небо");
        word.add("принтер");
        word.add("car");
        word.add("ложка");
        word.add("питание");

        System.out.println("Первый вариант домашнего задания (выводит только уникальные слова):");
        for (int i = 0; i < word.size(); i++){
            for (int j = 0; j < word.size(); j++){
                if (word.get(i).equals(word.get(j))){
                    count++;
                }
            }
            if (count == 1){
                newWord.add(word.get(i));
            }
            System.out.println("Слово " + word.get(i) + " встречается " + count + " раз/а.");
            count = 0;
        }
        System.out.println();
        System.out.println(newWord);
        System.out.println();
        System.out.println("Второй вариант домашнего задания (выводит все слова без дублирования):");
        System.out.println();

        String [] wordArray = new String[word.size()];
        word.toArray(wordArray);

        Set<String> set = new LinkedHashSet<String>();

        Collections.addAll(set, wordArray);

        System.out.println(Arrays.toString(set.toArray()));
    }
}