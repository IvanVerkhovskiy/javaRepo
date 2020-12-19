package book.java.com.Java2Lesson2.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try {
            readFile("/123.txt");
        } catch (FileNotFoundException e){
            System.out.println("Не найден путь или файл!");
            e.printStackTrace();
        }
    }

    private static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }
}
