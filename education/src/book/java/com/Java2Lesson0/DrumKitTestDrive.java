package book.java.com.Java2Lesson0;

import java.util.Scanner;

public class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        if (d.snare == true){
            d.playSnare();
        }
        d.playTopHat();
    }
}