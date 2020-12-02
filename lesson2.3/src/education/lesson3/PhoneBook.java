package education.lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<Integer, String> contacts = new HashMap<>();

    public void get(String search) {
        for (Map.Entry<Integer, String> pair : contacts.entrySet()) {
            if (search.equals(pair.getValue())) {
                System.out.println("Контакту " + search + " соответствует номер " + pair.getKey());
            }
        }
    }

    public void add(int number, String surname) {
        contacts.put(number, surname);
    }
}