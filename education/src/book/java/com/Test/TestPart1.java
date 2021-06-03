package book.java.com.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPart1 {
    public static void main(String[] args){
        // Создать массив из 15 слов
        // Найти и вывести список уникальных слов - дубликаты не считать
        // Посчитать, сколько раз встречается каждое слово
//        ArrayList<String> arrayList = new ArrayList<>(15);
//        ArrayList<String> newArrayList = new ArrayList<>();
//        arrayList.add("машина");
//        arrayList.add("колонка");
//        arrayList.add("яблоко");
//        arrayList.add("птица");
//        arrayList.add("собака");
//        arrayList.add("машина");
//        arrayList.add("велосипед");
//        arrayList.add("дерево");
//        arrayList.add("птица");
//        arrayList.add("кот");
//        arrayList.add("мышь");
//        arrayList.add("человек");
//        arrayList.add("парта");
//        arrayList.add("солнце");
//        arrayList.add("солнце");
//        System.out.println(arrayList);
        String [] word = {"машина", "котел", "яблоко", "машина", "дерево", "колонка", "музей", "парта", "мышь", "часы", "мышь", "яблоко"};
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 0;
        System.out.println(Arrays.toString(word));
        for (int i = 0; i < word.length; i ++){
            for (int j = 0; j < word.length; j ++){
                if (word[i].equals(word[j])){
                    count++;
                }
            }
            if (count >= 2){
                arrayList.add(word[i]);
            }
            System.out.println(word[i] + ": " + count);
            count = 0;
        }
        System.out.println(arrayList);
    }
}