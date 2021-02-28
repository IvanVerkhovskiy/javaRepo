package book.java.com.Java2Lesson3HW;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать сколько раз встречается каждое слово.
        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.add("car");
        arrayList.add("car");
        arrayList.add("dog");
        arrayList.add("fox");
        arrayList.add("apple");
        arrayList.add("orange");
        arrayList.add("apple");
        arrayList.add("cat");
        arrayList.add("man");
        arrayList.add("woman");
        arrayList.add("fox");
        arrayList.add("fly");
        arrayList.add("jump");
        arrayList.add("green");
        arrayList.add("computer");
        arrayList.add("game");
        arrayList.add("computer");
        arrayList.add("paper");
        arrayList.add("knife");
        arrayList.add("car");
        Set<String> set = new LinkedHashSet<>(arrayList);
//        for (String s : set) {
//            System.out.println(String.format("Object: %s (%d)", s, Collections.frequency(arrayList, s)));
//        }
        for (String newArray : arrayList){
            int count = 0;
            for (int i = 0; i < arrayList.size(); i++){
                if (newArray.equals(arrayList.get(i))){
                    count ++;
                }
            }
            System.out.println(newArray + " " + "(" + count + ")");
            count = 0;
        }
    }
}