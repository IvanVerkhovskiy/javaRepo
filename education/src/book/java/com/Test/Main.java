package book.java.com.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String newName;
        for (int i = 0; i < 5; i++){
            System.out.println("Введите имя:");
            newName = scanner.nextLine();
            addName(name, newName);
        }
        System.out.println(name);
        String[] newArray = new String[name.size()];
        name.toArray(newArray);
        System.out.println(newArray[1]);

        /***************/

        HashMap<String, String> hm = new HashMap<>();
        hm.put("Russia", "Moscow");
        hm.put("France", "Paris");
        hm.put("Germany", "Berlin");
        hm.put("Norway", "Oslo");
        for (Map.Entry<String, String> o : hm.entrySet()){
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }

    public static void addName(ArrayList<String> arrayList, String name){
        arrayList.add(name);
    }
}