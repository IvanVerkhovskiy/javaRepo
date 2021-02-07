package book.java.com.Java2Lesson3;

import java.text.MessageFormat;
import java.util.*;

public class Main{
    public static void main(String[] args){
//        testArrayList();
//        testLinkedList();
//        testMap();
        testSet();
    }

    public static void testSet(){
        Set<String> set = new LinkedHashSet<>();
        set.add("A");
        set.add("C");
        set.add("A");
        set.add("V");
        set.add("B");
        System.out.println(set);
    }

    public static void testMap(){
        Map<String, String> map = new HashMap<>();
        map.put("Москва", "Россия");
        map.put("Берлин", "Германия");
        map.put("Минск", "Беларусь");
        map.put("Париж", "Франция");

        List<String> keys = new ArrayList<>(map.keySet());
//        System.out.println(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(MessageFormat.format("Страна: {0}, столица: {1}", entry.getKey(), entry.getValue()));
        }
    }

    public static void testLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedListInteger = new LinkedList<>();

        linkedList.add("Петя");
        linkedList.add("Вася");
        linkedList.add("Пупкин");
        linkedList.add("Пупкин");
        linkedList.addFirst("Барсик");
        Collections.sort(linkedList);
        System.out.println(linkedList);

        linkedListInteger.add(1);
        linkedListInteger.add(5);
        linkedListInteger.add(2);
        linkedListInteger.add(8);
        linkedListInteger.add(7);
        linkedListInteger.add(3);
        Collections.sort(linkedListInteger);
        System.out.println(linkedListInteger);
    }

    public static void testArrayList(){
        ArrayList<String> arrayList = new ArrayList<>(30);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(0, "B");
        System.out.println("Значение элемента индекса 2 = " + arrayList.get(2));
        System.out.println("Количество элементов = " + arrayList.size());
        System.out.println(arrayList);
        // arrayList.remove(0); // Удаляем элемент
        System.out.println(arrayList);
        System.out.println();

        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println();

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void sortArrayList(){

    }
}