package book.java.com.Java2Lesson3HW;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать сколько раз встречается каждое слово.
        System.out.println("Задание 1");
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

        //Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
        // телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
        // С помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.
        System.out.println();
        System.out.println("Задание 2");
        HashMap<String, String> peopleDB = new HashMap<>();
        add(peopleDB);
        get(peopleDB, "Петров");
        get(peopleDB, "Кутев");
        get(peopleDB, "Сушов");
    }

    // Добавление пользователей
    public static void add(HashMap<String, String> peopleDB){
        peopleDB.put("8-999-982-90-22","Петров");
        peopleDB.put("8-000-121-32-32","Веселов" );
        peopleDB.put("7-342-564-23-66","Кутев") ;
        peopleDB.put("8-000-222-33-44","Володин");
        peopleDB.put("8-999-333-33-00","Петров");
        peopleDB.put("9-454-454-23-23","Сушов");
        peopleDB.put("9-345-234-33-44","Луронов");
        peopleDB.put("8-999-999-99-99","Луронов");
    }

    // Поиск пользователей
    public static void get(HashMap<String, String> peopleSearch, String name){
        String value;
        for (Map.Entry<String, String> map : peopleSearch.entrySet()) {
            value = map.getValue();
            if (value.equals(name)){
                System.out.println(map.getKey() + " " + map.getValue());
            }
        }
    }
}