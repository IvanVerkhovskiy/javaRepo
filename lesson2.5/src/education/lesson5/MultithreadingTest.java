package education.lesson5;

import java.util.Arrays;

public class MultithreadingTest {

    static final int size = 10000000;
    static final int f = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) throws InterruptedException {

        MultithreadingTest test = new MultithreadingTest();

        test.methodOne();
        test.methodTwo();

    }

    public void methodOne() {
        long a = System.currentTimeMillis();

        Arrays.fill(arr, 1);

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Первый поток: " + (System.currentTimeMillis() - a) + " мс");

    }

    private void methodTwo() throws InterruptedException {
        long a = System.currentTimeMillis();

        Arrays.fill(arr, 1);

        float[] number1 = new float[f];
        float[] number2 = new float[f];

        System.arraycopy(arr, 0, number1, 0, f);
        System.arraycopy(arr, f, number2, 0, f);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < f; i++) {
                number1[i] = (float) (number1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < f; i++) {
                number2[i] = (float) (number2[i] * Math.sin(0.2f + (i + f) / 5) * Math.cos(0.2f + (i + f) / 5) * Math.cos(0.4f + (i + f) / 2));
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.arraycopy(number1, 0, arr, 0, f);
        System.arraycopy(number2, 0, arr, f, f);
        System.out.println("Второй поток: " + (System.currentTimeMillis() - a) + " мс");
    }
}
